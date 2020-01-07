package com.example.ryan.newtoljmuv1;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class EventsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
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
        LatLng center = new LatLng(53.395151, -2.978670);
        LatLng arts = new LatLng(53.401628, -2.977849);
        LatLng camp = new LatLng(53.394660, -2.980152);
        LatLng wind = new LatLng(53.418186, -2.999717);
        LatLng north = new LatLng(53.418593, -2.998297);
        LatLng constellations = new LatLng(53.394822, -2.978321);
        LatLng kitchen = new LatLng(53.397339, -2.981833);
        final LatLng underground = new LatLng(53.408239, -2.989830);


        // Add properties for the camera positioning.
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 15));


        // Add markers for each point on the map.
        mMap.addMarker(new MarkerOptions().position(arts).title("East Village Arts Club").icon(BitmapDescriptorFactory.fromResource(R.drawable.vinyl)).snippet("Events here:\nMedication\nCIRCUS\nLOST"));
        mMap.addMarker(new MarkerOptions().position(camp).title("Camp & Furnace").icon(BitmapDescriptorFactory.fromResource(R.drawable.vinyl)).snippet("Events here:\nCIRCUS\nLOST\nChibuku"));
        mMap.addMarker(new MarkerOptions().position(wind).title("Invisible Wind Factory").icon(BitmapDescriptorFactory.fromResource(R.drawable.vinyl)).snippet("Events here:\n303\nAbandon Silence\nChibuku"));
        mMap.addMarker(new MarkerOptions().position(north).title("North Shore Troubadour").icon(BitmapDescriptorFactory.fromResource(R.drawable.vinyl)).snippet("Events here:\nHALCYON\nCabana"));
        mMap.addMarker(new MarkerOptions().position(constellations).title("Constellations").icon(BitmapDescriptorFactory.fromResource(R.drawable.vinyl)).snippet("Events here:\nHALCYON\nThe 90s Rave\nAbandon Silence"));
        mMap.addMarker(new MarkerOptions().position(kitchen).title("24 Kitchen Street").icon(BitmapDescriptorFactory.fromResource(R.drawable.vinyl)).snippet("Events here:\nBoogaloo\nThe Wonder Pot\n+Others!"));
        mMap.addMarker(new MarkerOptions().position(underground).title("Underground").icon(BitmapDescriptorFactory.fromResource(R.drawable.vinyl)).snippet("Events here:\nLOST\nHALCYON"));


            mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {

                @Override
                public View getInfoWindow(Marker arg0) {
                    return null;
                }

                @Override
                public View getInfoContents(Marker marker) {

                    Context context = getApplicationContext(); //or getActivity(), YourActivity.this, etc.

                    LinearLayout info = new LinearLayout(context);
                    info.setOrientation(LinearLayout.VERTICAL);

                    TextView title = new TextView(context);
                    title.setTextColor(Color.BLACK);
                    title.setGravity(Gravity.CENTER);
                    title.setTypeface(null, Typeface.BOLD);
                    title.setText(marker.getTitle());

                    TextView snippet = new TextView(context);
                    snippet.setTextColor(Color.GRAY);
                    snippet.setText(marker.getSnippet());

                    info.addView(title);
                    info.addView(snippet);

                    return info;
                }
            });
    }
}
