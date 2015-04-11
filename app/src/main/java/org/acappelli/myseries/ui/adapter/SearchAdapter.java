package org.acappelli.myseries.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.acappelli.myseries.R;
import org.acappelli.myseries.bean.search.Content;
import org.acappelli.myseries.bean.search.Search;

/**
 * Created by andrea on 10/04/15.
 */
public class SearchAdapter extends BaseAdapter {

    Search mSearch;
    Context mContext;
    LayoutInflater mInflater;

    public SearchAdapter(Context context, Search search){
        mContext = context;
        mSearch = search;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mSearch.getContent().size();
    }

    @Override
    public Object getItem(int i) {
        return mSearch.getContent().get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.row_search, null);
        }
        ViewHolder holder = new ViewHolder();
        holder.image = (ImageView) convertView.findViewById(R.id.poster_image);
        holder.title = (TextView) convertView.findViewById(R.id.series_title);
        holder.year = (TextView) convertView.findViewById(R.id.series_year);

        Content item = (Content) getItem(i);

        Picasso.with(mContext)
                .load((String) item.getShow().getImages().getPoster().getThumb())
                .into(holder.image);

        holder.title.setText(item.getShow().getTitle());
        holder.year.setText(String.valueOf(item.getShow().getYear()));

        return convertView;
    }

    static class ViewHolder {
        ImageView image;
        TextView title, year;
    }
}
