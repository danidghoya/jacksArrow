# jacksArrow
App for COSC 150 that will help users find each other

//settings_activity page
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_settings"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    android:background="@color/colorPrimaryDark"
    tools:context="com.example.grayson.justsettingspage.Settings">


    <Spinner
        android:id="@+id/spinner1"
        android:entries="@array/icon_options"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@android:drawable/btn_dropdown"
        android:spinnerMode="dropdown"
        android:layout_alignParentTop="true"
        android:layout_alignParentRight="true"
        android:layout_alignParentEnd="true" />
    
</RelativeLayout>
//end of settings_activity page

//in strings xml
<resources>
    <string name="app_name">Settings</string>

    <string name="option_select">Choose objects</string>

    <string-array name="objects">
        <item>Fox</item>
        <item>Link</item>
        <item>Peach</item>
        <item>Pikachu</item>
        <item>Samus</item>
        <item>Sheik</item>
        <item>Pikmin</item>
        <item>Kirby</item>
        <item>Yoshi</item>
        <item>Luigi</item>
    </string-array>

    <integer-array name="icon_options">
        <item>@drawable/fox_05</item>
        <item>@drawable/link_02</item>
        <item>@drawable/peach_01</item>
        <item>@drawable/pikachu_01</item>
        <item>@drawable/samus_03</item>
        <item>@drawable/sheik_01</item>
        <item>@drawable/pikmin_01</item>
        <item>@drawable/kirby_01</item>
        <item>@drawable/yoshi_01</item>
        <item>@drawable/luigi_01</item>
    </integer-array>

</resources>
//end of in strings xml

//Settings activity
package com.example.grayson.justsettingspage;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.support.v4.content.ContextCompat;
import android.content.Context;

public class Settings extends AppCompatActivity
{

    private String[] listOfObjects;
    private TypedArray images;
    private ImageView itemImage;
    private Drawable myIcon = ContextCompat.getDrawable(this.getBaseContext(),R.drawable.fox_05);

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
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
}a
//end of setting activity
