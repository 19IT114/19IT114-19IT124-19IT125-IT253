package com.example.hybridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Pressure extends AppCompatActivity {
    Spinner spinner21,spinner22;
    EditText frompr,topr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);
        frompr = findViewById(R.id.fromw);
        topr = findViewById(R.id.tow);
        spinner21 = findViewById(R.id.spinner25);
        spinner22 = findViewById(R.id.spinner26);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ATMOSPHERES");
        arrayList.add("BARS");
        arrayList.add("KILO-PASCALS");
        arrayList.add("MILLIMETRES OF MERCURY");
        arrayList.add("PASCALS");
        arrayList.add("POUNDS PER SQUARE INCH");





        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner21.setAdapter(arrayAdapter1);
        spinner22.setAdapter(arrayAdapter1);


    }



    public void PressureCalc(View view) {
        int from = (int) spinner21.getSelectedItemId();
        int to = (int) spinner22.getSelectedItemId();

        double conversion[][] = {{1,1.01325,101.325,760.1275,101325,14.69595},
                {0.986923,1,100,750.1875,100000,14.50377},
                {0.009869,0.01,1,7.501875,1000,0.145038},
                {0.001316,0.001333,0.1333,1,133.3,0.019334},
                {0.0000098692,0.00001,0.001,0.007502,1,0.000145},
                {0.068046,0.068948,6.894757,51.72361,6894.757,1}};
        double input = Double.parseDouble(frompr.getText().toString());
        double ans = input * conversion[from][to];
        topr.setText(ans+"");

    }
}