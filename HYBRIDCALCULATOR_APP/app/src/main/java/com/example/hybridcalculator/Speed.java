package com.example.hybridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Speed extends AppCompatActivity {
    Spinner spinner9,spinner10;
    EditText froma,toa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
        froma = findViewById(R.id.fromw);
        toa = findViewById(R.id.tow);
        spinner9 = findViewById(R.id.spinner25);
        spinner10 = findViewById(R.id.spinner26);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("CENTIMETRES PER SECOND");
        arrayList.add("METERES PER SECOND");
        arrayList.add("KILOMETRES PER HOUR");
        arrayList.add("FEET PER SECOND");
        arrayList.add("MILES PER HOUR");
        arrayList.add("KNOTS");
        arrayList.add("MACH");



        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner9.setAdapter(arrayAdapter1);
        spinner10.setAdapter(arrayAdapter1);


    }



    public void SpeedCalc(View view) {
        int from = (int) spinner9.getSelectedItemId();
        int to = (int) spinner10.getSelectedItemId();

        double conversion[][] = {{1,0.01,0.036,0.032808,0.022371,0.01944,0.000029},
                {100,1,3.6,3.28084,2.237136,1.944012,0.002939},
                {27.77778,0.277778,1,0.911344,0.621427,0.54003,0.000816},
                {30.48,0.3048,1.09728,1,0.681879,0.592535,0.000896},
                {44.7,0.447,1.6092,1.466535,1,0.868974,0.001314},
                {51.44,0.5144,1.85184,1.687664,1.150783,1,0.001512},
                {34030,340.3,1225.08,1116.47,761.2975,661.5474,1},
        };

        double input = Double.parseDouble(froma.getText().toString());
        double ans = input * conversion[from][to];
        toa.setText(ans+"");

    }
}