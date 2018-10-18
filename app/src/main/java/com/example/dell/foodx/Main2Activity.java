package com.example.dell.foodx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText phone;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        phone = (EditText)findViewById(R.id.phone);
        password = (EditText)findViewById(R.id.address);
        login = (Button)findViewById(R.id.loginButton);

    }

    private void validate(String userName, String userPassword){
        if((userName == "Ayush") && (userPassword == "12345"))
        {
            Intent intent = new Intent(Main2Activity.this, Main4Activity.class);
        }

    }
}
