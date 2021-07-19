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
 * Use the {@link RestaurantFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestaurantFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RestaurantFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RestaurantFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RestaurantFragment newInstance(String param1, String param2) {
        RestaurantFragment fragment = new RestaurantFragment();
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
        View rootView=inflater.inflate(R.layout.fragment_restaurant, container, false);
        ArrayList<LocationImage> words=new ArrayList<LocationImage>();
        words.add(new LocationImage(R.drawable.jaipuradda,"26.9211575,75.7926459","Jaipur Adda",getResources().getString(R.string.musttry)+" Naan Pizza, Karari Roti,Mojito, Corn Bhel",getResources().getString(R.string.cuisine)+" Modern Indian",getResources().getString(R.string.rating)+" 4.2/5",getResources().getString(R.string.costfortwo)+" INR 1800"));
        words.add(new LocationImage(R.drawable.therajputroom,"26.89836,75.8062663","The Rajput Room",getResources().getString(R.string.musttry)+" Laal Maas",getResources().getString(R.string.cuisine)+" North Indian, Continental, Asian",getResources().getString(R.string.rating)+" 5/5",getResources().getString(R.string.costfortwo)+" INR 4000"));
        words.add(new LocationImage(R.drawable.zolocrust,"26.8465311,75.7987229","Zolocrust",getResources().getString(R.string.musttry)+" Mezze Platter, Tiramisu, Spaghetti, Apple Pie",getResources().getString(R.string.cuisine)+" Italian, Bakery, Continental",getResources().getString(R.string.rating)+" 4.6/5",getResources().getString(R.string.costfortwo)+" INR 2000"));
        words.add(new LocationImage(R.drawable.rj14,"26.895303,75.7483683","RJ 14",getResources().getString(R.string.musttry)+" Chana Masala, Dal Bukhara, Tomato Shorba, Panipuri",getResources().getString(R.string.cuisine)+" North Indian, South Indian",getResources().getString(R.string.rating)+" 4.1/5",getResources().getString(R.string.costfortwo)+" INR 900"));
        words.add(new LocationImage(R.drawable.theforessta,"26.9216325,75.7923882","The Foressta",getResources().getString(R.string.musttry)+" Butter Chicken, Risotto, Laal Maans, Spring Rolls",getResources().getString(R.string.cuisine)+" Continental, Mexican, Desserts, North Indian, Chinese, Rajasthani",getResources().getString(R.string.rating)+" 4.1/5",getResources().getString(R.string.costfortwo)+" INR 1800"));
        words.add(new LocationImage(R.drawable.chaochinesebistro,"26.9027224,75.790415,17","Chao Chinese Bistro",getResources().getString(R.string.musttry)+" Jumbo Prawns, Fish Grills, Noodles, Dumplings",getResources().getString(R.string.cuisine)+" Chinese, Asian",getResources().getString(R.string.rating)+" 5/5",getResources().getString(R.string.costfortwo)+" INR 2500"));
        words.add(new LocationImage(R.drawable.tapricentral,"26.905601,75.8089933","Tapri Central",getResources().getString(R.string.musttry)+" Sauteed Mushrooms, Tadka Maggi, Falafel, Nachos",getResources().getString(R.string.cuisine)+" Café, Fast Food",getResources().getString(R.string.rating)+" 4.5/5",getResources().getString(R.string.costfortwo)+" INR 750"));
        words.add(new LocationImage(R.drawable.handijaipur,"26.9159937,75.7425045,13","Handi",getResources().getString(R.string.musttry)+" Lal Maans, Jaisalmeri Laal Maas, Afghan Chicken, Chicken Biryani, Mutton Handi, Chicken Handi, Rumali Roti",getResources().getString(R.string.cuisine)+" North Indian, Mughlai, Kebab",getResources().getString(R.string.rating)+" 4/5",getResources().getString(R.string.costfortwo)+" INR 1000"));
        words.add(new LocationImage(R.drawable.dragonhouse,"26.919676,75.7925793","Dragon House",getResources().getString(R.string.musttry)+" Manchow Soup, Noodles, Manchurian, Dimsums",getResources().getString(R.string.cuisine)+" Chinese, Thai",getResources().getString(R.string.rating)+" 3.6/5",getResources().getString(R.string.costfortwo)+" INR 1800"));
        words.add(new LocationImage(R.drawable.cinnamon,"26.9123886,75.7834664","Cinnamon",getResources().getString(R.string.musttry)+" Dal Makhani, Dal Bukhara, Vegetable Biryani",getResources().getString(R.string.cuisine)+" North Indian",getResources().getString(R.string.rating)+" 4.6/5",getResources().getString(R.string.costfortwo)+" INR 3600"));
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