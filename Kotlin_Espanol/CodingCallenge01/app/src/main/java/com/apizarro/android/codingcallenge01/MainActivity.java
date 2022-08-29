package com.apizarro.android.codingcallenge01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SayHello(View view){
        EditText name = findViewById(R.id.editNameUser);
        String saludo = name.getText().toString();
        Toast.makeText(getApplicationContext(),"Your name is: " + saludo, Toast.LENGTH_SHORT).show();
    }
}