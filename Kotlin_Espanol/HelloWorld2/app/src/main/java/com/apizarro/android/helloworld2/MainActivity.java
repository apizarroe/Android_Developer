package com.apizarro.android.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
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

        /** Se invoca al textView en la ejecucion **/
        TextView textView111 = findViewById(R.id.text100);

        /** Se asignan valores a los atributos por medio de Java **/
        textView111.setText("Hello, Welcome Again!");   //Fijamos el texto que mostrara
        textView111.setTextColor(Color.RED);            //Fijamos el color del texto
        textView111.setTextSize(32);                    //Fijamos el tamano del texto
        textView111.setBackgroundColor(Color.GRAY);     //Fijamos el color de fondo

        EditText edit1 = findViewById(R.id.edit1);      //Asignamos el objeto a una variable edit1
        //EditText edit2 = findViewById(R.id.edit2);
        //EditText edit3 = findViewById(R.id.edit3);

        edit1.setTextColor(Color.RED);                  //Fijamos el color del texto de edit1
        //edit2.setTextSize(23);
        //edit3.setBackgroundColor(Color.BLUE);

        // Getting Input from EditText
        String name = edit1.getText().toString();       //Se obtiene el valor de edit1
        //String phone = edit2.getText().toString();      //Se obtiene el valor de edit2
        //String password = edit3.getText().toString();   //Se obtiene el valor de edit3
        //Log.v("Test1", "The User enters " + name);    //Imprimo texto en el log

        //Button
        Button b1 = findViewById(R.id.button);          //Asignamos el objeto a una variable b1
        Button b2 = findViewById(R.id.button2);         //Asignamos el objeto a una variable b2
        b2.setText("Say Hello!");                       //Fijamos el texto del boton b2
        b2.setTextColor(Color.RED);                     //Fijamos el color texto del boton b2

        //Event Handling
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Se muestra un texto flotante al hacer click en b1
                Toast.makeText(getApplicationContext(),"You CLICKED ME!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void SayHello(View view){
        //Metodo para mostrar un texto flotante (Message Toast) en una Vista
        Toast.makeText(getApplicationContext(),"HEY MY FRIEND!", Toast.LENGTH_SHORT).show();
    }
}