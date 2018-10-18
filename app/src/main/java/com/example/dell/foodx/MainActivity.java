package com.example.dell.foodx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button signup;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void setLogin(View view){
        login = (Button)findViewById(R.id.loginbtn);
    }

    public void setSignup(View view){
        signup = (Button)findViewById(R.id.signupbtn);
    }
}
