package com.example.auladh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    void mostrarMedia(View view){
        EditText eTprimeiroB = (EditText) findViewById(R.id.eTprimeiroB);
        EditText eTsegundoB = (EditText) findViewById(R.id.eTsegundoB);
        EditText eTterceiroB = (EditText) findViewById(R.id.eTterceiroB);
        EditText eTquartoB = (EditText) findViewById(R.id.eTquartoB);
        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);
        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        Utils utils = new Utils();
        float mediaFinal = utils.calcularMedia(eTprimeiroB, eTsegundoB, eTterceiroB, eTquartoB);
        tvResultado.setText("A média final é: " + mediaFinal);
    }
}