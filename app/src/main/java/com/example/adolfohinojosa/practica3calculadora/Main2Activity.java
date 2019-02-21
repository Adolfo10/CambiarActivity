package com.example.adolfohinojosa.practica3calculadora;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            Button btn2 = (Button) findViewById(R.id.btn0);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent (v.getContext(), MainActivity.class);
                    startActivityForResult(intent2, 0);
                }
            });
        }
    }