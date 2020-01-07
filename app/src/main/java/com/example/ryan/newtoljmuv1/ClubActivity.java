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

public class ClubActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);
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
        LatLng level = new LatLng(53.403327, -2.980901);
        LatLng brooklyn = new LatLng(53.401709, -2.978627);
        LatLng heebies = new LatLng(53.401568, -2.978319);
        LatLng modo = new LatLng(53.403322, -2.980478);
        LatLng baabar = new LatLng(53.402855, -2.979572);
        LatLng shipping = new LatLng(53.402570, -2.979422);
        LatLng arts = new LatLng(53.401440, -2.977912);
        LatLng soho = new LatLng(53.403443, -2.980324);

        // Add properties for the camera positioning.
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 15));


        // Add markers for each point on the map.
        mMap.addMarker(new MarkerOptions().position(mccooleys).title("McCooleys Concert Square").icon(BitmapDescriptorFactory.fromResource(R.drawable.club)).snippet("Offers include:\n£2 Selected Pints\n£9 Bottles of House Wine\n2 Cocktails for £6\n25% off food at all times!"));
        mMap.addMarker(new MarkerOptions().position(level).title("LEVEL Nightclub").icon(BitmapDescriptorFactory.fromResource(R.drawable.club)).snippet("Student Night: Wednesday\nOffers include:\n£2.50 Double Vodka + Mixer\n£1 Tequila/Sambuca\n4 Jagerbombs for £5"));
        mMap.addMarker(new MarkerOptions().position(brooklyn).title("Brooklyn Mixer").icon(BitmapDescriptorFactory.fromResource(R.drawable.club)).snippet("Student Night: Monday\nOffers include:\n£3 Double Vodka + Mixer\n£1 Shots\n£1.50 bottles"));
        mMap.addMarker(new MarkerOptions().position(heebies).title("Heebie Jeebies").icon(BitmapDescriptorFactory.fromResource(R.drawable.club)).snippet("Student Night: Thursday\nOffers include:\n£1 VK\n£1 bottled beer\n£2.50 double vodka + mixer\n£1 Tequila/Sambuca"));
        mMap.addMarker(new MarkerOptions().position(modo).title("MODO").icon(BitmapDescriptorFactory.fromResource(R.drawable.club)).snippet("Student Night: Wednesday\nOffers include:\n2-4-1 Cocktails\nDouble spirit + Mixer £3.50\nPints from £2.50\n5 Jagers for £10"));
        mMap.addMarker(new MarkerOptions().position(baabar).title("Baa Bar Fleet St").icon(BitmapDescriptorFactory.fromResource(R.drawable.club)).snippet("Student night: Sunday-Friday\nOffers include:\n£3 Double Vodka + Mixer\n£1 Shoters\n£1.75 Bottles"));
        mMap.addMarker(new MarkerOptions().position(shipping).title("Shipping Forecast").icon(BitmapDescriptorFactory.fromResource(R.drawable.club)).snippet("Student Night: Tuesday\nOffers Include:\n£3 Double Spirit + Mixer\n4 Red Stripe for £10"));
        mMap.addMarker(new MarkerOptions().position(arts).title("Arts Club").icon(BitmapDescriptorFactory.fromResource(R.drawable.club)).snippet("Student Night: Friday\nOffers include:\nSingle Vodka + Mixer £3.50\nDouble Vodka + Mixer £4\n£1 Shots\n2 Bottles for £5\n4 Jagerbombs for £6"));
        mMap.addMarker(new MarkerOptions().position(soho).title("Soho").icon(BitmapDescriptorFactory.fromResource(R.drawable.club)).snippet("Offers include:\nSelected Cocktails 2 for £6"));

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
