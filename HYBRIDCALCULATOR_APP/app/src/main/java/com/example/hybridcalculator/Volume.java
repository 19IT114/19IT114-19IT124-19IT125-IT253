package com.example.hybridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Volume extends AppCompatActivity {
    Spinner spinner15,spinner16;
    EditText fromv,tov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
        fromv = findViewById(R.id.fromw);
        tov = findViewById(R.id.tow);
        spinner15 = findViewById(R.id.spinner25);
        spinner16 = findViewById(R.id.spinner26);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("MILLILITRES");
        arrayList.add("CUBIC CENTIMETRES");
        arrayList.add("LITRES");
        arrayList.add("CUBIC METRES");
        arrayList.add("TEASPOONS");
        arrayList.add("TABLESPOONS");
        arrayList.add("FLUID OUNCES");
        arrayList.add("CUPS (US)");
        arrayList.add("PINTS (US)");
        arrayList.add("QUARTS (US)");
        arrayList.add("GALLONS (US)");
        arrayList.add("CUBIC INCHES");
        arrayList.add("CUBIC FEET");
        arrayList.add("CUBIC YARDS");
        arrayList.add("TEASPOONS (UK)");
        arrayList.add("TABLESPOONS (UK)");
        arrayList.add("FLUID OUNCES (UK)");
        arrayList.add("PINTS (UK)");
        arrayList.add("QUARTS (UK)");
        arrayList.add("GALLONS (UK)");




        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner15.setAdapter(arrayAdapter1);
        spinner16.setAdapter(arrayAdapter1);


    }



    public void VolumeCalc(View view) {
        int from = (int) spinner15.getSelectedItemId();
        int to = (int) spinner16.getSelectedItemId();

        double conversion[] = {1,1,0.001,0.000001,0.202884,0.067628,0.033814,0.004227,0.002113,0.001057,0.000264,0.061024,0.000035,0.000001,0.168936,0.056312,0.035195,0.00176,0.00088,0.00022};
        double input = Double.parseDouble(fromv.getText().toString());
        double ans = 0;
        if(from < to) {
            ans = input * (conversion[to]/conversion[from]);
        }
        else
            ans = input / (conversion[from]/conversion[to]);

        tov.setText(ans+"");

    }
}