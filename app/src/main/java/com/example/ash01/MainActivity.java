package com.example.ash01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userName, password;
    Button loginBtn, createAccBtn;
    String U, P;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void gotoHome(View view) {
        userName = findViewById(R.id.userName);
        U = userName.getText().toString();
        password = findViewById(R.id.passCode);
        P = password.getText().toString();
        if(!U.equals(""))
        {
            if(!U.equals("SherlockeDBOY"))
            {
                Toast.makeText(getApplicationContext(), "Incorrect username", Toast.LENGTH_LONG).show();
            }
            else if(!P.equals(""))
            {
                if(!P.equals("Hum@nity_suck5"))
                {
                    Toast.makeText(getApplicationContext(), "Incorrect password", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent intent = new Intent(this, Home.class);
                    startActivity(intent);
                }

            }
            else
                Toast.makeText(getApplicationContext(), "Please enter password", Toast.LENGTH_LONG).show();
        }
        else
            Toast.makeText(getApplicationContext(),"Please enter username",Toast.LENGTH_LONG).show();
    }

    public void gotoReg(View view) {
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }
}