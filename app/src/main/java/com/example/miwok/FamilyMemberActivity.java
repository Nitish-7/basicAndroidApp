package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMemberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_list_view);

        ArrayList<Items> items = new ArrayList<Items>();

        items.add(new Items("father", "әpә", R.drawable.family_father, R.raw.family_father));
        items.add(new Items("mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        items.add(new Items("son", "angsi", R.drawable.family_son, R.raw.family_son));
        items.add(new Items("daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        items.add(new Items("older brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        items.add(new Items("younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        items.add(new Items("older sister", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        items.add(new Items("younger sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        items.add(new Items("grandmother ", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        items.add(new Items("grandfather", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));


        ListView numbersLayout = (ListView) findViewById(R.id.numbers_layout);
        CustomAdapter Adapter = new CustomAdapter(this, items,R.color.family_color);
        numbersLayout.setAdapter(Adapter);
    }
}