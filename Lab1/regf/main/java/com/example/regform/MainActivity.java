package com.example.regform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText emailid;
    private EditText phoneno;
    private EditText password;
    private Button btn;
    private TextView mesg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        emailid=(EditText) findViewById( R.id.email);
        phoneno=(EditText) findViewById( R.id.phone);
        password=(EditText) findViewById( R.id.password);
        btn=(Button) findViewById( R.id.login);
        mesg=(TextView) findViewById( R.id.msg);
        btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emaill=String.valueOf( emailid.getText());
                String pass=String.valueOf( password.getText() );
                if(emaill.equals( "j" ) && pass.equals( "j" )){
                    mesg.setText("Account Verified, "+emaill);
                    Toast.makeText( getApplicationContext(),"Account Verified"+emaill,Toast.LENGTH_SHORT ).show();
                }
                else{
                    mesg.setText( "Verification Unsuccessful" );
                }

            }
        } );

    }
}