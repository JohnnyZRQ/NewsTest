package com.example.johnny.newstest.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.johnny.newstest.R;
import com.example.johnny.newstest.model.News;

import java.util.List;

/**
 * Created by Johnny on 2016/8/10.
 */

public class NewsAdapter extends ArrayAdapter<News> {
    private int resorceId;

    public NewsAdapter(Context context, int textViewResourceID, List<News> objects) {
        super(context,textViewResourceID, objects);
        this.resorceId = textViewResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        News news = getItem(position);
        View view;
        if (convertView ==null){
            view = LayoutInflater.from(getContext()).inflate(resorceId,null);
        }else {
            view = convertView;
        }
        TextView newsTitle = (TextView) view.findViewById(R.id.news_title);
        newsTitle.setText(news.getTitle());
        return view;
    }
}
