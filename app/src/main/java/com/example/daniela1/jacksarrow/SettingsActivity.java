package com.example.daniela1.jacksarrow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    private Spinner spinner;
    private String[] listOfObjects;
    private int[] images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        listOfObjects = getResources().getStringArray(R.array.objects);
        images = getResources().getIntArray(R.array.icon_options);
        int[] images1 = {R.drawable.baseball, R.drawable.basketball, R.drawable.soccerball, R.drawable.pinkflower,
                   R.drawable.purpleflower, R.drawable.redflower, R.drawable.cat, R.drawable.dog, R.drawable.kitten, R.drawable.puppy};

        spinner = (Spinner) findViewById(R.id.spinner1);

        Adapter adapter = new Adapter(this, listOfObjects, images1);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), listOfObjects[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}
