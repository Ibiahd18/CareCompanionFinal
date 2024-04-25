package com.example.carecompanionfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignInActivity extends AppCompatActivity {

    // Set username and password
    private static final String USERNAME = "carecompanion";
    private static final String PASSWORD = "Care12";

    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_in);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        usernameEditText = findViewById(R.id.txtEmailAddress);
        passwordEditText = findViewById(R.id.txtPassword);

        // Set login on button click
        findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn(v); // Call the signIn method when the button is clicked
            }
        });
    }

    public void signIn(View view) {
        // Get the entered username and password
        String enteredUsername = usernameEditText.getText().toString().trim();
        String enteredPassword = passwordEditText.getText().toString().trim();

        // Check the entered credentials
        if (validateCredentials(enteredUsername, enteredPassword)) {
            Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();
            // Redirect to the homepage (MainActivity)
            launchHomepage();
        } else {
            Toast.makeText(this, "Invalid email or password. Please try again.", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validateCredentials(String username, String password) {
        return username.equals(USERNAME) && password.equals(PASSWORD);
    }

    public  void launchHomepage() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void launchSignUpPage(View view) {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}
