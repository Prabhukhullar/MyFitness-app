package com.example.exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @SuppressLint("SetTextI18n")
    public void onBtnClick(View view) {
        TextView txtHello = findViewById(R.id.firstName);
        EditText edtTxt = findViewById(R.id.edtTextName);
        txtHello.setText("First name: " + edtTxt.getText().toString());

        TextView txtHello1 = findViewById(R.id.lastName);
        EditText edtTxt1 = findViewById(R.id.edtTxtName2);
        txtHello1.setText("Last name: " + edtTxt1.getText().toString());

        TextView txtHello2 = findViewById(R.id.emailAddress);
        EditText edtTxt2 = findViewById(R.id.edtTxtName3);
        txtHello2.setText("Email: " + edtTxt2.getText().toString());

    }
}