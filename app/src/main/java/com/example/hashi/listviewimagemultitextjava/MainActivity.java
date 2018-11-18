package com.example.hashi.listviewimagemultitextjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.hashi.listviewimagemultitextjava.model.DataItems;
import com.example.hashi.listviewimagemultitextjava.sample.SampleDataProvider;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        List<DataItems> itemList = SampleDataProvider.mlist;
        List<String> nameList = new ArrayList<>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView ls = findViewById(R.id.list);

        for (DataItems list: itemList)
        {
            nameList.add(list.getItemName());
        }

        adapter adapter1 = new adapter(this, itemList);
        ls.setAdapter(adapter1);
    }
}
