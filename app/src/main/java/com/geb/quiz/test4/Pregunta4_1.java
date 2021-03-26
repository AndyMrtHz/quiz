package com.geb.quiz.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.geb.quiz.R;
import com.geb.quiz.test3.Pregunta3_3;
import com.geb.quiz.test3.Pregunta3_4;

public class Pregunta4_1 extends AppCompatActivity implements View.OnClickListener {
    Button a,b,c,d,sig;
    Intent intent;
    int calificacion=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta4_1);
        intent = new Intent(Pregunta4_1.this, Pregunta4_2.class);
        a = (Button) findViewById(R.id.a4_1);
        b = (Button) findViewById(R.id.b4_1);
        c = (Button) findViewById(R.id.c4_1);
        d = (Button) findViewById(R.id.d4_1);
        sig = (Button) findViewById(R.id.siguiente4_1);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);

        sig.setOnClickListener(this);
        sig.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.a4_1: //Respuesta correcta
                calificacion=0;
                deshabilitar();
                break;
            case R.id.b4_1:
                calificacion=0;
                deshabilitar();
                break;
            case R.id.c4_1:
                calificacion=0;
                deshabilitar();
                break;
            case R.id.d4_1:
                calificacion=1;
                deshabilitar();
                break;
            case R.id.siguiente4_1:
                startActivity(intent);
                break;
            default:
                break;
        }
        intent.putExtra("calificacion",calificacion);
    }

    public void deshabilitar(){
        a.setBackgroundColor(Color.RED);
        b.setBackgroundColor(Color.RED);
        c.setBackgroundColor(Color.RED);
        d.setBackgroundColor(Color.GREEN);
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        sig.setEnabled(true);
    }
}