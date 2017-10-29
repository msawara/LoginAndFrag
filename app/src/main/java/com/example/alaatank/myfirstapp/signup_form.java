package com.example.alaatank.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class signup_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_form);
    }
    /** Called when the user clicks the Send button */
    public void login(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, leaderboard.class);
        startActivity(intent);
    }
}
