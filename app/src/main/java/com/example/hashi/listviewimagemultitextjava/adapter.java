package com.example.hashi.listviewimagemultitextjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hashi.listviewimagemultitextjava.model.DataItems;

import java.util.ArrayList;
import java.util.List;

public class adapter extends ArrayAdapter<DataItems>
{
    List<DataItems> mLists;
    LayoutInflater mLayoutInflater;

    public adapter(Context context, List<DataItems> objects) {
        super(context, R.layout.list_view, objects);

        mLists = objects;
        mLayoutInflater = LayoutInflater.from(context);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.list_view, parent, false);
        }

        TextView tvDisplay = convertView.findViewById(R.id.itemNameText);
        ImageView img = convertView.findViewById(R.id.imageView);

        DataItems lists = getItem(position);

        tvDisplay.setText(lists.getItemName());
        img.setImageResource(R.drawable.apple_pie);


        return convertView;
    }
}