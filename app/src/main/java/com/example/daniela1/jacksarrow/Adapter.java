package com.example.daniela1.jacksarrow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by daniela1 on 11/21/16.
 */

public class Adapter extends ArrayAdapter<String> {

    Context c;
    String[] objects;
    int[] icons;

    public Adapter(Context context, String[] objects, int[] icons) {
        super(context, R.layout.model, objects);
        this.c = context;
        this.objects = objects;
        this.icons = icons;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {

        if(convertView==null)
        {
            LayoutInflater inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.model, null);
        }

        TextView tV = (TextView) convertView.findViewById(R.id.textView2);
        ImageView iV = (ImageView) convertView.findViewById(R.id.imageView2);

        tV.setText(objects[position]);
        iV.setImageResource(icons[position]);

        return convertView;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null)
        {
            LayoutInflater inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.model, null);
        }

        TextView tV = (TextView) convertView.findViewById(R.id.textView2);
        ImageView iV = (ImageView) convertView.findViewById(R.id.imageView2);

        tV.setText(objects[position]);
        iV.setImageResource(icons[position]);

        return convertView;
    }
}
