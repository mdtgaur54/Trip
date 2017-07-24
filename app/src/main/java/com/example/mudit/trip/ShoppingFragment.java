package com.example.mudit.trip;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Item> item = new ArrayList<>();

        item.add(new Item(R.drawable.mall_orion, getString(R.string.shopping_orion), getString(R.string.shopping_desc_orion), getString(R.string.shopping_addr_orion)));
        item.add(new Item(R.drawable.mall_phoenix_city, getString(R.string.shopping_phoenix_city), getString(R.string.shopping_desc_phoenix_city), getString(R.string.shopping_addr_phoenix_city)));
        item.add(new Item(R.drawable.mall_mantra_square, getString(R.string.shopping_mantri_square), getString(R.string.shopping_desc_mantri_square), getString(R.string.shopping_addr_mantri_square)));
        item.add(new Item(R.drawable.hotel_collection_ub_city, getString(R.string.shopping_collection_ub_city), getString(R.string.shopping_desc_collection_ub_city), getString(R.string.shopping_addr_collection_ub_city)));
        item.add(new Item(R.drawable.mall_inorbit, getString(R.string.shopping_inorbit), getString(R.string.shopping_desc_inorbit), getString(R.string.shopping_addr_inorbit)));
        item.add(new Item(R.drawable.hotel_royal_meenakshi, getString(R.string.shopping_royal_meenakshi), getString(R.string.shopping_desc_royal_meenakshi), getString(R.string.shopping_addr_royal_meenakshi)));
        item.add(new Item(R.drawable.mall_ascendas_park_square, getString(R.string.shopping_ascendas_park_square), getString(R.string.shopping_desc_ascendas_park_square), getString(R.string.shopping_addr_ascendas_park_square)));
        item.add(new Item(R.drawable.mall_new_forum_value, getString(R.string.shopping_new_forum_value), getString(R.string.shopping_desc_new_forum_value), getString(R.string.shopping_addr_new_forum_value)));
        item.add(new Item(R.drawable.mall_bangalore_central, getString(R.string.shopping_bangalore_central), getString(R.string.shopping_desc_bangalore_central), getString(R.string.shopping_addr_bangalore_central)));
        item.add(new Item(R.drawable.mall_garuda, getString(R.string.shopping_garuda), getString(R.string.shopping_desc_garuda), getString(R.string.shopping_addr_garuda)));

        TripAdapter adapter = new TripAdapter(getActivity(), item);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
