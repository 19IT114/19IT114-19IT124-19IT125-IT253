package com.example.hybridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Angle extends AppCompatActivity {
    Spinner spinner7,spinner8;
    EditText froma,toa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angle);
        froma = findViewById(R.id.fromw);
        toa = findViewById(R.id.tow);
        spinner7 = findViewById(R.id.spinner25);
        spinner8 = findViewById(R.id.spinner26);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("DEGREES");
        arrayList.add("RADIANS");
        arrayList.add("GRADIANS");



        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7.setAdapter(arrayAdapter1);
        spinner8.setAdapter(arrayAdapter1);


    }



    public void AngleCalc(View view) {
        int from = (int) spinner7.getSelectedItemId();
        int to = (int) spinner8.getSelectedItemId();

        double conversion[][] = {{1,0.017453,1.111111},
                                {57.29578,1,63.66198},
                                {0.9,0.015708,1}};

        double input = Double.parseDouble(froma.getText().toString());
        double ans = input * conversion[from][to];
        toa.setText(ans+"");

    }
}