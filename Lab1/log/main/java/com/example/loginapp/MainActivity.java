package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et_username;
    private EditText et_password;
    private Button bt_signin;
    private TextView tv_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_username=(EditText) findViewById(R.id.et_username);
        et_password=(EditText) findViewById(R.id.et_password);
        bt_signin= (Button) findViewById(R.id.btn_Login);
        tv_message=(TextView) findViewById(R.id.tv_message);

        bt_signin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=String.valueOf(et_username.getText());
                String password=String.valueOf(et_password.getText());
                if(username.equals("admin") && password.equals("admin")){
                    tv_message.setText("Login Successful");
                    Toast.makeText( getApplicationContext(),
                    "Login Successful...",Toast.LENGTH_SHORT).show();}else{
                    tv_message.setText("Login Unsuccessful");

                }
            }
        });
    }
}