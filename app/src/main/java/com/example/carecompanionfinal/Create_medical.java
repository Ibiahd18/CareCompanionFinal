package com.example.carecompanionfinal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Create_medical extends AppCompatActivity {

    private Spinner bloodSpinner;
    private ArrayAdapter<CharSequence> bloodAdapter;
    private Spinner organSpinner;
    private ArrayAdapter<CharSequence> organAdapter;

//    Spinner spinner;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_medical);

        //Blood type initialisation
        bloodSpinner = findViewById(R.id.spinnerBlood);

        // Populate ArrayAdapter using string array and a spinner layout
        bloodAdapter = ArrayAdapter.createFromResource(this, R.array.blood_array, R.layout.spinner_layout);

        //Specify the layout to use when list of choices appear
        bloodAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Set the adapter to the spinner to populate the blood spinner
        bloodSpinner.setAdapter(bloodAdapter);


        //Organ donor initialisation
        organSpinner = findViewById(R.id.spinnerOrgan);
        // Populate ArrayAdapter using string array and a spinner layout
        organAdapter = ArrayAdapter.createFromResource(this, R.array.organ_array, R.layout.spinner_layout);

        //Specify the layout to use when list of choices appear
        organAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Set the adapter to the spinner to populate the organ spinner
        organSpinner.setAdapter(organAdapter);
    }

    public void launchSignInPage(View view) {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }
    public void launchSignInPage(View view) {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }
}



//        spinner = findViewById(R.id.spinnerBlood);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
//                R.array.blood_array, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_create_medical);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
//    }
//}