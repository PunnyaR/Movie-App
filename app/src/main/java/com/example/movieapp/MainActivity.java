package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    String getUse,getPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.usename);
        e2=(EditText) findViewById(R.id.pass);
        b1=(Button) findViewById(R.id.logbut);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUse=e1.getText().toString();
                getPass=e2.getText().toString();
                Intent ob1=new Intent(getApplicationContext(), DashboardActivity.class);
                if (getUse.equals("theatre")&&getPass.equals("123456"))
                    startActivity(ob1);
                else
                    Toast.makeText(getApplicationContext(),"Invalid",Toast.LENGTH_LONG).show();


            }
        });

    }
}