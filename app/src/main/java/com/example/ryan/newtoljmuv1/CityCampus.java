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

public class CityCampus extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_campus);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add LatLng values for all the points of interest on the map.
        LatLng center = new LatLng(53.411068, -2.982297);
        LatLng james = new LatLng(53.412226, -2.981376);
        LatLng tom = new LatLng(53.413403, -2.980732);
        LatLng marybone = new LatLng(53.411238, -2.987441);
        LatLng library = new LatLng(53.411137, -2.988401);
        LatLng henry = new LatLng(53.410551, -2.984382);
        LatLng cherie = new LatLng(53.412666, -2.981698);
        LatLng tower = new LatLng(53.410537, -2.974883);
        LatLng peter = new LatLng(53.412086, -2.980728);
        LatLng kingsway = new LatLng(53.409686, -2.985622);

        // Add properties for the camera positioning.
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 15));


        // Add markers for each point on the map.
        mMap.addMarker(new MarkerOptions().position(james).title("James Parson's Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(tom).title("Tom Reilly Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(marybone).title("Marybone Lecture Theatre").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(library).title("Avril Robarts LRC").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(henry).title("Henry Cotton Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(cherie).title("Cherie Booth Lecture Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(tower).title("LJMU Tower").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(peter).title("Peter Jost Enterprise Center").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(kingsway).title("Kingsway House").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
    }
}
