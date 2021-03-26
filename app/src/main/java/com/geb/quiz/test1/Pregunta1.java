package com.geb.quiz.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.geb.quiz.R;

public class Pregunta1 extends AppCompatActivity implements View.OnClickListener {
    Button a,b,sig;
    Intent intent;
    int calificacion=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1);
        intent = new Intent(Pregunta1.this, Pregunta2.class);
        a = (Button) findViewById(R.id.a1);
        b = (Button) findViewById(R.id.b1);
        sig = (Button) findViewById(R.id.siguiente1);
        a.setOnClickListener(this);
        b.setOnClickListener(this);

        sig.setOnClickListener(this);
        sig.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.a1: //Respuesta correcta
                calificacion=1;
                deshabilitar();
                break;
            case R.id.b1:
                calificacion=0;
                deshabilitar();
                break;
            case R.id.siguiente1:
                startActivity(intent);
                break;
            default:
                break;
        }
        //Toast.makeText(this,"Calificacion:"+ calificacion, Toast.LENGTH_SHORT).show();
        intent.putExtra("calificacion",calificacion);
    }

    public void deshabilitar(){
        a.setBackgroundColor(Color.GREEN);
        b.setBackgroundColor(Color.RED);
        a.setEnabled(false);
        b.setEnabled(false);
        sig.setEnabled(true);

    }
}