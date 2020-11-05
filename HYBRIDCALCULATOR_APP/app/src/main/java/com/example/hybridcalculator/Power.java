package com.example.hybridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Power extends AppCompatActivity {
    Spinner spinner5,spinner6;
    EditText fromp,top;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power);
        fromp = findViewById(R.id.fromw);
        top = findViewById(R.id.tow);
        spinner5 = findViewById(R.id.spinner25);
        spinner6 = findViewById(R.id.spinner26);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("WATTS");
        arrayList.add("KILOWATTS");
        arrayList.add("HORSEPOWER");
        arrayList.add("FOOT-POUNDS/minutes");
        arrayList.add("BTUs/minute");


        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(arrayAdapter1);
        spinner6.setAdapter(arrayAdapter1);


    }



    public void LengthCalc(View view) {
        int from = (int) spinner5.getSelectedItemId();
        int to = (int) spinner6.getSelectedItemId();

        double conversion[][] = {{1,0.001,0.001341,44.25373,0.056869,},
                {1000,1,1.341022,44253.73,56.86902},
                {745.6999,0.7457,1,33000,42.40722},
                {0.022597,0.000023,0.00003,1,0.001285},
                {17.58427,0.017584,0.023581,778.1694,1},

        };

        double input = Double.parseDouble(fromp.getText().toString());
        double ans = input * conversion[from][to];
        top.setText(ans+"");

    }
}