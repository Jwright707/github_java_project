package com.example.github_java_project;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class HomePage extends Fragment {
    EditText userEmail;
    EditText userPassword;
    Button loginButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home_page, container, false);
        userEmail = (EditText)v.findViewById(R.id.userEmail);
        userPassword = (EditText)v.findViewById(R.id.userPassword);
        loginButton = (Button)v.findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("CLICKED");
            }
        });
        return v;
    }
}