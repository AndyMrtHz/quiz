package com.geb.quiz.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.geb.quiz.R;
import com.geb.quiz.test1.Pregunta1;
import com.geb.quiz.test1.Pregunta2;

public class Pregunta2_1 extends AppCompatActivity implements View.OnClickListener {
    Button a,b,c,sig;
    Intent intent;
    int calificacion=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta2_1);
        intent = new Intent(Pregunta2_1.this, Pregunta2_2.class);
        a = (Button) findViewById(R.id.a2_1);
        b = (Button) findViewById(R.id.b2_1);
        c = (Button) findViewById(R.id.c2_1);
        sig = (Button) findViewById(R.id.siguiente2_1);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);

        sig.setOnClickListener(this);
        sig.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.a2_1: //Respuesta correcta
                calificacion=1;
                deshabilitar();
                break;
            case R.id.b2_1:
                calificacion=0;
                deshabilitar();
                break;
            case R.id.c2_1:
                calificacion=0;
                deshabilitar();
                break;
            case R.id.siguiente2_1:
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