package com.example.github_java_project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onLoginButtonClick(View view){
        //      R.id.txtMessage grabs the id from the txtMessage in the activity_main.xml
        //      R stands for resources
        EditText userEmail = findViewById(R.id.userEmail);
        EditText userPassword = findViewById(R.id.userPassword);
//        TextView firstNameDisplay = findViewById(R.id.firstNameDisplay);
//        TextView lastNameDisplay = findViewById(R.id.lastNameDisplay);
//        TextView emailDisplay = findViewById(R.id.emailDisplay);
//        firstNameDisplay.setText("First Name: " + firstName.getText().toString());
//        lastNameDisplay.setText("Last Name: " + lastName.getText().toString());
//        emailDisplay.setText("Email: " + email.getText().toString());
    }
}