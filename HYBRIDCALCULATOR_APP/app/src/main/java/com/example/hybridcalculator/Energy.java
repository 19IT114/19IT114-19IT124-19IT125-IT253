package com.example.hybridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Energy extends AppCompatActivity {
    Spinner spinner17,spinner18;
    EditText frome,toe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy);
        frome = findViewById(R.id.fromw);
        toe = findViewById(R.id.tow);
        spinner17 = findViewById(R.id.spinner25);
        spinner18 = findViewById(R.id.spinner26);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ELECTRON VOLTS");
        arrayList.add("JOULES");
        arrayList.add("KILOJOULES");
        arrayList.add("THERMAL CALORIES");
        arrayList.add("FOOD CALORIES");
        arrayList.add("BRITISH THERMAL UNIT");





        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner17.setAdapter(arrayAdapter1);
        spinner18.setAdapter(arrayAdapter1);


    }



    public void EnergyCalc(View view) {
        int from = (int) spinner17.getSelectedItemId();
        int to = (int) spinner18.getSelectedItemId();

        double conversion[][] = {{1,1.602177e-19,1.602177e-22,3.829294e-20,3.829294e-23,1.181705e-19,1.518570e-22},
                {6.241509e18,1,0.001,0.239006,0.000239,0.737562,0.000948},
                {6.241509e+21,1000,1,239.006,0.239006,737.5621,0.947817},
                {2.6114489e+19,4.184,0.004184,1,0.001,3.08596,0.003966},
                {2.611448e+22,4184,4.184,1000,1,3085.96,3.965666},
                {8.462350e+18,1.355818,0.001356,0.324048,0.000324,1,0.001285},
                {6.585142e+21,1055.056,1.055056,252.1644,0.252164,778.1694,1}};
        double input = Double.parseDouble(frome.getText().toString());
        double ans = input * conversion[from][to];
        toe.setText(ans+"");

    }
}