package com.example.seoulalarm;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class AlarmView extends LinearLayout {

    ImageView ivMon;
    ImageView ivTue;
    ImageView ivWed;
    ImageView ivThu;
    ImageView ivFri;
    ImageView ivSat;
    ImageView ivSun;
    TextView tvHour;
    TextView tvMinute;
    TextView tvNoon;

    public AlarmView(Context context) {
        super(context);

        init(context);
    }

    public AlarmView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    public void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        ivMon = findViewById(R.id.ivMon);
        ivTue = findViewById(R.id.ivTue);
        ivWed = findViewById(R.id.ivWed);
        ivThu = findViewById(R.id.ivThu);
        ivFri = findViewById(R.id.ivFri);
        ivSat = findViewById(R.id.ivSat);
        ivSun = findViewById(R.id.ivSun);

        tvHour = findViewById(R.id.tvHour);
        tvMinute = findViewById(R.id.tvMinute);
        tvNoon = findViewById(R.id.tvMinute);

    }

    public void setHour(int hour) {
        tvHour.setText(hour);
    }

    public void setMinute(int minute) {
        tvMinute.setText(minute);
    }

    public void setNoon(String noon) {
        tvNoon.setText(noon);
    }

}