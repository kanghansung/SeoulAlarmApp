package com.example.seoulalarm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;



class AlarmAdapter extends BaseAdapter {
    ArrayList<AlarmItem> alarms = new ArrayList<AlarmItem>();

    Context context;

    @Override
    public int getCount() {
        return alarms.size();
    }

    @Override
    public Object getItem(int position) {
        return alarms.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        AlarmView view = new AlarmView(context);

        AlarmItem item = alarms.get(position);
        view.setHour(item.getHour());
        view.setMinute(item.getMinute());
        view.setNoon(item.getNoon());

        return view;
    }

    public void onClick(int position, AlarmItem item) {
        alarms.set(position, item);
    }

}