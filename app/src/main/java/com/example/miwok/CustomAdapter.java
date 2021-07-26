package com.example.miwok;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Items> {
    private int mColorResource;

    public CustomAdapter(Context context, ArrayList<Items> items, int colorResource) {
        super(context, 0, items);
        mColorResource = colorResource;
    }

    @SuppressLint("WrongConstant")
    @RequiresApi(api = Build.VERSION_CODES.Q)
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View threeItemView = convertView;
        if (threeItemView == null) {
            threeItemView = LayoutInflater.from(getContext()).inflate(R.layout.three_item_view, parent, false);
        }
        Items currentItem = getItem(position);

       int color = ContextCompat.getColor(getContext(), mColorResource);

        GradientDrawable threeItemViewStyle = new GradientDrawable();
        threeItemViewStyle.setCornerRadius(150);
        threeItemViewStyle.setColor(color);
        //threeItemViewStyle.setStroke(2, Color.WHITE);
        //if (position % 2 == 0 )//&& hasImage(currentItem.getImageSourceId()))
        // threeItemView.findViewById(R.id.icon_image).setBackgroundColor(ContextCompat.getColor(getContext(),R.color.black));
        // else if (position % 2 != 0)// && hasImage(currentItem.getImageSourceId()))
        //threeItemView.findViewById(R.id.two_language_words).setBackgroundColor(color);

        threeItemView.findViewById(R.id.three_item_view).setBackground(threeItemViewStyle);


        TextView englishWord = (TextView) threeItemView.findViewById(R.id.english_words);
        englishWord.setText(currentItem.getEnglishWord());

        TextView miwokWord = (TextView) threeItemView.findViewById(R.id.miwok_words);
        miwokWord.setText(currentItem.getMiwokWord());

        if (hasImage(currentItem.getImageSourceId())) {
            ImageView iconImage = (ImageView) threeItemView.findViewById(R.id.icon_image);
            iconImage.setVisibility(View.VISIBLE);
            iconImage.setImageResource(currentItem.getImageSourceId());
        } else {
            ImageView iconImage = (ImageView) threeItemView.findViewById(R.id.icon_image);
            iconImage.setVisibility(View.GONE);
        }

        //int color= ContextCompat.getColor(getContext(),mColorResource);
        //threeItemView.setBackgroundResource(mColorResource);

        return threeItemView;


    }

    private boolean hasImage(int imageSourceId) {
        final int IMAGE_SOURCE_ID = 0;
        return imageSourceId != IMAGE_SOURCE_ID;
    }
}
