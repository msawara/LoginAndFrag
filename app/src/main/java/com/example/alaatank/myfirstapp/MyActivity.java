package com.example.alaatank.myfirstapp;
import android.content.Intent;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }
    /** Called when the user clicks the Send button */
    public void login(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the New user button */
    public void register(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, signup_form.class);
        startActivity(intent);
    }
}
