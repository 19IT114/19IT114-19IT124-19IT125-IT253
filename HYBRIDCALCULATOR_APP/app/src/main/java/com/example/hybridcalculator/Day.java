package com.example.hybridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Scanner;

public class Day extends AppCompatActivity {
    Spinner mspinner,dspinner;
    EditText yr,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);
        mspinner = findViewById(R.id.mspinner);
        dspinner = findViewById(R.id.dspinner);
        yr = findViewById(R.id.yr);
        result = findViewById(R.id.result);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("JANUARY");
        arrayList.add("FEBRUARY");
        arrayList.add("MARCH");
        arrayList.add("APRIL");
        arrayList.add("MAY");
        arrayList.add("JUNE");
        arrayList.add("JULY");
        arrayList.add("AUGUST");
        arrayList.add("SEPTEMBER");
        arrayList.add("OCTOBER");
        arrayList.add("NOVEMBER");
        arrayList.add("DECEMBER");

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mspinner.setAdapter(arrayAdapter1);


        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1");
        arrayList1.add("2");
        arrayList1.add("3");
        arrayList1.add("4");
        arrayList1.add("5");
        arrayList1.add("6");
        arrayList1.add("7");
        arrayList1.add("8");
        arrayList1.add("9");
        arrayList1.add("10");
        arrayList1.add("11");
        arrayList1.add("12");
        arrayList1.add("13");
        arrayList1.add("14");
        arrayList1.add("15");
        arrayList1.add("16");
        arrayList1.add("17");
        arrayList1.add("18");
        arrayList1.add("19");
        arrayList1.add("20");
        arrayList1.add("21");
        arrayList1.add("22");
        arrayList1.add("23");
        arrayList1.add("24");
        arrayList1.add("25");
        arrayList1.add("26");
        arrayList1.add("27");
        arrayList1.add("28");
        arrayList1.add("29");
        arrayList1.add("30");
        arrayList1.add("31");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, arrayList1);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dspinner.setAdapter(arrayAdapter);

    }

    boolean leap(int a) {
        if (a % 100 == 0) {
            if (a % 400 == 0)
                return true;
            else
                return false;
        } else if (a % 4 == 0)
            return true;
        else
            return false;
    }

    public void DayCalc(View view)
    {

        String day[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int maxday[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int d,m,y,td=0,r,i;


            d = Integer.parseInt(dspinner.getSelectedItem().toString());

            m = Integer.parseInt(mspinner.getSelectedItemId()+"")+1;

            if(yr.getText().toString().equals(""))
            {
                result.setText("Invalid Selection");
                return;
            }
            else {
                y = Integer.parseInt(yr.getText().toString());
            }




            if (leap(y))
                maxday[1] = 29;
            if (d > 0 && m > 0 && m < 13 && y > 0 && d <= maxday[m - 1])
            {
                for (i = 1; i < y; i++) {
                    if (leap(i))
                        td = td + 2;
                    else
                        td = td + 1;
                }

                for (i = 0; i < m - 1; i++)
                    td = td + maxday[i];

                td = td + d;

                r = td % 7;
                result.setText(d + "/" + m + "/" + y + " ---> " + day[r]);

            }
            else
            {
                result.setText("Invalid Date Selection");
            }


    }


}