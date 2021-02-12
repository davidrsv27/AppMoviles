package com.example.varios_controles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Registro extends AppCompatActivity {
    private EditText etNombre_Mascota;
    private RadioButton rb_Gato, rb_Perro;
    private Button btn_Registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        etNombre_Mascota=(EditText) findViewById(R.id.etNombreMascota);
        rb_Gato = (RadioButton) findViewById(R.id.rbGato);
        rb_Perro = (RadioButton) findViewById(R.id.rbPerro);
    }

    public void total_pago(View view){
        String nombre = etNombre_Mascota.getText().toString();
        String tipo;

        if (rb_Perro.isChecked() == true) {
            tipo = "perro";
        }else {
            tipo = "gato";
        }
        Mascota m1 = new Mascota(nombre,tipo);
        double pago = m1.pago();
        //Para pasar los parámetros lo hacemos con un objeto Intent, se coloca el activity origen y
        //el destino
        Intent resultado_pago = new Intent(this, Pago.class);
        resultado_pago.putExtra("pago",pago);
        startActivity(resultado_pago);

    }
}