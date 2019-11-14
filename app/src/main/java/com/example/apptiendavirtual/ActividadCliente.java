package com.example.apptiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActividadCliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_cliente);
    }
    public void hacerPedido(View v){
        Intent intent = new Intent(this, ActividadHacerPedidos.class);
        startActivity(intent);
    }
    public void verPedidos(View v){
        Intent intent = new Intent(this, ActividadVerPedidos.class);
        startActivity(intent);
    }
    public void verCompras(View v){
        Intent intent = new Intent(this, ActividadVerCompras.class);
        startActivity(intent);
    }
        public void Salir(View v){
            Intent intent = new Intent(this, TiendaVirtualPrincipal.class);
            startActivity(intent);
            finish();
        }
}
