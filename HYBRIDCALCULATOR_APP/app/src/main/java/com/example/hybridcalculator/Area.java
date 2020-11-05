package com.example.hybridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Area extends AppCompatActivity {
    Spinner spinner13,spinner14;
    EditText froma,toa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        froma = findViewById(R.id.fromw);
        toa = findViewById(R.id.tow);
        spinner13 = findViewById(R.id.spinner25);
        spinner14 = findViewById(R.id.spinner26);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("SQUARE MILLIMETRES");
        arrayList.add("SQUARE CENTIMETRES");
        arrayList.add("SQUARE METRES");
        arrayList.add("HECTARES");
        arrayList.add("SQUARE KILOMETRES");
        arrayList.add("SQUARE INCHES");
        arrayList.add("SQUARE FEET");
        arrayList.add("SQUARE YARDS");
        arrayList.add("ACRES");
        arrayList.add("SQUARE MILES");




        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner13.setAdapter(arrayAdapter1);
        spinner14.setAdapter(arrayAdapter1);


    }



    public void AreaCalc(View view) {
        int from = (int) spinner13.getSelectedItemId();
        int to = (int) spinner14.getSelectedItemId();

        double conversion[][] = {{1,0.01,0.000001,0.0000000001,1.000000e-12,0.00155,0.000011,0.000001,2.47105e-10,3.86e-13},
                {100,1,0.0001,0.00000001,0.0000000001,0.155,0.001076,0.00012,2.47105e-8,3.86e-11},
                {1000000,10000,1,0.0001,0.000001,1550.003,10.76391,1.19599,0.000247,3.86102159e-7},
                {1.0e+10,1.0e+8,10000,1,0.01,15500031,107639.1,11959.9,2.471054,0.003861},
                {1.0e+12,10.0e+10,1000000,100,1,1550003100,10763910,1195990,247.1054,0.3861},
                {645.16,6.4516,0.000645,6.4516e-8,6.4516e-10,1,0.006944,0.000772,1.59422508e-7,2.49098e-10},
                {92903.04,929.0304,0.09290304,9.0e-6,9.20304e-8,144,1,0.111111,0.000023,3.587e-8},
                {836127.4,8361.274,0.8361274,0.000084,8.3612736e-7,1296,9,1,0.000207,3.2283e-7},
                {4.046856422e+10,4.046856422e+8,4046.856,0.404686,0.004047,6272640,43560,4840,1,0.001563},
                {2.5899988110336e+12,2.5899988110336e+10,2589988,258.9988,2.589988,4014489600.0,27878400.0,307600,640,1}
        };

        double input = Double.parseDouble(froma.getText().toString());
        double ans = input * conversion[from][to];
        toa.setText(ans+"");

    }
}