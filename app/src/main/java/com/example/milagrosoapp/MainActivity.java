package com.example.milagrosoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.beeradviser.EnfermedadExperto;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickFindBeer(View view){
        EnfermedadExperto beer = new EnfermedadExperto();

        TextView signos = (TextView) findViewById(R.id.signos);
        Spinner spinner = (Spinner) findViewById(R.id.enfermedades);

        String enfermedadSeleccionada = String.valueOf(spinner.getSelectedItem());

        signos.setText(beer.getBrands(enfermedadSeleccionada).toString());
    }




}