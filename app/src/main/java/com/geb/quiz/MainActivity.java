package com.geb.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.geb.quiz.test1.Pregunta1;
import com.geb.quiz.test2.Pregunta2_1;
import com.geb.quiz.test2.Pregunta2_2;
import com.geb.quiz.test3.Pregunta3_1;
import com.geb.quiz.test4.Pregunta4_1;
import com.geb.quiz.test5.Pregunta5_1;
import com.geb.quiz.test6.Pregunta6_1;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    Button iniciar,ini2,ini3,ini4,ini5,ini6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciar = (Button) findViewById(R.id.iniciar);
        ini2 = (Button) findViewById(R.id.iniciar2);
        ini3 = (Button) findViewById(R.id.iniciar3);
        ini4 = (Button) findViewById(R.id.iniciar4);
        ini5 = (Button) findViewById(R.id.iniciar5);
        ini6 = (Button) findViewById(R.id.iniciar6);

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, Pregunta1.class);
                startActivity(intent);
            }
        });

        ini2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, Pregunta2_1.class);
                startActivity(intent);
            }
        });

        ini3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, Pregunta3_1.class);
                startActivity(intent);
            }
        });

        ini4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, Pregunta4_1.class);
                startActivity(intent);
            }
        });

        ini5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, Pregunta5_1.class);
                startActivity(intent);
            }
        });

        ini6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, Pregunta6_1.class);
                startActivity(intent);
            }
        });

    }
}