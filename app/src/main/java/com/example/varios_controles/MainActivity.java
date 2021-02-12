package com.example.varios_controles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingresar = (Button) findViewById(R.id.btnIngresar);
    }

    public void ingresar_registro(View view){
        Intent registro = new Intent(this,Registro.class);
        startActivity(registro);
    }
}