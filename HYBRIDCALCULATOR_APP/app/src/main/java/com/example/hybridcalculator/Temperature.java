package com.example.hybridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Temperature extends AppCompatActivity {
    Spinner spinner1,spinner2;
    EditText fromt,tot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        fromt = findViewById(R.id.fromw);
        tot = findViewById(R.id.tow);
        spinner1 = findViewById(R.id.spinner25);
        spinner2 = findViewById(R.id.spinner26);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("CELCIUS");
        arrayList.add("FAHRENHEIT");
        arrayList.add("KELVIN");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter);
        spinner2.setAdapter(arrayAdapter);


    }



    public void Convert(View view) {
        int from = (int) spinner1.getSelectedItemId();
        int to = (int) spinner2.getSelectedItemId();


        int c = 1;
        int[][] conversion = {{1,12,13},{21,1,23},{31,32,1}};


                double input = Double.parseDouble(fromt.getText().toString());
                double ans = 0;


                    switch (conversion[from][to]) {
                        case 12: // Celcius to Fahrenheit
                        {
                            ans = (input * 9 / 5) + 32;
                            break;
                        }
                        case 13: //Celcius to Kelvin
                        {
                            ans = input + 273.15;
                            break;
                        }
                        case 21: // Fahrenheit to Celcius
                        {
                            ans = (input - 32) * 5 / 9;
                            break;
                        }
                        case 23: // Fahrenheit to Kelvin
                        {
                            ans = (input - 32) * 5 / 9 + 273.15;
                            break;
                        }
                        case 31: // Kelvin to Celcius
                        {
                            ans = input - 273.15;
                            break;

                        }
                        case 32: // Kelvin to Fahrenheit
                        {
                            ans = (input - 273.15) * 9 / 5 + 32;
                            break;
                        }
                        default: // Conversion to the same type
                        {
                            ans = input;
                            break;
                        }
                    }

                    tot.setText(ans+"");





    }
}