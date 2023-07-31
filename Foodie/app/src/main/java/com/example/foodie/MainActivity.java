package com.example.foodie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        username=(EditText)findViewById(R.id.editTextTextPersonName);
        password=(EditText)findViewById(R.id.editTextTextPassword);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("prachisv04") &&
                        password.getText().toString().equals("Admin@123")) {
                    openNewActivity();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),
                            "Wrong Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, receipe.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),
                "Login Successful", Toast.LENGTH_SHORT).show();
    }
}