package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Casamiento vista -- logica (id)
        //Clase para mensaje emergentes (Toast)
        Toast.makeText(this,"Metodo onCreate",Toast.LENGTH_SHORT).show();
    }
    //Methods
    @Override
    protected void onStart() {
        super.onStart();
        //Clase para mensaje emergentes (Toast)
        Toast.makeText(this,"Metodo onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        //Clase para mensaje emergentes (Toast)
        Toast.makeText(this,"Metodo onResume",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause(){
        super.onPause();
        //Clase para mensaje emergentes (Toast)
        Toast.makeText(this,"Metodo onPause",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart(){
        super.onRestart();
        //Clase para mensaje emergentes (Toast)
        Toast.makeText(this,"Metodo onRestart",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop(){
        super.onStop();
        //Clase para mensaje emergentes (Toast)
        Toast.makeText(this,"Metodo onStop",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        //Clase para mensaje emergentes (Toast)
        Toast.makeText(this,"Metodo onDestroy",Toast.LENGTH_SHORT).show();

    }

}