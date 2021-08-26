package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Button0, Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9, ButtonAddition, ButtonSubtraction, ButtonMultiplication, ButtonDivision, ButtonEqual, ButtonDot, ButtonClear;
    TextView TextViewIO;
    double mValueOne;
    float mValueTwo;
    boolean addition, subtract, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button0 = findViewById(R.id.Button0);
        Button1 = findViewById(R.id.Button1);
        Button2 = findViewById(R.id.Button2);
        Button3 = findViewById(R.id.Button3);
        Button4 = findViewById(R.id.Button4);
        Button5 = findViewById(R.id.Button5);
        Button6 = findViewById(R.id.Button6);
        Button7 = findViewById(R.id.Button7);
        Button8 = findViewById(R.id.Button8);
        Button9 = findViewById(R.id.Button9);

        ButtonAddition = findViewById(R.id.ButtonAddition);
        ButtonSubtraction = findViewById(R.id.ButtonSubtraction);
        ButtonMultiplication = findViewById(R.id.ButtonMultiplication);
        ButtonDivision = findViewById(R.id.ButtonDivision);
        ButtonEqual = findViewById(R.id.ButtonEqual);
        ButtonDot = findViewById(R.id.ButtonDot);

        ButtonClear = findViewById(R.id.ButtonClear);

        TextViewIO = findViewById(R.id.TextViewIO);


        Button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewIO.setText(TextViewIO.getText() + "0");
            }
        });

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewIO.setText(TextViewIO.getText() + "1");
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewIO.setText(TextViewIO.getText() + "2");
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewIO.setText(TextViewIO.getText() + "3");
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewIO.setText(TextViewIO.getText() + "4");
            }
        });

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewIO.setText(TextViewIO.getText() + "5");
            }
        });

        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewIO.setText(TextViewIO.getText() + "6");
            }
        });

        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewIO.setText(TextViewIO.getText() + "7");
            }
        });

        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewIO.setText(TextViewIO.getText() + "8");
            }
        });

        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewIO.setText(TextViewIO.getText() + "9");
            }
        });

        ButtonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextViewIO == null) {
                    TextViewIO.setText("");
                } else {
                    mValueOne = Float.parseFloat(TextViewIO.getText() + "");
                    addition = true;
                    TextViewIO.setText(null);
                }
            }
        });

        ButtonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(TextViewIO.getText() + "");
                subtract = true;
                TextViewIO.setText(null);
            }
        });

        ButtonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(TextViewIO.getText() + "");
                multiplication = true;
                TextViewIO.setText(null);
            }
        });

        ButtonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(TextViewIO.getText() + "");
                division = true;
                TextViewIO.setText(null);
            }
        });

        ButtonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewIO.setText(TextViewIO.getText() + ".");
            }
        });

        ButtonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextViewIO.setText("");
            }
        });

        ButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo = Float.parseFloat(TextViewIO.getText() + "");
                if (addition == true) {
                    TextViewIO.setText(mValueOne + mValueTwo + "");
                    addition = false;
                }
                if (subtract == true) {
                    TextViewIO.setText(mValueOne - mValueTwo + "");
                    subtract = false;
                }
                if (multiplication == true) {
                    TextViewIO.setText(mValueOne * mValueTwo + "");
                    multiplication = false;
                }
                if (division == true) {
                    TextViewIO.setText(mValueOne / mValueTwo + "");
                    division = false;
                }
            }
        });
    }
}