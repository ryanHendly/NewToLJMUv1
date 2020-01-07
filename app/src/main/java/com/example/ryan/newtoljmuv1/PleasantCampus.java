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

public class PleasantCampus extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pleasant_campus);
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
        LatLng center = new LatLng(53.402045, -2.971478);
        LatLng avril = new LatLng(53.402845, -2.971531);
        LatLng aquinas = new LatLng(53.402839, -2.971102);
        LatLng walters = new LatLng(53.399368, -2.974531);
        LatLng egerton = new LatLng(53.403480, -2.973125);
        LatLng science = new LatLng(53.404079, -2.969751);
        LatLng drama = new LatLng(53.401231, -2.972290);
        LatLng foster = new LatLng(53.403681, -2.970272);
        LatLng redmonds = new LatLng(53.405303, -2.972518);
        LatLng lennon = new LatLng(53.404719, -2.970443);

        // Add properties for the camera positioning.
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 15));


        // Add markers for each point on the map.
        mMap.addMarker(new MarkerOptions().position(avril).title("Avril Robarts LRC").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(aquinas).title("Aquinas Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(walters).title("Dean Walters Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(egerton).title("Egerton Court").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(science).title("Liverpool Science Park").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(drama).title("Joe H Makin Drama Center").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(foster).title("John Foster Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(redmonds).title("Redmonds Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
        mMap.addMarker(new MarkerOptions().position(lennon).title("The John Lennon Art and Design Building").icon(BitmapDescriptorFactory.fromResource(R.drawable.icon2)));
    }
}
