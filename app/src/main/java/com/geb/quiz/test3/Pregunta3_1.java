package com.geb.quiz.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.geb.quiz.R;
import com.geb.quiz.test2.Pregunta2_1;
import com.geb.quiz.test2.Pregunta2_2;

public class Pregunta3_1 extends AppCompatActivity implements View.OnClickListener {
    Button a,b,c,sig;
    Intent intent;
    int calificacion=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3_1);

        intent = new Intent(Pregunta3_1.this, Pregunta3_2.class);
        a = (Button) findViewById(R.id.a3_1);
        b = (Button) findViewById(R.id.b3_1);
        c = (Button) findViewById(R.id.c3_1);
        sig = (Button) findViewById(R.id.siguiente3_1);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);

        sig.setOnClickListener(this);
        sig.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.a3_1: //Respuesta correcta
                calificacion=0;
                deshabilitar();
                break;
            case R.id.b3_1:
                calificacion=1;
                deshabilitar();
                break;
            case R.id.c3_1:
                calificacion=0;
                deshabilitar();
                break;
            case R.id.siguiente3_1:
                startActivity(intent);
                break;
            default:
                break;
        }
        intent.putExtra("calificacion",calificacion);
    }

    public void deshabilitar(){
        a.setBackgroundColor(Color.RED);
        b.setBackgroundColor(Color.GREEN);
        c.setBackgroundColor(Color.RED);
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        sig.setEnabled(true);
    }
}