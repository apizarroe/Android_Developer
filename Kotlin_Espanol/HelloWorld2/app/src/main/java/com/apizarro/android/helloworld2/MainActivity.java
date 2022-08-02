package com.apizarro.android.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** Se invoca al textView en la ejecucion **/
        TextView textView111 = findViewById(R.id.text100);

        /** Se asignan valores a los atributos por medio de Java **/
        textView111.setText("Hello, Welcome Again!");   //Fijamos el texto que mostrara
        textView111.setTextColor(Color.RED);            //Fijamos el color del texto
        textView111.setTextSize(32);                    //Fijamos el tamano del texto
        textView111.setBackgroundColor(Color.GRAY);     //Fijamos el color de fondo

        EditText edit1 = findViewById(R.id.edit1);
        EditText edit2 = findViewById(R.id.edit2);
        EditText edit3 = findViewById(R.id.edit3);

        edit1.setTextColor(Color.RED);
        edit2.setTextSize(23);
        edit3.setBackgroundColor(Color.BLUE);

        // Getting Input from EditText
        String name = edit1.getText().toString();       //Se obtiene el valor de edit1
        String phone = edit2.getText().toString();      //Se obtiene el valor de edit2
        String password = edit3.getText().toString();   //Se obtiene el valor de edit3
        //Log.v("Test1", "The User enters " + name);    //Imprimo texto en el log

    }
}