package com.example.hybridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Data extends AppCompatActivity {
    Spinner spinner19,spinner20;
    EditText fromd,tod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        fromd = findViewById(R.id.fromw);
        tod = findViewById(R.id.tow);
        spinner19 = findViewById(R.id.spinner25);
        spinner20 = findViewById(R.id.spinner26);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("BYTES");
        arrayList.add("KILOBYTES");
        arrayList.add("MEGABYTES");
        arrayList.add("GIGABYTES");
        arrayList.add("TERABYTES");
        arrayList.add("PETABYTES");
        arrayList.add("EXABYTES");
        arrayList.add("ZETABYTES");
        arrayList.add("YOTTABYTES");





        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner19.setAdapter(arrayAdapter1);
        spinner20.setAdapter(arrayAdapter1);


    }



    public void DataCalc(View view) {
        int from = (int) spinner19.getSelectedItemId();
        int to = (int) spinner20.getSelectedItemId();

        double conversion[][] = {{1,0.001,0.000001,0.000000001,1.000000e-12,1.000000e-15,1.000000e-18,1.000000e-21,1.000000e-24},
                {1000,1,0.001,0.000001,0.000000001,1.000000e-12,1.000000e-15,1.000000e-18,1.000000e-21},
                {1000000,1000,1,0.001,0.000001,0.000000001,1.000000e-12,1.000000e-15,1.000000e-18},
                {1.0e+9,1000000,1000,1,0.001,0.000001,0.000000001,1.000000e-12,1.000000e-15},
                {1.0e+12,10.0e+9,1000000,1000,1,0.001,0.000001,0.000000001,1.000000e-12},
                {1.0e+15,10.0e+12,10.0e+9,1000000,1000,1,0.001,0.000001,0.000000001},
                {1.0e+18,10.0e+15,10.0e+12,10.0e+9,1000000,1000,1,0.001,0.000001},
                {1.0e+21,10.0e+18,10.0e+15,10.0e+12,10.0e+9,1000000,1000,1,0.001},
                {1.0e+24,10.0e+21,10.0e+18,10.0e+15,10.0e+12,10.0e+9,1000000,1000}};
        double input = Double.parseDouble(fromd.getText().toString());
        double ans = input * conversion[from][to];
        tod.setText(ans+"");

    }
}