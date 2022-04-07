package com.example.myfitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class ExercisesActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;
    RecyclerView recViewExercise;
    ExerciseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        recViewExercise = findViewById(R.id.recViewExercise);
        recViewExercise.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ExerciseAdapter(dataqueue(), getApplicationContext());
        recViewExercise.setAdapter(adapter);



        drawerLayout = findViewById(R.id.drawer);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //navigationView = findViewById(R.id.navigation_bar);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = findViewById(R.id.navigation_bar);
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_exercise:
                        Intent intent = new Intent(ExercisesActivity.this, ExercisesActivity.class);
                        startActivity(intent);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.menu_supplementInfo:
                        Intent intent1 = new Intent(ExercisesActivity.this, SupplementInfo_Activity.class);
                        startActivity(intent1);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.menu_classes:
                        Intent intent2 = new Intent(ExercisesActivity.this, Classes_Activity.class);
                        startActivity(intent2);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.menu_about:
                        Intent intent3 = new Intent(ExercisesActivity.this, About_Activity.class);
                        startActivity(intent3);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.menu_help:
                        Intent intent4 = new Intent(ExercisesActivity.this, Help_Activity.class);
                        startActivity(intent4);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

    }
    public  ArrayList<Exercise_model> dataqueue(){
        ArrayList<Exercise_model> holder = new ArrayList<>();
        ArrayList<Exercise_details> holder1 = new ArrayList<>();
        ArrayList<Exercise_details> holder2 = new ArrayList<>();
        ArrayList<Exercise_details> holder3 = new ArrayList<>();
        Exercise_details model = new Exercise_details();
        model.setImgname(R.mipmap.gym);
        model.setTxt("Chest");
        //model.setUrl("www.google.com");
        Exercise_details model1 = new Exercise_details();
        model1.setImgname(R.mipmap.gym);
        model1.setTxt("Shoulder");
        Exercise_model obj1 = new Exercise_model();
        obj1.setImgname(R.mipmap.home);
        obj1.setTxt("Home Workout");
        holder1.add(model);
        holder1.add(model1);
        obj1.setExercise_detail(holder1);
        holder.add(obj1);

        Exercise_model obj2 = new Exercise_model();
        Exercise_details model3 = new Exercise_details();
        Exercise_details model4 = new Exercise_details();
        model3.setImgname(R.mipmap.core);
        model3.setTxt("Legs");
        model4.setImgname(R.mipmap.core);
        model4.setTxt("Back");
        obj2.setImgname(R.mipmap.gym);
        obj2.setTxt("GYM Workout");
        holder2.add(model3);
        holder2.add(model4);
        obj2.setExercise_detail(holder2);
        holder.add(obj2);

        Exercise_model obj3 = new Exercise_model();
        Exercise_details model5 = new Exercise_details();
        Exercise_details model6 = new Exercise_details();
        model5.setImgname(R.mipmap.home);
        model5.setTxt("Sides");
        model6.setImgname(R.mipmap.home);
        model6.setTxt("Lower abs");
        obj3.setImgname(R.mipmap.core);
        obj3.setTxt("Core Workout");
        holder.add(obj3);
        holder3.add(model5);
        holder3.add(model6);
        obj3.setExercise_detail(holder3);
        return holder;
    }
}