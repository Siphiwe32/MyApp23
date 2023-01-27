package com.example.myapp23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText loginText, passwordText;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Username
        loginText = (EditText) findViewById(R.id.login);

        //Password
        passwordText = (EditText) findViewById(R.id.password);

        //Login Button
        btnLogin =  (Button) findViewById(R.id.buttonLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = loginText.getText().toString();
                String password = passwordText.getText().toString();

                if(username.equals("user") && (password.equals("123456")))
                {
                    Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),NewActivity.class);
                    startActivity(intent);
                }else
                {
                    Toast.makeText(MainActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}