package com.example.jaipur;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class LocationAdapter extends ArrayAdapter<LocationImage> {
    private static final String LOG_TAG = LocationAdapter.class.getSimpleName();
    public LocationAdapter(Context context, ArrayList<LocationImage> words)
    {
        super(context, 0, words);
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_layout, parent, false);
        }
        LocationImage currentWord=getItem(position);

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentWord.getImageResourceId());

        TextView name=(TextView) listItemView.findViewById(R.id.name);
        name.setText(currentWord.getName());
        TextView text1=(TextView) listItemView.findViewById(R.id.text1);
        text1.setText(currentWord.getText1());
        TextView text2=(TextView) listItemView.findViewById(R.id.text2);
        text2.setText(currentWord.getText2());
        TextView text3=(TextView) listItemView.findViewById(R.id.text3);
        text3.setText(currentWord.getText3());
        TextView text4=(TextView) listItemView.findViewById(R.id.text4);
        text4.setText(currentWord.getText4());
        return listItemView;
    }

}
