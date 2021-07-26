package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_list_view);

        ArrayList<Items> items = new ArrayList<Items>();

        items.add(new Items("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));  // resource id is of integer type
        items.add(new Items("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        items.add(new Items("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        items.add(new Items("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        items.add(new Items("black","kululli", R.drawable.color_black, R.raw.color_black));
        items.add(new Items("white", "kelelli", R.drawable.color_white, R.raw.color_white));
        items.add(new Items("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        items.add(new Items("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));


        ListView numbersLayout = (ListView) findViewById(R.id.numbers_layout);
        CustomAdapter Adapter = new CustomAdapter(this, items,R.color.colors_color);
        numbersLayout.setAdapter(Adapter);
    }

}