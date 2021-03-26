package com.geb.quiz.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.geb.quiz.R;

public class Pregunta4_5 extends AppCompatActivity implements View.OnClickListener {
    Button a,b,c,sig;
    Intent intent, recibe;
    int calificacion=0;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta4_5);
        intent = new Intent(Pregunta4_5.this, Score_4.class);
        a = (Button) findViewById(R.id.a4_5);
        b = (Button) findViewById(R.id.b4_5);
        c = (Button) findViewById(R.id.c4_5);
        sig = (Button) findViewById(R.id.siguiente4_5);

        try {
            recibe=getIntent();
            bundle=recibe.getExtras();
            calificacion = bundle.getInt("calificacion");
        }
        catch (Exception e){
            Toast.makeText(this,"Errod al recibir calificacion", Toast.LENGTH_SHORT).show();
        }

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        sig.setOnClickListener(this);
        sig.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.a4_5: //Respuesta correcta
                calificacion+=0;
                deshabilitar();
                break;
            case R.id.b4_5:
                calificacion+=0;
                deshabilitar();
                break;
            case R.id.c4_5:
                calificacion+=1;
                deshabilitar();
                break;
            case R.id.siguiente4_5:
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
        c.setBackgroundColor(Color.GREEN);
        a.setEnabled(false);
        b.setEnabled(false);
        sig.setEnabled(true);
    }
}