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

public class TouristActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist);
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
        LatLng center = new LatLng(53.403675, -2.991670);
        LatLng sefton = new LatLng(53.383514, -2.934884);
        LatLng pier = new LatLng(53.405025, -2.995373);
        LatLng albert = new LatLng(53.400079, -2.993750);
        LatLng beatles = new LatLng(53.399221, -2.991899);
        LatLng mathew = new LatLng(53.406354, -2.987221);
        LatLng world = new LatLng(53.409953, -2.981642);
        LatLng tate = new LatLng(53.400862, -2.994351);
        LatLng maritime = new LatLng(53.401232, -2.992899);
        LatLng walker = new LatLng(53.410060, -2.979666);

        // Add properties for the camera positioning.
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 15));


        // Add markers for each point on the map.
        mMap.addMarker(new MarkerOptions().position(sefton).title("Sefton Park").icon(BitmapDescriptorFactory.fromResource(R.drawable.liberty)));
        mMap.addMarker(new MarkerOptions().position(pier).title("Pier Head").icon(BitmapDescriptorFactory.fromResource(R.drawable.liberty)));
        mMap.addMarker(new MarkerOptions().position(albert).title("Albert Dock").icon(BitmapDescriptorFactory.fromResource(R.drawable.liberty)));
        mMap.addMarker(new MarkerOptions().position(beatles).title("The Beatles' Story").icon(BitmapDescriptorFactory.fromResource(R.drawable.liberty)));
        mMap.addMarker(new MarkerOptions().position(mathew).title("Mathew Street").icon(BitmapDescriptorFactory.fromResource(R.drawable.liberty)));
        mMap.addMarker(new MarkerOptions().position(world).title("World Museum").icon(BitmapDescriptorFactory.fromResource(R.drawable.liberty)));
        mMap.addMarker(new MarkerOptions().position(tate).title("Tate Museum").icon(BitmapDescriptorFactory.fromResource(R.drawable.liberty)));
        mMap.addMarker(new MarkerOptions().position(maritime).title("Maritime Museum").icon(BitmapDescriptorFactory.fromResource(R.drawable.liberty)));
        mMap.addMarker(new MarkerOptions().position(walker).title("Walker Art Gallery").icon(BitmapDescriptorFactory.fromResource(R.drawable.liberty)));

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
