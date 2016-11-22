package com.example.daniela1.jacksarrow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IconActivity extends AppCompatActivity {

    int[] images1 = {R.drawable.baseball, R.drawable.basketball, R.drawable.soccerball, R.drawable.pinkflower,
            R.drawable.purpleflower, R.drawable.redflower, R.drawable.cat, R.drawable.dog, R.drawable.kitten, R.drawable.puppy};

    static int iconNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon);
    }

    public void baseballIconPressed (View view)
    {
        iconNum = 1;

        Intent mapIntent = new Intent(this, MapsActivity.class);
        startActivity(mapIntent);
    }

    public void basketballIconPressed (View view)
    {
        iconNum = 2;

        Intent mapIntent = new Intent(this, MapsActivity.class);
        startActivity(mapIntent);
    }

    public void soccerballIconPressed (View view)
    {
        iconNum = 3;

        Intent mapIntent = new Intent(this, MapsActivity.class);
        startActivity(mapIntent);
    }

    public void pinkflowerIconPressed (View view)
    {
        iconNum = 4;

        Intent mapIntent = new Intent(this, MapsActivity.class);
        startActivity(mapIntent);
    }

    public void purpleflowerIconPressed (View view)
    {
        iconNum = 5;

        Intent mapIntent = new Intent(this, MapsActivity.class);
        startActivity(mapIntent);
    }

    public void redflowerIconPressed (View view)
    {
        iconNum = 6;

        Intent mapIntent = new Intent(this, MapsActivity.class);
        startActivity(mapIntent);
    }

    public void catIconPressed (View view)
    {
        iconNum = 7;

        Intent mapIntent = new Intent(this, MapsActivity.class);
        startActivity(mapIntent);
    }

    public void dogIconPressed (View view)
    {
        iconNum = 8;

        Intent mapIntent = new Intent(this, MapsActivity.class);
        startActivity(mapIntent);
    }

    public void kittenIconPressed (View view)
    {
        iconNum = 9;

        Intent mapIntent = new Intent(this, MapsActivity.class);
        startActivity(mapIntent);
    }

    public void puppyIconPressed (View view)
    {
        iconNum = 10;

        Intent mapIntent = new Intent(this, MapsActivity.class);
        startActivity(mapIntent);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
