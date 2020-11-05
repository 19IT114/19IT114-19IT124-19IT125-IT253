package com.example.hybridcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView cv1,cv2,cv3,cv4,cv5,cv6,cv7,cv8,cv9,cv10,cv11,cv12,cv13,cv14,cv15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cv1 = findViewById(R.id.cv1);
        cv2 = findViewById(R.id.cv2);
        cv3 = findViewById(R.id.cv3);
        cv4 = findViewById(R.id.cv4);
        cv5 = findViewById(R.id.cv5);
        cv6 = findViewById(R.id.cv6);
        cv7 = findViewById(R.id.cv7);
        cv8 = findViewById(R.id.cv8);
        cv9 = findViewById(R.id.cv9);
        cv10 = findViewById(R.id.cv10);
        cv11 = findViewById(R.id.cv11);
        cv12 = findViewById(R.id.cv12);
        cv13 = findViewById(R.id.cv13);
        cv14 = findViewById(R.id.cv14);
        cv15 = findViewById(R.id.cv15);
    }

    public void Clicked(View view)
    {
        int tag  = Integer.parseInt(view.getTag().toString());
        switch (tag)
        {
            case 1: {
                System.out.println("Temperature");
                Intent intent = new Intent(MainActivity.this, Temperature.class);
                startActivity(intent);
                break;
            }
            case 2:
            {
                System.out.println("Angle");
                Intent intent = new Intent(MainActivity.this, Angle.class);
                startActivity(intent);
                break;
            }
            case 3:
            {
                System.out.println("Weight and Mass");
                Intent intent = new Intent(MainActivity.this, WeightandMass.class);
                startActivity(intent);
                break;
            }
            case 4:
            {
                System.out.println("Length");
                Intent intent = new Intent(MainActivity.this, Length.class);
                startActivity(intent);
                break;
            }
            case 5:
            {
                System.out.println("Speed");
                Intent intent = new Intent(MainActivity.this, Speed.class);
                startActivity(intent);
                break;
            }
            case 6:
            {
                System.out.println("Time");
                Intent intent = new Intent(MainActivity.this, Time.class);
                startActivity(intent);
                break;
            }
            case 7:
            {
                System.out.println("Area");
                Intent intent = new Intent(MainActivity.this, Area.class);
                startActivity(intent);
                break;
            }
            case 8:
            {
                System.out.println("Power");
                Intent intent = new Intent(MainActivity.this, Power.class);
                startActivity(intent);
                break;
            }
            case 9:
            {
                System.out.println("Volume");
                Intent intent = new Intent(MainActivity.this, Volume.class);
                startActivity(intent);
                break;
            }
            case 10:
            {
                System.out.println("Energy");
                Intent intent = new Intent(MainActivity.this, Energy.class);
                startActivity(intent);
                break;
            }
            case 11:
            {
                System.out.println("Data");
                Intent intent = new Intent(MainActivity.this, Data.class);
                startActivity(intent);
                break;
            }
            case 12:
            {
                System.out.println("Pressure");
                Intent intent = new Intent(MainActivity.this, Pressure.class);
                startActivity(intent);
                break;
            }
            case 13:
            {
                System.out.println("Ressistance");
                Intent intent = new Intent(MainActivity.this, Ressistance.class);
                startActivity(intent);
                break;
            }
            case 14:
            {
                System.out.println("Day");
                Intent intent = new Intent(MainActivity.this, Day.class);
                startActivity(intent);
                break;
            }
            case 15:
            {
                System.out.println("Programmer");
                Intent intent = new Intent(MainActivity.this, Programmer.class);
                startActivity(intent);
                break;
            }

        }
    }
}