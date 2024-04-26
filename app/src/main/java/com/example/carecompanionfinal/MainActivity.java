package com.example.carecompanionfinal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {


//Variables
    DrawerLayout drawerLayout;

    ImageButton buttonDrawerToggle;
    NavigationView navigationView;
//    Toolbar toolbar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        drawerLayout = findViewById(R.id.main);
        buttonDrawerToggle = findViewById(R.id.buttonDrawerToggle);
        navigationView = findViewById(R.id.nav_view);

        buttonDrawerToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.open();
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                return false;
            }
        });

    }

    public void launchSettingsPage(View v){
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }
    public void launchMedicalIDPage(View v){
        Intent i = new Intent(this, MedicalIDActivity.class);
        startActivity(i);
    }
    public void launchCalendarPage(View v){
        Intent i = new Intent(this, CalendarActivity.class);
        startActivity(i);
    }
    public void launchNavigationPage(View v){
        Intent i = new Intent(this, NavigationActivity.class);
        startActivity(i);
    }
    public void launchHealthTipsPage(View v){
        Intent i = new Intent(this, HealthTipsActivity.class);
        startActivity(i);
    }
    public void launchSignUpPage(View view){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
    public void launchMedical(View view){
        Intent intent = new Intent(this, Create_medical.class);
        startActivity(intent);
    }


}