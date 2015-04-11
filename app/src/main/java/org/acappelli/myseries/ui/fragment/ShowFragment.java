package org.acappelli.myseries.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import com.squareup.picasso.Picasso;

import org.acappelli.myseries.R;
import org.acappelli.myseries.bean.search.Search;
import org.acappelli.myseries.bean.show.Show;
import org.acappelli.myseries.ui.adapter.SearchAdapter;

/**
 * Created by andrea on 10/04/15.
 */
public class ShowFragment extends Fragment {

    View rootView;
    View loader;
    View container;
    ImageView image;
    TextView seriresDetail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_show, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        image = (ImageView) rootView.findViewById(R.id.show_image);
        seriresDetail = (TextView) rootView.findViewById(R.id.show_detail);

        loader = rootView.findViewById(R.id.loader);
        container = rootView.findViewById(R.id.view_container);

        String tvImdb = getArguments().getString("imdb");

        loader.setVisibility(View.VISIBLE);
        container.setVisibility(View.GONE);

        loadUI(tvImdb);
    }

    private void loadUI(String query) {
        Ion.with(getActivity())
                .load("https://api-v2launch.trakt.tv/shows/" + query)
                .addQuery("extended", "full,images")
                .addHeader("Content-Type", "application/json")
                .addHeader("trakt-api-version", "2")
                .addHeader("trakt-api-key", "efb290331117951aced39b580ef39a8f743c0372c674ccac30b9e8edbbbcf230")
                .asJsonObject()
                .setCallback(new FutureCallback<JsonObject>() {
                    @Override
                    public void onCompleted(Exception e, JsonObject result) {
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        Gson gson = gsonBuilder.create();
                        final Show response = gson.fromJson(result, Show.class);
                        Picasso.with(getActivity())
                                .load(response.getImages().getFanart().getThumb())
                                .into(image);

                        seriresDetail.setText(response.getOverview());
                        loader.setVisibility(View.GONE);
                        container.setVisibility(View.VISIBLE);
                    }
                });
    }
}
