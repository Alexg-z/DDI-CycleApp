package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Variables
    private EditText et1;
    private EditText et2;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Enlace entre parte visual y logica
        et1 = findViewById(R.id.txtnum1); // Formar rapida
        et2 = (EditText) findViewById(R.id.txtnum2); //Casting
        tv1 = (TextView) findViewById(R.id.txw_resultado);

    }
    // Metodos
    public void sumar(View view){
        //Formato cadena
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int resp = num1 + num2;

        String res = String.valueOf(resp);

        tv1.setText(res);

    }

}