package com.example.apptiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActividadDireccion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_direccion);
    }
    public void finalizarPedido(View v){
        Bundle extras = getIntent().getExtras();
        String categoria = extras.getString("categoria");
        String producto = extras.getString("producto");
        String cantidad = extras.getString("cantidad");
        EditText direccion1 = findViewById(R.id.editText2);
        EditText ciudad1 = findViewById(R.id.editText);
        EditText cp1 = findViewById(R.id.editText3);
        String direccion = direccion1.getText().toString();
        String ciudad = ciudad1.getText().toString();
        String cp = cp1.getText().toString();
        if(ciudad.equals("") | direccion.equals("") | cp.equals("")) {
            Toast.makeText(this, "Rellena todos los datos de envío.", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "-Resumen de compra: " + categoria + " (categoría), " + producto + " (producto), "
                    +cantidad + " (cantidad). " + "-Datos de envío: " +
                    direccion+" (direccion), "+ ciudad+" (ciudad), " + cp+" (código postal)", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ActividadCliente.class);
            startActivity(intent);
            finish();
        }
    }
}
