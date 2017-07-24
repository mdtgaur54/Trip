package com.example.mudit.trip;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mudit on 6/7/17.
 */

public class TripAdapter extends ArrayAdapter<Item> {

    public TripAdapter(@NonNull Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Item currentItem = getItem(position);

        if(convertView==null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        imageView.setImageResource(currentItem.getImageResourceID());

        TextView titleView = (TextView) convertView.findViewById(R.id.title);
        titleView.setText(currentItem.getTitle());

        TextView descriptionView = (TextView) convertView.findViewById(R.id.description);
        descriptionView.setText(currentItem.getDescription());

        TextView addressView = (TextView) convertView.findViewById(R.id.address);
        addressView.setText(currentItem.getAddress());

        TextView timingView = (TextView) convertView.findViewById(R.id.timing);
        String currentItemTiming = currentItem.getTiming();
        if(currentItemTiming==null || currentItemTiming=="")
            timingView.setVisibility(View.GONE);
        else{
            timingView.setText(currentItemTiming);
            timingView.setVisibility(View.VISIBLE);
        }

        TextView priceView = (TextView) convertView.findViewById(R.id.price);
        String currentItemPrice = currentItem.getPrice();
        if (currentItemPrice==null || currentItemPrice=="")
            priceView.setVisibility(View.GONE);
        else {
            priceView.setText(currentItemPrice);
            priceView.setVisibility(View.VISIBLE);
        }

        TextView phoneView = (TextView) convertView.findViewById(R.id.phone);
        String currentItemPhone = currentItem.getPhone();
        if (currentItemPhone==null || currentItemPhone=="")
            phoneView.setVisibility(View.GONE);
        else{
            phoneView.setText(currentItemPhone);
            phoneView.setVisibility(View.VISIBLE);
        }

        return convertView;
    }
}
