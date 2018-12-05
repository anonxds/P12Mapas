package com.example.user.p12mapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnSitios,btnTipos,btnUbicacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSitios=findViewById(R.id.btm_sitios);
        btnSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intent);
            }
        });

    }
    public void chante(View view){
        Intent i = new Intent(getApplicationContext(), MapsActivityTipos.class);
        startActivity(i);
    }
    public void milocalizacion(View view){
      //  Intent i = new Intent(getApplicationContext(), );
       // startActivity(i);
    }
}
