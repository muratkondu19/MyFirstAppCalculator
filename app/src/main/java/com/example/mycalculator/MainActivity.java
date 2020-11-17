package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber;
    EditText editTextNumber2;
    TextView textView;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.image_button);
    }

    public void toplama(View view) {
        if(editTextNumber.getText().toString().matches("") || editTextNumber2.getText().toString().matches("")) {
            textView.setText("Lütfen Bir Sayı Giriniz...");
        } else {
            int numberOne = Integer.parseInt(editTextNumber.getText().toString());
            int numberTwo = Integer.parseInt(editTextNumber2.getText().toString());
            int result = numberOne + numberTwo;
            textView.setText("Sonuç: " + result );
        }
    }

    public void cikarma(View view) {
        if(editTextNumber.getText().toString().matches("") || editTextNumber2.getText().toString().matches("")) {
            textView.setText("Lütfen Bir Sayı Giriniz...");
        } else {
            int numberOne = Integer.parseInt(editTextNumber.getText().toString());
            int numberTwo = Integer.parseInt(editTextNumber2.getText().toString());
            int result = numberOne - numberTwo;
            textView.setText("Sonuç: " + result );
        }
    }

    public void carpma(View view) {
        if(editTextNumber.getText().toString().matches("") || editTextNumber2.getText().toString().matches("")) {
            textView.setText("Lütfen Bir Sayı Giriniz...");
        } else {
            int numberOne = Integer.parseInt(editTextNumber.getText().toString());
            int numberTwo = Integer.parseInt(editTextNumber2.getText().toString());
            int result = numberOne * numberTwo;
            textView.setText("Sonuç: " + result );
        }
    }

    public void bolme(View view) {
        if(editTextNumber.getText().toString().matches("") || editTextNumber2.getText().toString().matches("")) {
            textView.setText("Lütfen Bir Sayı Giriniz...");
        } else {
            int numberOne = Integer.parseInt(editTextNumber.getText().toString());
            int numberTwo = Integer.parseInt(editTextNumber2.getText().toString());
            int result = numberOne / numberTwo;
            textView.setText("Sonuç: " + result );
        }
    }
}