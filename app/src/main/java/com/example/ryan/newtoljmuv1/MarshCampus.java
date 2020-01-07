package com.example.ryan.newtoljmuv1;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MarshCampus extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marsh_campus);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add LatLng values for all the points of interest on the map.
        LatLng center = new LatLng(53.370361, -2.919594);
        LatLng holmefield = new LatLng(53.368941, -2.918575);
        LatLng library = new LatLng(53.371482, -2.919358);
        LatLng north = new LatLng(53.370394, -2.919476);
        LatLng sports = new LatLng(53.369568, -2.919004);
        LatLng sudley = new LatLng(53.370867, -2.920130);

        // Add properties for the camera positioning.
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 15));


        // Add markers for each point on the map.
        mMap.addMarker(new MarkerOptions().position(holmefield).title("Holmefield House").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(library).title("IM Marsh Library & Science Block").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(north).title("North Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(sports).title("Sports Center").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(sudley).title("Sudley Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
    }
}
