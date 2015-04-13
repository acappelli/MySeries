package org.acappelli.myseries.ui.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import org.acappelli.myseries.R;
import org.acappelli.myseries.bean.search.Search;
import org.acappelli.myseries.ui.ShowActivity;
import org.acappelli.myseries.ui.adapter.SearchAdapter;

public class SearchFragment extends Fragment {

    View rootView;

    View loader;
    EditText search;
    ListView searchList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_search, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        loader = rootView.findViewById(R.id.loader);

        search = (EditText) rootView.findViewById(R.id.search);
        searchList = (ListView) rootView.findViewById(R.id.search_list);

        search.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_SEARCH) {
                    searchSeries(search.getText().toString());
                    return true;
                }

                return false;
            }
        });

        loader.setVisibility(View.VISIBLE);
        searchList.setVisibility(View.GONE);
    }

    private void searchSeries(String query) {

        Ion.with(getActivity())
                .load("https://api-v2launch.trakt.tv/search")
                .addQuery("query", query)
                .addQuery("type", "show")
                .addHeader("Content-Type", "application/json")
                .addHeader("trakt-api-version", "2")
                .addHeader("trakt-api-key", "efb290331117951aced39b580ef39a8f743c0372c674ccac30b9e8edbbbcf230")
                .asJsonArray()
                .setCallback(new FutureCallback<JsonArray>() {
                    @Override
                    public void onCompleted(Exception e, JsonArray result) {
                        JsonObject object = new JsonObject();
                        object.add("content", result);
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        Gson gson = gsonBuilder.create();
                        final Search response = gson.fromJson(object, Search.class);
                        SearchAdapter searchAdapter = new SearchAdapter(getActivity(), response);
                        searchList.setAdapter(searchAdapter);
                        searchList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                Intent intent = new Intent(getActivity(), ShowActivity.class);
                                intent.putExtra("imdb", (String) response.getContent().get(i).getShow().getIds().getImdb());
                                startActivity(intent);
                            }
                        });
                        loader.setVisibility(View.GONE);
                        searchList.setVisibility(View.VISIBLE);
                    }
                });
    }
}
