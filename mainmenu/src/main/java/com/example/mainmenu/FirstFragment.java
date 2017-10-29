package com.example.mainmenu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.PermissionChecker;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.LatLng;


/**
 * A simple {@link Fragment} subclass.
 */

public class FirstFragment extends Fragment implements View.OnClickListener {


    public FirstFragment() {
        // Required empty public constructor
    }
    MapView mapView;
    GoogleMap map;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_first, container, false);
        Button btn1 = (Button)v.findViewById(R.id.btn1);
        Button btn2 = (Button)v.findViewById(R.id.btn2);
        // Gets the MapView from the XML layout and creates it

       /* mapView = (MapView) v.findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);

        // Gets to GoogleMap from the MapView and does initialization stuff
        //map = mapView.getMapAsync();
//        map.getUiSettings().setMyLocationButtonEnabled(false);

        map.setMyLocationEnabled(true);

//        try {
            MapsInitializer.initialize(this.getActivity());
//        } catch (GooglePlayServicesNotAvailableException e) {
//            e.printStackTrace();
//        }

// Updates the location and zoom of the MapView
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(new LatLng(43.1, -87.9), 10);
        map.animateCamera(cameraUpdate);
*/

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

        return v;
    }
/*
    @Override
    public void onResume() {
        mapView.onResume();
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }
*/
    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Toast.makeText(getActivity(), "Button1 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(getActivity(), "Button2 clicked", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
