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

public class BarsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars);
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
        LatLng mccooleys1 = new LatLng(53.403332, -2.979914);
        LatLng mccooleys2 = new LatLng(53.406812, -2.986775);
        LatLng bierkeller = new LatLng(53.403292, -2.988494);
        LatLng woodies = new LatLng(53.402845, -2.978864);
        LatLng liffey = new LatLng(53.403815, -2.976786);
        LatLng spoons = new LatLng(53.402981, -2.980265);
        LatLng brookhouse = new LatLng(53.389900, -2.927443);
        LatLng shenanigans = new LatLng(53.410374, -2.988933);
        LatLng merchant = new LatLng(53.401929, -2.980404);
        LatLng poste = new LatLng(53.407826, -2.986804);

        // Add properties for the camera positioning.
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(center, 15));


        // Add markers for each point on the map.
        mMap.addMarker(new MarkerOptions().position(mccooleys1).title("McCooleys Concert Square").icon(BitmapDescriptorFactory.fromResource(R.drawable.beer)).snippet("Offers include:\n£2 Selected Pints\n£9 Bottles of House Wine\n2 Cocktails for £6\n25% off food at all times!"));
        mMap.addMarker(new MarkerOptions().position(mccooleys2).title("McCooleys Mathew Street").icon(BitmapDescriptorFactory.fromResource(R.drawable.beer)).snippet("Offers include:\n£2 Selected Pints\n£9 Bottles of House Wine\n2 Cocktails for £6\n25% off food at all times!"));
        mMap.addMarker(new MarkerOptions().position(bierkeller).title("Bierkeller Complex").icon(BitmapDescriptorFactory.fromResource(R.drawable.beer)).snippet("Offers include:\n£2 Selected Pints\n£4 Selected Steins\n£8.95 Bottles of House Wine\n£3.50 Cocktails\n£2 Jagerbombs\n25% off Food"));
        mMap.addMarker(new MarkerOptions().position(woodies).title("Woodies Sports Bar").icon(BitmapDescriptorFactory.fromResource(R.drawable.beer)).snippet("Offers include:\nReduced drinks on Sundays\n£1.50 Jagerbombs\n£1 Punch Bag"));
        mMap.addMarker(new MarkerOptions().position(liffey).title("The Liffey").icon(BitmapDescriptorFactory.fromResource(R.drawable.beer)).snippet("Offers Include:\nCheap Drinks on Weekends"));
        mMap.addMarker(new MarkerOptions().position(spoons).title("The Lime Kiln - Wetherspoons").icon(BitmapDescriptorFactory.fromResource(R.drawable.beer)));
        mMap.addMarker(new MarkerOptions().position(brookhouse).title("The Brookhouse").icon(BitmapDescriptorFactory.fromResource(R.drawable.beer)).snippet("Offers include:\nThursday Night Student Night!\nSelected shots £1\nPints of Carlsberg & Strongbow £1.25\n£1.50 vodka and mixer. "));
        mMap.addMarker(new MarkerOptions().position(shenanigans).title("Shenanigans").icon(BitmapDescriptorFactory.fromResource(R.drawable.beer)));
        mMap.addMarker(new MarkerOptions().position(merchant).title("The Merchant").icon(BitmapDescriptorFactory.fromResource(R.drawable.beer)));
        mMap.addMarker(new MarkerOptions().position(poste).title("The Olde Poste House").icon(BitmapDescriptorFactory.fromResource(R.drawable.beer)).snippet("The cheapest spirits in Merseyside!"));

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
