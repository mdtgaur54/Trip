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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Item> item = new ArrayList<>();

        item.add(new Item(R.drawable.hotel_taj_westend, getString(R.string.hotel_taj_west_end), getString(R.string.hotel_desc_taj_west_end), getString(R.string.hotel_addr_taj_west_end), getString(R.string.hotel_ph_taj_west_end)));
        item.add(new Item(R.drawable.hotel_lalit_ashok, getString(R.string.hotel_lalit_ashok), getString(R.string.hotel_desc_lalit_ashok), getString(R.string.hotel_addr_lalit_ashok), getString(R.string.hotel_ph_lalit_ashok)));
        item.add(new Item(R.drawable.hotel_itc_windsor, getString(R.string.hotel_itc_windsor), getString(R.string.hotel_desc_itc_windsor), getString(R.string.hotel_addr_itc_windsor), getString(R.string.hotel_ph_itc_windsor)));
        item.add(new Item(R.drawable.hotel_oberoi, getString(R.string.hotel_oberoi), getString(R.string.hotel_desc_oberoi), getString(R.string.hotel_addr_oberoi), getString(R.string.hotel_ph_oberoi)));
        item.add(new Item(R.drawable.hotel_park_plaza, getString(R.string.hotel_park_plaza), getString(R.string.hotel_desc_park_plaza), getString(R.string.hotel_addr_park_plaza), getString(R.string.hotel_ph_park_plaza)));
        item.add(new Item(R.drawable.hotel_royal_gardenia, getString(R.string.hotel_itc_royal_gardenia), getString(R.string.hotel_desc_itc_royal_gardenia), getString(R.string.hotel_addr_itc_royal_gardenia), getString(R.string.hotel_ph_itc_royal_gardenia)));
        item.add(new Item(R.drawable.hotel_ritz_carlton, getString(R.string.hotel_ritz_carlton), getString(R.string.hotel_desc_ritz_carlton), getString(R.string.hotel_addr_ritz_carlton), getString(R.string.hotel_ph_ritz_carlton)));
        item.add(new Item(R.drawable.hotel_moevenpick, getString(R.string.hotel_moevenpick), getString(R.string.hotel_desc_moevenpick), getString(R.string.hotel_addr_moevenpick), getString(R.string.hotel_ph_moevenpick)));
        item.add(new Item(R.drawable.hotel_leela_palace, getString(R.string.hotel_leela_palace), getString(R.string.hotel_desc_leela_palace), getString(R.string.hotel_addr_leela_palace), getString(R.string.hotel_ph_leela_palace)));
        item.add(new Item(R.drawable.hotel_hyatt, getString(R.string.hotel_hyatt), getString(R.string.hotel_desc_hyatt), getString(R.string.hotel_addr_hyatt), getString(R.string.hotel_ph_hyatt)));
        item.add(new Item(R.drawable.hotel_zuri_whitefield, getString(R.string.hotel_zuri_whitefield), getString(R.string.hotel_desc_zuri_whitefield), getString(R.string.hotel_addr_zuri_whitefield), getString(R.string.hotel_ph_zuri_whitefield)));

        TripAdapter adapter = new TripAdapter(getActivity(), item);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
