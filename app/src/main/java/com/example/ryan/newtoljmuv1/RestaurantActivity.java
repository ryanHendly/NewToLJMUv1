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

public class RestaurantActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
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
        LatLng center = new LatLng(53.403289, -2.980279);
        LatLng mccooleys = new LatLng(53.403332, -2.979914);
        LatLng peacock = new LatLng(53.402139, -2.979171);
        LatLng cuba = new LatLng(53.401946, -2.979007);
        LatLng barley = new LatLng(53.410101, -2.986965);
        LatLng pedro = new LatLng(53.401661, -2.979701);
        LatLng fsk = new LatLng(53.402384, -2.970517);
        LatLng shipping = new LatLng(53.402570, -2.979422);
        LatLng pattersons = new LatLng(53.402469, -2.982937);
        LatLng alchemist = new LatLng(53.405887, -2.991368);

        // Add properties for the camera positioning.
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 15));


        // Add markers for each point on the map.
        mMap.addMarker(new MarkerOptions().position(mccooleys).title("McCooleys Concert Square").icon(BitmapDescriptorFactory.fromResource(R.drawable.food)).snippet("25% off food at all times!"));
        mMap.addMarker(new MarkerOptions().position(peacock).title("Peacock").icon(BitmapDescriptorFactory.fromResource(R.drawable.food)).snippet("Any Pizza & 2 Cocktails for £12 Monday-Thursday"));
        mMap.addMarker(new MarkerOptions().position(cuba).title("Alma de Cuba").icon(BitmapDescriptorFactory.fromResource(R.drawable.food)).snippet("50% off Food on Tuesdays"));
        mMap.addMarker(new MarkerOptions().position(barley).title("Barley & Beans").icon(BitmapDescriptorFactory.fromResource(R.drawable.food)).snippet("2-4-1 Breakfasts Monday-Friday"));
        mMap.addMarker(new MarkerOptions().position(pedro).title("Crazy Pedros").icon(BitmapDescriptorFactory.fromResource(R.drawable.food)).snippet("2 Slices of Pizza & Soft Drink £5 Monday-Friday"));
        mMap.addMarker(new MarkerOptions().position(fsk).title("Free State Kitchen").icon(BitmapDescriptorFactory.fromResource(R.drawable.food)).snippet("Burger, Fries, Side and Soft Drink for £10 Monday-Friday"));
        mMap.addMarker(new MarkerOptions().position(shipping).title("Shipping Forecast").icon(BitmapDescriptorFactory.fromResource(R.drawable.food)).snippet("2-4-1 Main Meals Every Tuesday"));
        mMap.addMarker(new MarkerOptions().position(pattersons).title("Pattersons").icon(BitmapDescriptorFactory.fromResource(R.drawable.food)).snippet("50% Chicken every Wednesday"));
        mMap.addMarker(new MarkerOptions().position(alchemist).title("The Alchemist").icon(BitmapDescriptorFactory.fromResource(R.drawable.food)).snippet("50% off food every Monday + Wednesday"));

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
