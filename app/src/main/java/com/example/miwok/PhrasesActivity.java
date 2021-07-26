package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_list_view);

        ArrayList<Items> items = new ArrayList<Items>();

        items.add(new Items("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        items.add(new Items("What is your name?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        items.add(new Items("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        items.add(new Items("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        items.add(new Items("I’m feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        items.add(new Items("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        items.add(new Items("Yes, I’m coming.", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        items.add(new Items("I’m coming.", "әәnәm", R.raw.phrase_im_coming));
        items.add(new Items("Let’s go.", "yoowutis", R.raw.phrase_lets_go));
        items.add(new Items("Come here.", "әnni'nem", R.raw.phrase_come_here));


        ListView numbersLayout = (ListView) findViewById(R.id.numbers_layout);
        CustomAdapter Adapter = new CustomAdapter(this, items,R.color.phrases_color);
        numbersLayout.setAdapter(Adapter);
    }
}