package com.example.calcularimc;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private EditText editPeso;
    private EditText editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);


    }

    public void calcularImc(View view){
        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());
        double resultadoImc = peso / (altura * altura);

        if(resultadoImc < 18.5){
            textResultado.setText("Imc: "+ resultadoImc +"\nAbaixo do peso");

        } else if (resultadoImc >= 18.5 && resultadoImc <= 24.9){
            textResultado.setText("Imc: "+ resultadoImc +"\nPeso normal");

        } else if (resultadoImc >= 25 && resultadoImc <= 29.9){
            textResultado.setText("Imc: "+ resultadoImc +"\nSobrepeso");

        } else if (resultadoImc >= 30 && resultadoImc <= 34.9){
            textResultado.setText("Imc: "+ resultadoImc +"\nObesidade grau 1");

        } else if (resultadoImc >= 35 && resultadoImc <= 39.9){
            textResultado.setText("Imc: "+ resultadoImc +"\nObesidade grau 2");

        } else if (resultadoImc >= 40){
            textResultado.setText("Imc: "+ resultadoImc +"\nObesidade grau 3");

        }
    }

}