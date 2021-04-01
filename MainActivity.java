package com.example.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(onClickLoginButton);
    }

    private View.OnClickListener onClickLoginButton = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
           // Log.d("App", "onClick");
            EditText userNameEditText = (EditText) findViewById(R.id.usernameEditText);
            EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
            EditText errorTextView = (EditText) findViewById(R.id.errorTextView);

            String userName = userNameEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            if(userName.equals("admin") && password.equals("admin")){
                // Success
                errorTextView.setVisibility(View.INVISIBLE);
            }
            else{
                //Failure
                errorTextView.setText(R.string.error_text);
                errorTextView.setVisibility(View.VISIBLE);
            }

        }
    };
}
