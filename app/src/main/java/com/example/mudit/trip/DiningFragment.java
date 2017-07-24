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
public class DiningFragment extends Fragment {


    public DiningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Item> item = new ArrayList<>();

        item.add(new Item(R.drawable.hoot, getString(R.string.dining_hoot), getString(R.string.dining_desc_hoot), getString(R.string.dining_addr_hoot), getString(R.string.dining_timing_hoot), getString(R.string.dining_price_hoot), getString(R.string.dining_ph_hoot)));
        item.add(new Item(R.drawable.dining_big_brewsky, getString(R.string.dining_big_brewsky), getString(R.string.dining_desc_big_brewsky), getString(R.string.dining_addr_big_brewsky), getString(R.string.dining_timing_big_brewsky), getString(R.string.dining_price_big_brewsky), getString(R.string.dining_ph_big_brewsky)));
        item.add(new Item(R.drawable.dining_biergarten, getString(R.string.dining_biergarten), getString(R.string.dining_desc_biergarten), getString(R.string.dining_addr_biergarten), getString(R.string.dining_timing_biergarten), getString(R.string.dining_price_biergarten), getString(R.string.dining_ph_biergarten)));
        item.add(new Item(R.drawable.dining_flechazo, getString(R.string.dining_flenchazo), getString(R.string.dining_desc_flenchazo), getString(R.string.dining_addr_flenchazo), getString(R.string.dining_timing_flenchazo), getString(R.string.dining_price_flenchazo), getString(R.string.dining_ph_flenchazo)));
        item.add(new Item(R.drawable.dining_tippler, getString(R.string.dining_tippler), getString(R.string.dining_desc_tippler), getString(R.string.dining_addr_tippler), getString(R.string.dining_timing_tippler), getString(R.string.dining_price_tippler), getString(R.string.dining_ph_tippler)));
        item.add(new Item(R.drawable.dining_float, getString(R.string.dining_float), getString(R.string.dining_desc_float), getString(R.string.dining_addr_float), getString(R.string.dining_timing_float), getString(R.string.dining_price_float), getString(R.string.dining_ph_float)));
        item.add(new Item(R.drawable.dining_vapour_pub, getString(R.string.dining_vapour_pub), getString(R.string.dining_desc_vapour_pub), getString(R.string.dining_addr_vapour_pub), getString(R.string.dining_timing_vapour_pub), getString(R.string.dining_price_vapour_pub), getString(R.string.dining_ph_vapour_pub)));
        item.add(new Item(R.drawable.dining_mudpipe, getString(R.string.dining_mudpipe_cafe), getString(R.string.dining_desc_mudpipe_cafe), getString(R.string.dining_addr_mudpipe_cafe), getString(R.string.dining_timing_mudpipe_cafe), getString(R.string.dining_price_mudpipe_cafe), getString(R.string.dining_ph_mudpipe_cafe)));
        item.add(new Item(R.drawable.dining_roots, getString(R.string.dining_roots), getString(R.string.dining_desc_roots), getString(R.string.dining_addr_roots), getString(R.string.dining_timing_roots), getString(R.string.dining_price_roots), getString(R.string.dining_ph_roots)));
        item.add(new Item(R.drawable.dining_barbeque_nation, getString(R.string.dining_barbeque_nation), getString(R.string.dining_desc_barbeque_nation), getString(R.string.dining_addr_barbeque_nation), getString(R.string.dining_timing_barbeque_nation), getString(R.string.dining_price_barbeque_nation), getString(R.string.dining_ph_barbeque_nation)));

        TripAdapter adapter = new TripAdapter(getActivity(), item);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
