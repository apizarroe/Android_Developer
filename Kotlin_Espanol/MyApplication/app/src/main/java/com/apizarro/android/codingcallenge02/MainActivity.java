package com.apizarro.android.codingcallenge02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editweight = findViewById(R.id.editTextWeight);
        Button convert = findViewById(R.id.buttonConvert);
        TextView result = findViewById(R.id.textViewResult);
        TextView punds = findViewById(R.id.textViewPounds);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double weight_pound = Double.parseDouble(editweight.getText().toString())*2.20462;
                result.setText(Double.toString(weight_pound));

            }
        });

    }
}