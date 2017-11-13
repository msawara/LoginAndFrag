package com.example.mainmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    Boolean signUpModeActive = true;
    TextView changeSignupModeTextView;



    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.changeSignupModeTextView) {
            Log.i("need to change it", " change it");
            Button ButtonEditText = (Button) findViewById(R.id.signUpButton);

            if(signUpModeActive){

                signUpModeActive = false;
                ButtonEditText.setText("Login");
                changeSignupModeTextView.setText("Or, Signup");

            } else {

                signUpModeActive = true;
                ButtonEditText.setText("Signup");
                changeSignupModeTextView.setText("Or, Login");

            }

        }

    }
    public void signUp(View view) {

        EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        if (usernameEditText.getText().toString().matches("") || passwordEditText.getText().toString().matches("")) {

            Toast.makeText(this, "A username and Password are required.", Toast.LENGTH_SHORT).show();

        } else {


            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);


        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
