package com.example.tacademy.temp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by Tacademy on 2016-05-12.
 */
public class AllViewFragment extends Fragment {

    public AllViewFragment() {
        // Required empty public constructor
    }
    GridView gridView;
    WeracItemAdapter mAdapter;

    int[] IDS = {R.drawable.gallery_photo_1,
            R.drawable.gallery_photo_2,
            R.drawable.gallery_photo_3,
            R.drawable.gallery_photo_4,
            R.drawable.gallery_photo_5,
            R.drawable.gallery_photo_6,
            R.drawable.gallery_photo_7,
            R.drawable.gallery_photo_8,
            R.drawable.gallery_photo_1,
            R.drawable.gallery_photo_2,
            R.drawable.gallery_photo_3,
            R.drawable.gallery_photo_4,
            R.drawable.gallery_photo_5,
            R.drawable.gallery_photo_6,
            R.drawable.gallery_photo_7,
            R.drawable.gallery_photo_8,
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_view_all, container, false);
        gridView = (GridView) view.findViewById(R.id.gridview);
        mAdapter = new WeracItemAdapter();
        gridView.setAdapter(mAdapter);

        initData();
        return view;
    }

    private void initData() {
        for (int i = 0; i < IDS.length; i++) {
            WeracItem data = new WeracItem();
            data.icon = getResources().getDrawable(IDS[i]);
            data.title = "title " + i;
            data.subtitle = "subtitle " + i;
            mAdapter.add(data);
        }
    }
}
