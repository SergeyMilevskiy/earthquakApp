package com.sergey.earthqukeapp.view;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.sergey.coremodule.model.network.Calling;
import com.sergey.coremodule.model.network.NetworkManager;
import com.sergey.coremodule.model.pojo.Feature;
import com.sergey.coremodule.model.pojo.FeatureCollection;
import com.sergey.earthqukeapp.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, Calling {

    private GoogleMap mMap;
    private NetworkManager networkManager;
    private List<Feature> last = new ArrayList<>();
    private FeatureCollection featureCollection;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        networkManager = NetworkManager.getInstance(this, this);
        long time = System.currentTimeMillis();
        Date currentDate = new Date(time);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.WEEK_OF_MONTH, -1);
        Date oldDate = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.US);
        Log.d("Sergey", "time is current " + simpleDateFormat.format(currentDate) + " time is mines week " + simpleDateFormat.format(oldDate));
        networkManager.getLastTenEarthQuke(simpleDateFormat.format(oldDate), simpleDateFormat.format(currentDate));


    }

    @Override
    public void ready() {
        featureCollection = networkManager.getFeatureCollection();
        last.addAll(featureCollection.getFeatures());

        if (mMap != null) {
            for (Feature point : last) {
                mMap.addMarker(new MarkerOptions().position(new LatLng(point.getGeometry().getLongtitude(), point.getGeometry().getLatitude())).title(point.getProperties().getPlace()));
                Log.d("Sergey", " Lat " + point.getGeometry().getLongtitude() + " Lng " + point.getGeometry().getLatitude());
            }
        }
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

        // Add a marker in Sydney and move the camera
        //  LatLng sydney = new LatLng(38.2647, -118.7475);
        //   mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //   mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

}
