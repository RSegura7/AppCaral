package com.example.proyectoturismocaral;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {r

    TextView btnMiUbicacion,btnQueHacemos, btnGaleria, btnHotelesRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

       btnMiUbicacion = (TextView) findViewById(R.id.btnUbicacion);
        btnQueHacemos = (TextView) findViewById(R.id.btnQueHacer);
        btnGaleria = (TextView) findViewById(R.id.btnGaleria);
        btnHotelesRestaurantes = (TextView)findViewById(R.id.btnRestaurantHoteles);


        btnMiUbicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PrincipalActivity.this, MapsActivity.class);
                intent.putExtra("idSitio","1");
                startActivity(intent);

            }
        });

        btnGaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrincipalActivity.this, GaleriaActivity.class);
                intent.putExtra("idSitio","1");
                startActivity(intent);
            }
        });

        btnQueHacemos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrincipalActivity.this, WhatToDoActivity.class);
                intent.putExtra("idSitio","1");
                startActivity(intent);
            }
        });

        btnHotelesRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrincipalActivity.this, RestauranteHotel.class);
                intent.putExtra("idSitio","1");
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Quieres Salir de la aplicación");
        builder.setTitle("Mensaje...");
        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
                return;
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

}
