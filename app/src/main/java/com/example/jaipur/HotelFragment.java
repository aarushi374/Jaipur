package com.example.jaipur;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HotelFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HotelFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HotelFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HotelFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HotelFragment newInstance(String param1, String param2) {
        HotelFragment fragment = new HotelFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_hotel, container, false);
        ArrayList<LocationImage> words=new ArrayList<LocationImage>();
        words.add(new LocationImage(R.drawable.holidayinn,"26.90294,75.7902973","Holiday Inn Jaipur City Center",getResources().getString(R.string.rating)+" 8.9","1.2 Km "+getResources().getString(R.string.city_center),getResources().getString(R.string.cost)+" NRI 2521",getResources().getString(R.string.amenities)+" Wifi, Gym, Restaurant"));
        words.add(new LocationImage(R.drawable.rambaghpalace,"26.8981053,75.8059611","Rambagh Palace",getResources().getString(R.string.rating)+" 9.2","2.6 Km "+getResources().getString(R.string.city_center),getResources().getString(R.string.cost)+" NRI 29146",getResources().getString(R.string.amenities)+" Wifi, Gym, Restaurant, Spa, Pets allowed"));
        words.add(new LocationImage(R.drawable.alilafort,"27.321251,75.8920207","Alila Fort Bishangarh",getResources().getString(R.string.rating)+" 8.7","46.7 Km "+getResources().getString(R.string.city_center),getResources().getString(R.string.cost)+" NRI 15576",getResources().getString(R.string.amenities)+" Wifi, Gym, Restaurant, Spa"));
        words.add(new LocationImage(R.drawable.marriotthotel,"26.8417597,75.7940002","Jaipur Marriott Hotel",getResources().getString(R.string.rating)+" 8.8","7.9 Km "+getResources().getString(R.string.city_center),getResources().getString(R.string.cost)+" NRI 3528",getResources().getString(R.string.amenities)+" Wifi, Gym, Restaurant, Spa"));
        words.add(new LocationImage(R.drawable.meridien,"27.0320214,75.8863503","Le Meridien",getResources().getString(R.string.rating)+" 8.6","0.0 Km "+getResources().getString(R.string.city_center),getResources().getString(R.string.cost)+" NRI 6195",getResources().getString(R.string.amenities)+" Wifi, Gym, Restaurant, Spa"));
        words.add(new LocationImage(R.drawable.umaidbhawan,"26.9285056,75.7902306","Umaid Bhawan Hotel",getResources().getString(R.string.rating)+" 8.5","1.8 Km "+getResources().getString(R.string.city_center),getResources().getString(R.string.cost)+" NRI 2856",getResources().getString(R.string.amenities)+" Wifi, Restaurant, Swimming pool"));
        words.add(new LocationImage(R.drawable.oberoi,"26.8759401,75.8815706","The Oberoi Rajvilas",getResources().getString(R.string.rating)+" 9.3","10.4 Km "+getResources().getString(R.string.city_center),getResources().getString(R.string.cost)+" NRI 24544",getResources().getString(R.string.amenities)+" Wifi, Gym, Restaurant, Swimming Pool, Spa, Pets allowed"));
        words.add(new LocationImage(R.drawable.royalorchid,"26.9247407,75.791433","Royal Orchid Central",getResources().getString(R.string.rating)+" 7.9","1.5 Km "+getResources().getString(R.string.city_center),getResources().getString(R.string.cost)+" NRI 1225",getResources().getString(R.string.amenities)+" Wifi, Gym, Restaurant, Swimming Pool, Pets allowed"));
        words.add(new LocationImage(R.drawable.goldentulip,"26.9170093,75.8039468","Golden Tulip Essential",getResources().getString(R.string.rating)+" 7.8","1.9 Km "+getResources().getString(R.string.city_center),getResources().getString(R.string.cost)+" NRI 1327",getResources().getString(R.string.amenities)+" Wifi, Gym, Restaurant"));
        words.add(new LocationImage(R.drawable.radissonblu,"26.8425095,75.7590795","Radisson Blu Jaipur",getResources().getString(R.string.rating)+" 8.3","8.1 Km "+getResources().getString(R.string.city_center),getResources().getString(R.string.cost)+" NRI 2520",getResources().getString(R.string.amenities)+" Wifi, Gym, Restaurant, Spa"));

        LocationAdapter itemsAdapter = new LocationAdapter(container.getContext(),words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                LocationImage loca=words.get(position);
                Uri gmmIntentUri = Uri.parse("geo:"+loca.getLocation()+"?z=20&q="+loca.getName());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                startActivity(mapIntent);
            }
        });
        return rootView;
    }
}