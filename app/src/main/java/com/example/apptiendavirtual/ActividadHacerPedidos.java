package com.example.apptiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ActividadHacerPedidos extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinnerCat, spinnerPro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_hacer_pedidos);
        spinnerCat =  findViewById(R.id.spinnerCategorias);
        spinnerPro = findViewById(R.id.spinnerProductos);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.categorias_ud02_spinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCat.setAdapter(adapter);
        spinnerCat.setOnItemSelectedListener(this);
        //spinner para la cantidad a comprar
        Spinner spinnerCan = findViewById(R.id.spinnerCantidad);
        Integer[] items = new Integer[]{1,2,3,4,5};
        ArrayAdapter<Integer> adapter2 = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_item, items);
        spinnerCan.setAdapter(adapter2);
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        int[] productos={R.array.productos_ud02_spinner, R.array.productos2_ud02_spinner,
                R.array.productos3_ud02_spinner};
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                productos[pos],android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerPro.setAdapter(adapter);
    }
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void confirmarPedido (View v){
        Intent intent = new Intent(this, ActividadDireccion.class);
        Spinner spinner1 =  findViewById(R.id.spinnerCategorias);
        Spinner spinner2 =  findViewById(R.id.spinnerProductos);
        Spinner spinner3 =  findViewById(R.id.spinnerCantidad);
        intent.putExtra("categoria",spinner1.getSelectedItem().toString());
        intent.putExtra("producto", spinner2.getSelectedItem().toString());
        intent.putExtra("cantidad", spinner3.getSelectedItem().toString());
        startActivity(intent);
    }



}
