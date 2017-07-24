package com.example.mudit.trip;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SightsFragment extends Fragment {


    public SightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Item> item = new ArrayList<>();
        item.add(new Item(R.drawable.sights_bangalore_palace, getString(R.string.sights_bangalore_palace), getString(R.string.sights_desc_bangalore_palace), getString(R.string.sights_addr_bangalore_palace), getString(R.string.sights_timing_bangalore_palace), getString(R.string.sights_price_bangalore_palace)));
        item.add(new Item(R.drawable.sights_bannerghatta, getString(R.string.sights_bannerghatta_national_park), getString(R.string.sights_desc_bannerghatta_national_park), getString(R.string.sights_addr_bannerghatta_national_park), getString(R.string.sights_timing_bannerghatta_national_park), getString(R.string.sights_price_bannerghatta_national_park)));
        item.add(new Item(R.drawable.sights_lal_bagh, getString(R.string.sights_lal_bagh), getString(R.string.sights_desc_lal_bagh), getString(R.string.sights_addr_lal_bagh), getString(R.string.sights_timing_lal_bagh), getString(R.string.sights_price_lal_bagh)));
        item.add(new Item(R.drawable.sights_cubbon_park, getString(R.string.sights_cubbon_park), getString(R.string.sights_desc_cubbon_park), getString(R.string.sights_addr_cubbon_park), getString(R.string.sights_timing_cubbon_park), getString(R.string.sights_price_cubbon_park)));
        item.add(new Item(R.drawable.sights_wonder_la_water_park, getString(R.string.sights_wonder_la_water_park), getString(R.string.sights_desc_wonder_la_water_park), getString(R.string.sights_addr_wonder_la_water_park), getString(R.string.sights_timing_wonder_la_water_park), getString(R.string.sights_price_wonder_la_water_park)));
        item.add(new Item(R.drawable.sights_bull_temple, getString(R.string.sights_bull_temple), getString(R.string.sights_desc_bull_temple), getString(R.string.sights_addr_bull_temple), getString(R.string.sights_timing_bull_temple), getString(R.string.sights_price_bull_temple)));
        item.add(new Item(R.drawable.sights_ulsoor_lake, getString(R.string.sights_ulsoor_lake), getString(R.string.sights_desc_ulsoor_lake), getString(R.string.sights_addr_ulsoor_lake), getString(R.string.sights_timing_ulsoor_lake), getString(R.string.sights_price_ulsoor_lake)));
        item.add(new Item(R.drawable.sights_isckon_temple, getString(R.string.sights_iskcon_temple), getString(R.string.sights_desc_iskcon_temple), getString(R.string.sights_addr_iskcon_temple), getString(R.string.sights_timing_iskcon_temple), getString(R.string.sights_price_iskcon_temple)));
        item.add(new Item(R.drawable.sights_hal_aerospace, getString(R.string.sights_hal_aerospace_museum), getString(R.string.sights_desc_hal_aerospace_museum), getString(R.string.sights_addr_hal_aerospace_museum), getString(R.string.sights_timing_hal_aerospace_museum), getString(R.string.sights_price_hal_aerospace_museum)));
        item.add(new Item(R.drawable.sights_jawahar_lal_planeterium, getString(R.string.sights_jawaharlal_nehur_plentarium), getString(R.string.sights_desc_jawaharlal_nehur_plentarium), getString(R.string.sights_addr_jawaharlal_nehur_plentarium), getString(R.string.sights_timing_jawaharlal_nehur_plentarium), getString(R.string.sights_price_jawaharlal_nehur_plentarium)));
        item.add(new Item(R.drawable.sights_chunchi_falls, getString(R.string.sights_chunchi_falls), getString(R.string.sights_desc_chunchi_falls), getString(R.string.sights_addr_chunchi_falls), getString(R.string.sights_timing_chunchi_falls), getString(R.string.sights_price_chunchi_falls)));
        item.add(new Item(R.drawable.sights_vidhan_soudha, getString(R.string.sights_vidhan_soudha), getString(R.string.sights_desc_vidhan_soudha), getString(R.string.sights_addr_vidhan_soudha), getString(R.string.sights_timing_vidhan_soudha), getString(R.string.sights_price_vidhan_soudha)));
        item.add(new Item(R.drawable.sights_bangalore_acquarium, getString(R.string.sights_bangalore_aquarium), getString(R.string.sights_desc_bangalore_aquarium), getString(R.string.sights_addr_bangalore_aquarium), getString(R.string.sights_timing_bangalore_aquarium), getString(R.string.sights_price_bangalore_aquarium)));
        item.add(new Item(R.drawable.sights_innovative_film_city, getString(R.string.sights_innovative_film_city), getString(R.string.sights_desc_innovative_film_city), getString(R.string.sights_addr_innovative_film_city), getString(R.string.sights_timing_innovative_film_city), getString(R.string.sights_price_innovative_film_city)));
        item.add(new Item(R.drawable.sights_lumbini_gardens, getString(R.string.sights_lumbini_gardens), getString(R.string.sights_desc_lumbini_gardens), getString(R.string.sights_addr_lumbini_gardens), getString(R.string.sights_timing_lumbini_gardens), getString(R.string.sights_price_lumbini_gardens)));
        item.add(new Item(R.drawable.sights_tipu_sultan_palace, getString(R.string.sights_tipu_sultan_palace), getString(R.string.sights_desc_tipu_sultan_palace), getString(R.string.sights_addr_tipu_sultan_palace), getString(R.string.sights_timing_tipu_sultan_palace), getString(R.string.sights_price_tipu_sultan_palace)));
        item.add(new Item(R.drawable.sights_basilica_church, getString(R.string.sights_saint_mary_basllica), getString(R.string.sights_desc_saint_mary_basllica), getString(R.string.sights_addr_saint_mary_basllica), getString(R.string.sights_timing_saint_mary_basllica), getString(R.string.sights_price_saint_mary_basllica)));
        item.add(new Item(R.drawable.sights_shiva_temple, getString(R.string.sights_shiva_temple), getString(R.string.sights_desc_shiva_temple), getString(R.string.sights_addr_shiva_temple), getString(R.string.sights_timing_shiva_temple), getString(R.string.sights_price_shiva_temple)));

        TripAdapter adapter = new TripAdapter(getActivity(), item, R.color.sights_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
