package com.example.fragment1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    Fragment temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        MainFragment m = new MainFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, m).addToBackStack(m.toString()).commit();
        //Toast.makeText(this,getSupportFragmentManager().getBackStackEntryCount(), Toast.LENGTH_SHORT).show();


        navigationView = findViewById(R.id.navigation_bar);
        navigationView.bringToFront();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_exercise:
                        temp = new Exercise();
                        manageFragment(new Exercise());
                        drawerLayout.closeDrawer(GravityCompat.START);

                        break;
                    case R.id.menu_supplementInfo:
                        temp = new Supplement_Info();
                        manageFragment(new Supplement_Info());
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.menu_classes:
                        temp = new Classes();
                        manageFragment(new Classes());
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.menu_about:
                        temp = new About();
                        manageFragment(new About());
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.menu_help:
                        temp = new Help();
                        manageFragment(new Help());
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    default:
                        break;
                }
                //getSupportFragmentManager().beginTransaction().replace(R.id.container, temp).addToBackStack(null).commit();
                return true;
            }
        });
    }

    public void addFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().add(R.id.container, fragment).addToBackStack(fragment.getClass().getName()).commit();
        //Toast.makeText(this,getSupportFragmentManager().getBackStackEntryCount(), Toast.LENGTH_SHORT).show();
    }
    public void removeFragment(){
        getSupportFragmentManager().beginTransaction().remove(temp).addToBackStack(null).commit();
    }

    public void replaceFragment(Fragment fragment){
        if(getSupportFragmentManager().getBackStackEntryCount() > 1) getSupportFragmentManager().popBackStack();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).addToBackStack(null).commit();
        //Toast.makeText(this,getSupportFragmentManager().getBackStackEntryCount(), Toast.LENGTH_SHORT).show();

    }

    public void manageFragment(Fragment fragment){
        if(getSupportFragmentManager().getBackStackEntryCount() > 1) replaceFragment(fragment); else addFragment(fragment);
    }

    @Override
    public void onBackPressed()
    {
        // code here to show dialog
        if(getSupportFragmentManager().getBackStackEntryCount() <= 1) finish();
        super.onBackPressed();
        // optional depending on your needs
    }


}