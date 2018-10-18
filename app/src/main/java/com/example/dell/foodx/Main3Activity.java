package com.example.dell.foodx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    private EditText userrname;
    private EditText userphone;
    private EditText useraddress;
    private EditText password;
    private EditText repassword;
    private Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setupUIViews();

        regButton.setOnClickListener(new View.OnClickListener())
        {

        }
    }

    private void setupUIViews()
    {
        userrname = (EditText)findViewById(R.id.name);
        userphone = (EditText)findViewById(R.id.phone);
        useraddress = (EditText)findViewById(R.id.address);
        password = (EditText)findViewById(R.id.password);
        repassword = (EditText)findViewById(R.id.repassword);
        signup = (Button)findViewById(R.id.signupbutton);
    }

    private Boolean validate()
    {
        Boolean result = false;

        String name = userrname.getText().toString();
        String phone = userphone.getText().toString();
        String address = useraddress.getText().toString();
        String pswrd = password.getText().toString();
        String repswrd = repassword.getText().toString();

        if(name.isEmpty() && phone.isEmpty() && address.isEmpty() && pswrd.isEmpty() && repswrd.isEmpty())
        {
            Toast.makeText(this, "Please enter all the details", Toast.LENGTH_SHORT).show();
        }
        else
        {
            result = true;
        }
    }

}
