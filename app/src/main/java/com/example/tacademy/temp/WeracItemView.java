package com.example.tacademy.temp;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dongja94 on 2016-01-18.
 */
public class WeracItemView extends FrameLayout {
    public WeracItemView(Context context) {
        super(context);
        init();
    }

    ImageView iconView;
    TextView titleView;
    TextView subtitleView;

    private void init() {
        inflate(getContext(), R.layout.view_werac, this);
        iconView = (ImageView)findViewById(R.id.image_icon);
        titleView = (TextView)findViewById(R.id.text_title);
        subtitleView = (TextView)findViewById(R.id.text_subtitle);
    }

    public void setImageTextData(WeracItem data) {
        iconView.setImageDrawable(data.icon);
        titleView.setText(data.title);
        subtitleView.setText(data.subtitle);
    }
}
