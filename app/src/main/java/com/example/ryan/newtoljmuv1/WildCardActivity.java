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

public class WildCardActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wild_card);
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
        LatLng center = new LatLng(53.394731, -2.983745);
        LatLng spring = new LatLng(53.380265, -2.975524);
        LatLng ghetto = new LatLng(53.393865, -2.979107);
        LatLng karting = new LatLng(53.381349, -2.975444);
        LatLng paintball = new LatLng(53.414458, -2.990253);
        LatLng ghoulie = new LatLng(53.407990, -2.988260);
        LatLng watersports = new LatLng(53.392731, -2.985404);
        LatLng rampworx = new LatLng(53.482677, -2.957135);
        LatLng climbing = new LatLng(53.423922, -2.995583);

        // Add properties for the camera positioning.
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 15));


        // Add markers for each point on the map.
        mMap.addMarker(new MarkerOptions().position(spring).title("Spring City").icon(BitmapDescriptorFactory.fromResource(R.drawable.wild)).snippet("£5 Session on a Monday"));
        mMap.addMarker(new MarkerOptions().position(ghetto).title("Ghetto Golf").icon(BitmapDescriptorFactory.fromResource(R.drawable.wild)).snippet("50% off Monday-Wednesday"));
        mMap.addMarker(new MarkerOptions().position(karting).title("Team Sport Karting").icon(BitmapDescriptorFactory.fromResource(R.drawable.wild)).snippet("2x 15 Minute Sessions for £20 Monday-Friday"));
        mMap.addMarker(new MarkerOptions().position(paintball).title("Ultimate Indoor Paintball").icon(BitmapDescriptorFactory.fromResource(R.drawable.wild)).snippet("£10 Play + 200 Balls"));
        mMap.addMarker(new MarkerOptions().position(ghoulie).title("Ghoulie's").icon(BitmapDescriptorFactory.fromResource(R.drawable.wild)).snippet("50% off Experience on Thursdays"));
        mMap.addMarker(new MarkerOptions().position(watersports).title("Liverpool Watersports Center").icon(BitmapDescriptorFactory.fromResource(R.drawable.wild)).snippet("£5 per Visit"));
        mMap.addMarker(new MarkerOptions().position(rampworx).title("Rampworx").icon(BitmapDescriptorFactory.fromResource(R.drawable.wild)).snippet("£7.50 all Day"));
        mMap.addMarker(new MarkerOptions().position(climbing).title("Awesome Walls").icon(BitmapDescriptorFactory.fromResource(R.drawable.wild)).snippet("£5 Climbing + Harness Hire"));

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
