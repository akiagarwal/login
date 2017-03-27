package com.example.akshay_20.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity implements View.OnClickListener {
    Button bRegister;
    EditText etName, etUsername, etPassword,etAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText)findViewById(R.id.etName);
        if(etName.getText().toString().length()==0)
            etName.setError("Name is Required!!");
        etUsername=(EditText)findViewById(R.id.etUsername);
        etPassword =(EditText)findViewById(R.id.etPassword);
        if(etPassword.getText().toString().length()<5)
            etPassword.setError("Too short!!");
        etAge=(EditText)findViewById(R.id.etAge);
        bRegister= (Button)findViewById(R.id.bRegister);

        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bRegister:
                startActivity(new Intent(this,act_login.class));
                break;
        }
    }
}
