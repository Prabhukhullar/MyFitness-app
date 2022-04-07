package com.example.applicationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private EditText editName, edtEmail, edtPassword, Repassword;
    private Button iamgeButton, registerButton;
    private RadioGroup genderRadio;
    private CheckBox lincencesCheckbox;
    private Spinner countriesSpinner;
    private TextView txtWarnName, txtWarnEmail, txtWarnPassword, txtWarnReset;
    private RelativeLayout parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        iamgeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Image set", Toast.LENGTH_SHORT).show();
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("Validate data", "Onclick");
                initRegister();
            }
        });

        countriesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this," Selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void initRegister() {
        if(validatedata()) {
            if(lincencesCheckbox.isChecked()){
                showSnackbar();
                Intent intent = new Intent(MainActivity.this, Register2page.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "You need to click on agree", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void showSnackbar() {
        txtWarnName.setVisibility(View.GONE);
        txtWarnEmail.setVisibility(View.GONE);
        txtWarnPassword.setVisibility(View.GONE);
        txtWarnReset.setVisibility(View.GONE);
        Snackbar.make(parent,"Your form registered successfully", Snackbar.LENGTH_LONG)
                .setAction("Dismiss", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                }).show();
    }

    private boolean validatedata() {
        Log.v("Validate data", "First");
        if(editName.getText().toString().equals("")) {
            txtWarnName.setVisibility(View.VISIBLE);
            txtWarnName.setText("Please enter the name");
            return false;
        }
        if(edtEmail.getText().toString().equals("")) {
            txtWarnEmail.setVisibility(View.VISIBLE);
            txtWarnEmail.setText("Please enter the Email address");
            return false;
        }
        if(edtPassword.getText().toString().equals("")) {
            txtWarnPassword.setVisibility(View.VISIBLE);
            txtWarnPassword.setText("Please set your password");
            return false;
        }
        if(txtWarnReset.getText().toString().equals("")) {
            txtWarnReset.setVisibility(View.VISIBLE);
            txtWarnReset.setText("Please re-confirme your password");
            return false;
        }
        if(!edtPassword.getText().toString().equals(Repassword.getText().toString())) {
            Log.v("Validate data", "Paras");
            txtWarnReset.setVisibility(View.VISIBLE);
            txtWarnReset.setText("Please enter the correct password");
            return false;
        }
        Log.v("Validate data", "Last");
        return true;
    }

    private void init() {
        iamgeButton = findViewById(R.id.imageButton);
        registerButton = findViewById(R.id.registerButton);

        editName = findViewById(R.id.editName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        Repassword = findViewById(R.id.Re_password);

        txtWarnName = findViewById(R.id.txtWarnName);
        txtWarnEmail = findViewById(R.id.txtWarnEmail);
        txtWarnPassword = findViewById(R.id.txtWarnPassword);
        txtWarnReset = findViewById(R.id.txtWarnReset);

        genderRadio = findViewById(R.id.genderRadio);
        lincencesCheckbox = findViewById(R.id.agreeCheckbox);
        countriesSpinner = findViewById(R.id.countrySpinner);
        parent = findViewById(R.id.parent);
    }
}