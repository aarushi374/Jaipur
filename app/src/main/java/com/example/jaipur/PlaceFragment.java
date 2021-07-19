package com.example.jaipur;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.AdapterView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PlaceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlaceFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PlaceFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PlaceFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PlaceFragment newInstance(String param1, String param2) {
        PlaceFragment fragment = new PlaceFragment();
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
        View rootView=inflater.inflate(R.layout.fragment_place, container, false);
        ArrayList<LocationImage> words=new ArrayList<LocationImage>();
        words.add(new LocationImage(R.drawable.amerfort,"26.985901,75.850700","Amer Fort",getResources().getString(R.string.famous_for),getResources().getString(R.string.entrancefee)+" INR 500 "+getResources().getString(R.string.foreign)+ " INR 100 "+getResources().getString(R.string.indians),getResources().getString(R.string.visit)+" 9:00 Am to 5:00 Pm",getResources().getString(R.string.duration)+" Around 3 hour"));
        words.add(new LocationImage(R.drawable.citypalace,"26.9255,75.8236","City Palace",getResources().getString(R.string.famous_for),getResources().getString(R.string.entrancefee)+" INR 500 "+getResources().getString(R.string.foreign)+ " INR 190 "+getResources().getString(R.string.indians),getResources().getString(R.string.visit)+" 9:00 Am to 5:00 Pm",getResources().getString(R.string.duration)+" Around 2 hour"));
        words.add(new LocationImage(R.drawable.jantarmantar,"26.924762,75.82456","Jantar Mantar",getResources().getString(R.string.famous_for),getResources().getString(R.string.entrancefee)+" INR 200 "+getResources().getString(R.string.foreign)+ " INR 50 "+getResources().getString(R.string.indians),getResources().getString(R.string.visit)+" 9:00 Am to 5:00 Pm",getResources().getString(R.string.duration)+" Around 1 hour"));
        words.add(new LocationImage(R.drawable.hawamahal,"26.9210,75.8227","Hawa Mahal",getResources().getString(R.string.famous_for),getResources().getString(R.string.entrancefee)+" INR 200 "+getResources().getString(R.string.foreign)+ " INR 50 "+getResources().getString(R.string.indians),getResources().getString(R.string.visit)+" 9:00 Am to 5:00 Pm",getResources().getString(R.string.duration)+" Around 1 hour"));
        words.add(new LocationImage(R.drawable.jaigarhfort,"26.9815968,75.8425699","Jaigarh Fort",getResources().getString(R.string.famous_for),getResources().getString(R.string.entrancefee)+" INR 150 "+getResources().getString(R.string.foreign)+ " INR 70 "+getResources().getString(R.string.indians),getResources().getString(R.string.visit)+" 9:00 Am to 5:00 Pm",getResources().getString(R.string.duration)+" Around 1 hour"));
        words.add(new LocationImage(R.drawable.nahargarhfort,"26.9373127,75.8133372","Nahargarh Fort",getResources().getString(R.string.famous_for),getResources().getString(R.string.entrancefee)+" INR 200 "+getResources().getString(R.string.foreign)+ " INR 50 "+getResources().getString(R.string.indians),getResources().getString(R.string.visit)+" 9:00 Am to 5:00 Pm",getResources().getString(R.string.duration)+" Around 3 hour"));
        words.add(new LocationImage(R.drawable.alberthall,"26.9115755,75.8172988","Albert Hall Museum",getResources().getString(R.string.famous_for),getResources().getString(R.string.entrancefee)+" INR 300 "+getResources().getString(R.string.foreign)+ " INR 50 "+getResources().getString(R.string.indians),getResources().getString(R.string.visit)+" 9:00 Am to 5:00 Pm",getResources().getString(R.string.duration)+" Around 1 hour"));
        words.add(new LocationImage(R.drawable.birlatemple,"26.8921959,75.8132034","Birla Temple",getResources().getString(R.string.famous_for),getResources().getString(R.string.entrancefee)+" Free",getResources().getString(R.string.visit)+" 6:00 Am to 12:00 Pm, 3:00 Pm to 9:00 Pm",getResources().getString(R.string.duration)+" Around 30 minutes"));
        words.add(new LocationImage(R.drawable.jalmahal,"26.9526043,75.8395528","Jal Mahal",getResources().getString(R.string.famous_for),getResources().getString(R.string.entrancefee)+" Free",getResources().getString(R.string.visit)+" 6:00 Am to 6:00 Pm",getResources().getString(R.string.duration)+" Around 30 minutes"));
        words.add(new LocationImage(R.drawable.sisodiaranikabagh,"26.8994218,75.8565422","Sisodiya Rani Ka Bagh",getResources().getString(R.string.famous_for_lovers),getResources().getString(R.string.entrancefee)+" INR 200 "+getResources().getString(R.string.foreign)+" INR 50 "+getResources().getString(R.string.indians),getResources().getString(R.string.visit)+" 9:00 Am to 6:00 Pm",getResources().getString(R.string.duration)+" Around 1 hour"));
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