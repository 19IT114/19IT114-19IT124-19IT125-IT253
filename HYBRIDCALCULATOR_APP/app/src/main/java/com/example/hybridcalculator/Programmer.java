package com.example.hybridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Programmer extends AppCompatActivity {
    int tag = 1;
    EditText et1,et2,et3,et4;
    Button btn,rst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programmer);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        btn = findViewById(R.id.btn);
    }

    public void getTag(View view)
    {
        tag =  Integer.parseInt(view.getTag().toString());
    }


    public void convert(View view)
    {
        String bin = "", hex = "", oct = "", dec = "";

        switch (tag) {
            case 1: {
                try {
                    String no = et1.getText().toString();
                    dec = no;
                    bin = Integer.toBinaryString(Integer.parseInt(no));
                    oct = Integer.toOctalString(Integer.parseInt(no));
                    hex = Integer.toHexString(Integer.parseInt(no));
                }
                catch (Exception e)
                {
                    et1.setText("Invalid Decimal Number");
                }
                break;
            }
            case 2: {
                try {
                    String no = et2.getText().toString();
                    dec = String.valueOf(Integer.parseInt(no, 2));
                    bin = no;
                    oct = Integer.toOctalString(Integer.parseInt(dec));
                    hex = Integer.toHexString(Integer.parseInt(dec));
                }
                catch(Exception e)
                {
                    et2.setText("Invalid Binary Number");
                }
                break;
            }
            case 3: {
                try {
                    String no = et3.getText().toString();
                    dec = String.valueOf(Integer.parseInt(no, 8));
                    bin = Integer.toBinaryString(Integer.parseInt(dec));
                    oct = no;
                    hex = Integer.toHexString(Integer.parseInt(dec));
                }
                catch (Exception e)
                {
                    et3.setText("Invalid Octal Number");
                }
                break;
            }
            case 4: {
                try {
                    String no = et4.getText().toString();
                    dec = String.valueOf(Integer.parseInt(no, 16));
                    bin = Integer.toBinaryString(Integer.parseInt(dec));
                    oct = Integer.toOctalString(Integer.parseInt(dec));
                    hex = no;
                }
                catch (Exception e)
                {
                    et4.setText("Invalid Hexa Decimal Number");
                }
                break;
            }
            
        }
        et1.setText(dec);
        et2.setText(bin);
        et3.setText(oct);
        et4.setText(hex.toUpperCase());
    }

    public void reset(View view) {
        et1.setText(null);
        et2.setText(null);
        et3.setText(null);
        et4.setText(null);
    }
}