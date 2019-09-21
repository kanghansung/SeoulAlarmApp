package com.example.seoulalarm;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class FragmentAlarm extends Fragment {

    View view;

    TextView tvEdit;
    TextView tvAlarm;
    TextView tvPlus;

    ListView listAlarm;

    AlarmAdapter adapter;
    AlarmAdapter adapter_delete;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_alarm, container, false);

        tvEdit = (TextView) getView().findViewById(R.id.tvEdit);
        tvAlarm = (TextView) getView().findViewById(R.id.tvAlarm);
        tvPlus = (TextView) getView().findViewById(R.id.tvPlus);

        listAlarm = (ListView) getView().findViewById(R.id.listAlarm);
        adapter = new AlarmAdapter();
        listAlarm.setAdapter(adapter);
        listAlarm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlarmItem item = (AlarmItem) adapter.getItem(position);

/*
                folder_name = tvMemoName.getText().toString();
                memo_title = memoNameItem.getTitle();

                Intent intent = new Intent(getApplicationContext(), MemoWriteActivity.class);
                intent.putExtra("folder_name", folder_name);
                intent.putExtra("memo_title", memo_title);
                intent.putExtra("click", "item");
                startActivity(intent);
*/
            }
        });


        return view;
    }




}


