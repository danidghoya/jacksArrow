package com.example.daniela1.jacksarrow;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class SettingsActivity extends AppCompatActivity {

    private String[] listOfObjects;
    private TypedArray images;
    private ImageView itemImage;
    //private Drawable myIcon = ContextCompat.getDrawable(this.getBaseContext(),R.drawable.baseball);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        listOfObjects = getResources().getStringArray(R.array.icon_options);
        images = getResources().obtainTypedArray(R.array.icon_options);
        //TextView spinnerHeader = (TextView) findViewById(R.id.);
        //itemImage = (ImageView) R.drawable.fox_05;
        final Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, listOfObjects);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);
        //spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        //{
        //    @Override
        //    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
        //    {
        //        itemImage.setImageResource(images.getResourceId(spinner.getSelectedItemPosition(), -1));
        //    }
        //}
    }
}
