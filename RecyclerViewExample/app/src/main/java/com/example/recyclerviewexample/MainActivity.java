package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView RecViewContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecViewContact = findViewById(R.id.RecViewContact);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Paras","paraskhullar6@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2CbthNg-kooTpwBc5yyqn6NRMhBDAsAxReIAUy2fdw407qKL2M5oRMDVwo0SKHmzRWU4&usqp=CAU"));
        contacts.add(new Contact("Muskan","muskankhullar6@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSVw3GobI44WSMtqryxlcEn4hUW2v016Tjsyw&usqp=CAU"));
        contacts.add(new Contact("Paras","paraskhullar6@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2CbthNg-kooTpwBc5yyqn6NRMhBDAsAxReIAUy2fdw407qKL2M5oRMDVwo0SKHmzRWU4&usqp=CAU"));
        contacts.add(new Contact("Muskan","muskankhullar6@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSVw3GobI44WSMtqryxlcEn4hUW2v016Tjsyw&usqp=CAU"));
        contacts.add(new Contact("Paras","paraskhullar6@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2CbthNg-kooTpwBc5yyqn6NRMhBDAsAxReIAUy2fdw407qKL2M5oRMDVwo0SKHmzRWU4&usqp=CAU"));
        contacts.add(new Contact("Muskan","muskankhullar6@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSVw3GobI44WSMtqryxlcEn4hUW2v016Tjsyw&usqp=CAU"));
        contacts.add(new Contact("Paras","paraskhullar6@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2CbthNg-kooTpwBc5yyqn6NRMhBDAsAxReIAUy2fdw407qKL2M5oRMDVwo0SKHmzRWU4&usqp=CAU"));
        contacts.add(new Contact("Muskan","muskankhullar6@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSVw3GobI44WSMtqryxlcEn4hUW2v016Tjsyw&usqp=CAU"));
        contacts.add(new Contact("Paras","paraskhullar6@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2CbthNg-kooTpwBc5yyqn6NRMhBDAsAxReIAUy2fdw407qKL2M5oRMDVwo0SKHmzRWU4&usqp=CAU"));
        contacts.add(new Contact("Muskan","muskankhullar6@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSVw3GobI44WSMtqryxlcEn4hUW2v016Tjsyw&usqp=CAU"));

        ContactRecViewAdapter contactRecViewAdapter = new ContactRecViewAdapter(this);
        contactRecViewAdapter.setContacts(contacts);

        RecViewContact.setAdapter(contactRecViewAdapter);
        RecViewContact.setLayoutManager(new GridLayoutManager(this,2));
    }
}