package com.example.fragment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;


public class Help extends Fragment {

   View view;
   EditText help_edtxt, email_edttxt;
   TextView help_txt, email_txt;
   Button btn_help;
   Object Fragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_help, container, false);
        help_edtxt = view.findViewById(R.id.help_edttxt);
        email_edttxt = view.findViewById(R.id.email_edttxt);
        help_txt = view.findViewById(R.id.txtWarnQuery);
        email_txt = view.findViewById(R.id.txtWarnEmail);
        btn_help = view.findViewById(R.id.btn_help);
        btn_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initRegister();
            }
        });

        return view;
    }

    public void initRegister() {
        if(validData()){
            help_txt.setVisibility(View.GONE);
            email_txt.setVisibility(View.GONE);
            Throwable resp = null;
            Snackbar.make(view, "Your query registered", Snackbar.LENGTH_LONG).show();
        }

    }
    public boolean validData(){
        if(help_edtxt.getText().toString().equals("")){
            help_txt.setVisibility(View.VISIBLE);
            help_txt.setText("Please enter your question");
            return false;
        }
        if(email_edttxt.getText().toString().equals("")){
            email_txt.setVisibility(View.VISIBLE);
            email_txt.setText("Please enter your email address");
            return false;
        }
        return true;
    }
}