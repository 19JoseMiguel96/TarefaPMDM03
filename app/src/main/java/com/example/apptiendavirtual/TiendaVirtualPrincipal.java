package com.example.apptiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class TiendaVirtualPrincipal extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void comprobarLogin (View v){
        EditText editUsu = findViewById(R.id.editUsuario);
        String usuario = editUsu.getText().toString();
        EditText editPws = findViewById(R.id.editContra);
        String contra = editPws.getText().toString();
        RadioButton radioCliente = findViewById(R.id.radioButton);
        RadioButton radioAdministrador = findViewById(R.id.radioButton2);
        if(radioCliente.isChecked()){
            if (usuario.equals("cliente1") && contra.equals("abc123.")){
                Toast.makeText(this, "Login correcto.",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, ActividadCliente.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(this, "¡Login incorrecto!",Toast.LENGTH_LONG).show();
                editUsu.setText(null);
                editPws.setText(null);
            }
        }

        else if (radioAdministrador.isChecked()){
            if (usuario.equals("admin") && contra.equals("abc123.")){
                Toast.makeText(this, "Login correcto. Bienvenido.", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, ActividadAdministrador.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(this, "¡Login incorrecto!",Toast.LENGTH_LONG).show();
                editUsu.setText(null);
                editPws.setText(null);
            }
        }
        else{
            Toast.makeText(this, "Selecciona el tipo de cuenta a la que quieres acceder.", Toast.LENGTH_LONG).show();
        }


    }
}
