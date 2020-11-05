package com.example.hybridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Time extends AppCompatActivity {
    Spinner spinner11,spinner12;
    EditText fromt,tot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        fromt = findViewById(R.id.fromw);
        tot = findViewById(R.id.tow);
        spinner11 = findViewById(R.id.spinner25);
        spinner12 = findViewById(R.id.spinner26);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("MICROSECOND");
        arrayList.add("MILLISECOND");
        arrayList.add("SECONDS");
        arrayList.add("MINUTES");
        arrayList.add("HOURS");
        arrayList.add("DAYS");
        arrayList.add("WEEK");
        arrayList.add("YEARS");



        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner11.setAdapter(arrayAdapter1);
        spinner12.setAdapter(arrayAdapter1);


    }



    public void TimeCalc(View view) {
        int from = (int) spinner11.getSelectedItemId();
        int to = (int) spinner12.getSelectedItemId();

        double conversion[][] = {{1,0.001,1.0e-6,1.67e-8,2.78e-11,1.1574e-11,1.653e-13,3.2e-14},
                {1000,1,1.0e-3,1.7e-5,2.78e-8,1.1574e-8,1.653439e-9,3.168e-11},
                {1.0e6,1000,1,1.67e-2,2.78e-4,1.2e-5,2.0e-6,3.168e-8},
                {6.0e7,60000,60,1,1.67e-2,6.94e-4,9.9e-5,2.0e-6},
                {36e8,36e5,3600,60,1,4.167e-2,5.952e-3,1.14e-4},
                {8.64e10,8.64e7,86400,1440,24,1,1.42857e-1,2.738e-3},
                {6.048e11,6.048e8,604800,10080,168,7,1,1.9165e-2},
                {3.15576e13,3.15576e10,3.15576e7,525960,8766,365.25,522.17857,1}
        };

        double input = Double.parseDouble(fromt.getText().toString());
        double ans = input * conversion[from][to];
        tot.setText(ans+"");

    }
}