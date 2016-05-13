package com.example.tacademy.temp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongja94 on 2016-01-18.
 */
public class WeracItemAdapter extends BaseAdapter {
    List<WeracItem> items = new ArrayList<WeracItem>();

    public void add(WeracItem data) {
        items.add(data);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        WeracItemView view;
        if (convertView == null) {
            view = new WeracItemView(parent.getContext());
        } else {
            view = (WeracItemView)convertView;
        }
        view.setImageTextData(items.get(position));
        return view;
    }
}
