package com.example.user.p12mapas;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivityTipos extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Button btnHibrido, btnnormal, btnsatelite, btnterreno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_tipos);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);


        mapFragment.getMapAsync(this);
        btnHibrido=findViewById(R.id.btn_hibrido);
        btnnormal=findViewById(R.id.brn_Normal);
        btnsatelite=findViewById(R.id.btn_satelite);
        btnterreno=findViewById(R.id.btn_Terreno);

    }
    public void cambiarHibrido(View view){mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);}
    public void cambiarNormal(View view){mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);}
    public void cambiarSatelite(View view){mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);}
    public void cambiarTerreno(View view){mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);}


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
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
