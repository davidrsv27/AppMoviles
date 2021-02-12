package com.example.varios_controles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Pago extends AppCompatActivity {
    private TextView pago_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);
        impresion_pantalla();
    }
    private void impresion_pantalla(){
        Bundle recoge_datos = getIntent().getExtras();
        double pago =
                recoge_datos.getDouble("pago");
        pago_resultado =
                (TextView)findViewById(R.id.tvResultadoPago);
        pago_resultado.setText(pago+"");
    }
}