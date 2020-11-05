package com.example.hybridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Length extends AppCompatActivity {
    Spinner spinner3,spinner4;
    EditText froml,tol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        froml = findViewById(R.id.fromw);
        tol = findViewById(R.id.tow);
        spinner3 = findViewById(R.id.spinner25);
        spinner4 = findViewById(R.id.spinner26);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("NANOMETRES");
        arrayList.add("MICRONS");
        arrayList.add("MILLIMETRES");
        arrayList.add("CENTIMETRES");
        arrayList.add("METRES");
        arrayList.add("KILOMETRES");
        arrayList.add("INCHES");
        arrayList.add("FEET");
        arrayList.add("YARDS");
        arrayList.add("MILES");
        arrayList.add("NAUTICAL MILES");

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(arrayAdapter1);
        spinner4.setAdapter(arrayAdapter1);


    }



    public void LengthCalc(View view) {
        int from = (int) spinner3.getSelectedItemId();
        int to = (int) spinner4.getSelectedItemId();

        double conversion[][] = {
                {1,1.0e-3,1.0e-6,1.0e-7,1.0e-9,1.0e-12,3.9370079e-8,3.28084e-9,1.093613e-9,6.21e-13,5.4e-13},
                {1000,1,1.0e-3,1.0e-4,1.0e-6,1.0e-9,3.9e-5,3.2e-6,1.09e-6,6.21e-10,5.39957e-10},
                {1.0e6,1000,1,1.0e-1,1.0e-3,1.0e-6,3.9e-2,3.281e-3,1.094e-3,6.21e-7,5.39957e-7},
                {1.0e5,10000,10,1,1.0e-2,1.0e-5,3.937e-1,3.2808e-2,1.0936e-2,6.21e-6,5.39957e-6},
                {1.0e9,1.0e6,1.0e3,100,1,1.0e-3,39.37008,3.28084,1.093613,6.21e-4,5.39957e-4},
                {1.0e12,1.0e3,1.0e6,100000,1000,1,39370.08,3280.84,1093.613,0.621371,0.53957},
                {25400000,25400,25.4,2.54,0.0254,2.54e-5,1,8.333e-2,2.7778e-2,1.6e-5,1.4e-5},
                {304800000,304800,304.8,30.48,0.3048,3.05e-4,12,1,0.33333,0.000189,0.000165},
                {914400000,914400,914.4,91.44,0.9144,9.14e-4,36,3,1,5.68e-4,4.94e-4},
                {1609344e6,1609344000,1609344,160934.4,1609.344,1.609344,63360,5280,1760,1,0.868976},
                {1852e9,1852000000,1852000,185200,1852,1.852,72913.39,6076.115,2025.372,1.150779,1}
        };

        double input = Double.parseDouble(froml.getText().toString());
        double ans = input * conversion[from][to];
        tol.setText(ans+"");

    }
}