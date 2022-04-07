package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TintableCompoundButton;

import android.hardware.Camera;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText EdtText;
    private TextView txtView;
    private CheckBox harry;
    private RadioGroup rgMartialStatus;
    private ProgressBar progressBar;
    private Spinner studentSpinner;
    private FloatingActionButton floating;
    private RelativeLayout parent;
    private Button snackButton;

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.clickMe:
                txtView.setText("Hello " + EdtText.getText().toString());
                break;
            default:
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.clickMe);
        btn.setOnClickListener(this::onClick);

        EdtText = findViewById(R.id.edtTxt);
        txtView = findViewById(R.id.textView);

        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "Heyy", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        parent = findViewById(R.id.parentR);
        snackButton = findViewById(R.id.snakButton);
        snackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnack();
            }
        });

        floating = findViewById(R.id.fab);
        floating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "It's clicked", Toast.LENGTH_SHORT).show();
            }
        });

        progressBar = findViewById(R.id.radioProgress);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<10; i++){
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(1000);
                }
            }
        });
        thread.start();

        studentSpinner = findViewById(R.id.studentSpinner);
        ArrayList<String> studentlist = new ArrayList<>();
        studentlist.add("Prabhu");
        studentlist.add("Muskan");
        studentlist.add("Karuna");
        studentlist.add("Mukesh");

        ArrayAdapter<String> studentAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item,
                studentlist);
        studentSpinner.setAdapter(studentAdapter);

        studentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, studentlist.get(i) + " Selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        rgMartialStatus = findViewById(R.id.groupRadio);
        rgMartialStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.marriedRadio:
                        Toast.makeText(MainActivity.this, "You are married", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.singleRadio:
                        Toast.makeText(MainActivity.this, "You are single", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });

        harry = findViewById(R.id.harryPotter);
        if (harry.isChecked()){
            Toast.makeText(MainActivity.this, "You watched", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(MainActivity.this, "You need to watch Harry Potter", Toast.LENGTH_SHORT).show();
        }

        harry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!b){
                    Toast.makeText(MainActivity.this, "You need to watch Harry Potter", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this, "You watched", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void showSnack(){
        Snackbar.make(parent, "This is clicked", Snackbar.LENGTH_LONG).
        setAction("Retry", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Again try", Toast.LENGTH_SHORT).show();
            }
        })
        .show();
    }


}