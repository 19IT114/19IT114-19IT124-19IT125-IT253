package com.example.hybridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Ressistance extends AppCompatActivity {
    Button btn;
    TextView result;
    Spinner spinner1,spinner2,tolspinner,mulspinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ressistance);

        btn = findViewById(R.id.btn);
        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        mulspinner = findViewById(R.id.mulspinner);
        tolspinner = findViewById(R.id.tolspinner);
        result = findViewById(R.id.result);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("BLACK");
        arrayList.add("BROWN");
        arrayList.add("RED");
        arrayList.add("ORANGE");
        arrayList.add("YELLOW");
        arrayList.add("GREEN");
        arrayList.add("BLUE");
        arrayList.add("VIOLET");
        arrayList.add("GREY");
        arrayList.add("WHITE");


        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter1);
        spinner2.setAdapter(arrayAdapter1);
        ArrayList<String> arrayList1 = new ArrayList<>(arrayList);
        arrayList1.add("GOLD");
        arrayList1.add("SILVER");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList1);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mulspinner.setAdapter(arrayAdapter);
        tolspinner.setAdapter(arrayAdapter);




    }

    public void Resistor(View view)
    {
        double res = 0.0;
        int flag = 0, c = 0;
        int mul = -1;
        int band = 0;
        int tol = 0;
        int repeat = 1;
        String[] ResColor = {"BLACK", "BROWN", "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "VIOLET", "GREY", "WHITE", "GOLD", "SILVER"};
        double[] tolerance = {0, 1, 2, 0.05, 0.02, 0.5, 0.25, 0.1, 0.05, 0, 5, 10};
        int[] tempco = {250, 100, 50, 15, 25, 20, 10, 5, 1, 0, 0, 0};

            int bands = 4;

                String[] color = new String[bands];
               color[0] = spinner1.getSelectedItem().toString();
               color[1] = spinner2.getSelectedItem().toString();
               color[2] = mulspinner.getSelectedItem().toString();
               color[3] = tolspinner.getSelectedItem().toString();


                for (int i = 0; i < bands; i++)
                {
                    for (int j = 0; j < ResColor.length; j++) {
                        if (i <= bands - 3) {
                            if (color[i].toUpperCase().equals(ResColor[j]) == true) {
                                res = (res * 10) + j;
                            }
                        } else {
                            if (color[i].toUpperCase().equals(ResColor[j]) == true) {
                                if (mul == -1)
                                    mul = j;
                                tol = j;
                            }
                        }

                    }
                }



                       result.setText("Ressistance = " + (res / 10) + " x 10^" + (mul + 1) + " Ω "+tolerance[tol]+"%");
                }




        }

