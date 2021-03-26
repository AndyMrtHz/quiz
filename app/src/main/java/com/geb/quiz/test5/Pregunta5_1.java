package com.geb.quiz.test5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.geb.quiz.R;
import com.geb.quiz.test4.Pregunta4_1;
import com.geb.quiz.test4.Pregunta4_2;

public class Pregunta5_1 extends AppCompatActivity implements View.OnClickListener {
    Button a,b,c,sig;
    Intent intent;
    int calificacion=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta5_1);
        intent = new Intent(Pregunta5_1.this, Pregunta5_2.class);
        a = (Button) findViewById(R.id.a5_1);
        b = (Button) findViewById(R.id.b5_1);
        c = (Button) findViewById(R.id.c5_1);
        sig = (Button) findViewById(R.id.siguiente5_1);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);

        sig.setOnClickListener(this);
        sig.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.a5_1: //Respuesta correcta
                calificacion=1;
                deshabilitar();
                break;
            case R.id.b5_1:
                calificacion=0;
                deshabilitar();
                break;
            case R.id.c5_1:
                calificacion=0;
                deshabilitar();
                break;

            case R.id.siguiente5_1:
                startActivity(intent);
                break;
            default:
                break;
        }
        intent.putExtra("calificacion",calificacion);
    }

    public void deshabilitar(){
        a.setBackgroundColor(Color.GREEN);
        b.setBackgroundColor(Color.RED);
        c.setBackgroundColor(Color.RED);
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        sig.setEnabled(true);
    }
}