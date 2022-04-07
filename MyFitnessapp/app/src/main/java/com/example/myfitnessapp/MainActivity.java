package com.example.myfitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

     DrawerLayout drawerLayout;
     Toolbar toolbar;
     NavigationView navigationView;
     ActionBarDrawerToggle toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                        Intent intent = new Intent(MainActivity.this, ExercisesActivity.class);
                        startActivity(intent);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.menu_supplementInfo:
                        Intent intent1 = new Intent(MainActivity.this, SupplementInfo_Activity.class);
                        startActivity(intent1);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.menu_classes:
                        Intent intent2 = new Intent(MainActivity.this, Classes_Activity.class);
                        startActivity(intent2);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.menu_about:
                        Intent intent3 = new Intent(MainActivity.this, About_Activity.class);
                        startActivity(intent3);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.menu_help:
                        Intent intent4 = new Intent(MainActivity.this, Help_Activity.class);
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

//    @Override
//    public void onBackPressed() {
//        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
//            drawerLayout.closeDrawer(GravityCompat.START);
//        } else {
//            onBackPressed();
//        }
//    }

//    public void clicklogo(View view) {
//        closeDrawer(drawerLayout);
//    }
//
//    private static void closeDrawer(DrawerLayout drawerLayout) {
//        if(drawerLayout.isDrawerOpen(GravityCompat.START)) {
//            drawerLayout.closeDrawer(GravityCompat.START);
//        }
//    }
//
//    public void clickExercises(View view) {
//        redirectActivity(this, ExercisesActivity.class);
//    }
//
//    public void clickSupplementinfo(View view) {
//        redirectActivity(this, SupplementInfo_Activity.class);
//    }
//
//    public void clickClasses(View view) {
//        redirectActivity(this, Classes_Activity.class);
//    }
//
//    public void clickAbout(View view) {
//        redirectActivity(this, About_Activity.class);
//    }
//
//    public void clickHelp(View view) {
//        redirectActivity(this, Help_Activity.class);
//    }
//
//    public static void redirectActivity(Activity activity, Class aClass) {
//        Intent intent = new Intent(activity, aClass);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        activity.startActivity(intent);
//    }
}