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

public class GymsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyms);
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
        LatLng center = new LatLng(53.408350, -2.985239);
        LatLng easy = new LatLng(53.405723, -2.980055);
        LatLng pure = new LatLng(53.404847, -2.978228);
        LatLng gym = new LatLng(53.402980, -2.990102);
        LatLng jd = new LatLng(53.407367, -2.990033);
        LatLng lifestyles = new LatLng(53.408058, -2.984361);

        // Add properties for the camera positioning.
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 15));


        // Add markers for each point on the map.
        mMap.addMarker(new MarkerOptions().position(easy).title("easyGym").icon(BitmapDescriptorFactory.fromResource(R.drawable.bicep)).snippet("Membership Cost: £16.99 per month"));
        mMap.addMarker(new MarkerOptions().position(pure).title("PureGym").icon(BitmapDescriptorFactory.fromResource(R.drawable.bicep)).snippet("Membership Cost: £12.99-£22.99 per month\nStudent Price: £10.99-£19.99 per month"));
        mMap.addMarker(new MarkerOptions().position(gym).title("The Gym Group").icon(BitmapDescriptorFactory.fromResource(R.drawable.bicep)).snippet("Membership Cost: £13.99\nStudent Price: £99 for 8 months"));
        mMap.addMarker(new MarkerOptions().position(jd).title("JD Gym").icon(BitmapDescriptorFactory.fromResource(R.drawable.bicep)).snippet("Membership Cost: £25 per month"));
        mMap.addMarker(new MarkerOptions().position(lifestyles).title("Lifestyles City Centre").icon(BitmapDescriptorFactory.fromResource(R.drawable.bicep)).snippet("Membership Cost: Free off-peak for LJMU students!"));


        //Workaround for displaying multiple-line snippets.
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
