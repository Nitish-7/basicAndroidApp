package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    MediaPlayer.OnCompletionListener mMediaCompletion = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(@org.jetbrains.annotations.NotNull MediaPlayer mediaPlayer) {
            mediaPlayer.release();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_list_view);

        ArrayList<Items> items = new ArrayList<Items>();

        items.add(new Items("one", "lutti", R.mipmap.one, R.raw.number_one));
        items.add(new Items("two", "otiiko", R.mipmap.two, R.raw.number_two));
        items.add(new Items("three", "tolookosu", R.mipmap.three, R.raw.number_three));
        items.add(new Items("four", "oyyisa", R.mipmap.four, R.raw.number_four));
        items.add(new Items("five", "massokka", R.mipmap.five, R.raw.number_five));
        items.add(new Items("six", "temmokka", R.mipmap.six, R.raw.number_six));
        items.add(new Items("seven", "kenekaku", R.mipmap.seven, R.raw.number_seven));
        items.add(new Items("eight", "kawinta", R.mipmap.eight, R.raw.number_eight));
        items.add(new Items("nine", "wo'e", R.mipmap.nine, R.raw.number_nine));


        ListView itemsListView = (ListView) findViewById(R.id.numbers_layout);
        CustomAdapter Adapter = new CustomAdapter(this, items, R.color.number_color);
        itemsListView.setAdapter(Adapter);
        itemsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer mediaPlayer = MediaPlayer.create(NumbersActivity.this, items.get(position).getMediaSourceId());

                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(mMediaCompletion);
            }
        });
    }

    private void releaseMediaSource() {

    }
}
