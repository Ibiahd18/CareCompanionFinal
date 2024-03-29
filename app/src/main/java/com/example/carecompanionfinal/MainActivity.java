package com.example.carecompanionfinal;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    public void launchSignInPage(View view){
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }


}