package com.example.hybridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class WeightandMass extends AppCompatActivity {
    Spinner spinner25,spinner26;
    EditText fromw,tow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weightand_mass);
        fromw = findViewById(R.id.fromw);
        tow = findViewById(R.id.tow);
        spinner25 = findViewById(R.id.spinner25);
        spinner26 = findViewById(R.id.spinner26);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("CARATS");
        arrayList.add("MILLIGRAMS");
        arrayList.add("CENTIGRAMS");
        arrayList.add("DECIGRAMS");
        arrayList.add("GRAMS");
        arrayList.add("DECAGRAMS");
        arrayList.add("HECTOGRAMS");
        arrayList.add("KILOGRAMS");
        arrayList.add("METRIC TONNES");
        arrayList.add("OUNCES");
        arrayList.add("POUNDS");
        arrayList.add("STONE");
        arrayList.add("SHORT TONS (US)");
        arrayList.add("LONG TONS (UK)");





        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner25.setAdapter(arrayAdapter1);
        spinner26.setAdapter(arrayAdapter1);


    }



    public void WAMCalc(View view) {
        int from = (int) spinner25.getSelectedItemId();
        int to = (int) spinner26.getSelectedItemId();

        double conversion[] = {1,200,20,2,0.2,0.02,0.002,0.0002,0.0000002,0.007055,0.000441,0.000031,0.000000220462262,0.000000196841306};

        double input = Double.parseDouble(fromw.getText().toString());
        double ans = 0;

        if(from < to) {
            ans = input * (conversion[to]/conversion[from]);
        }
        else
            ans = input / (conversion[from]/conversion[to]);
        tow.setText(ans+"");

    }
}