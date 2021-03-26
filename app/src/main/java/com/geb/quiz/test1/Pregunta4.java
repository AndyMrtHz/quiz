package com.geb.quiz.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.geb.quiz.R;

public class Pregunta4 extends AppCompatActivity implements View.OnClickListener {
    Button a,b,c,sig;
    Intent intent, recibe;
    int calificacion=0;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta4);

        intent = new Intent(Pregunta4.this, Pregunta5.class);
        a = (Button) findViewById(R.id.a4);
        b = (Button) findViewById(R.id.b4);
        c = (Button) findViewById(R.id.c4);
        sig = (Button) findViewById(R.id.siguiente4);

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
            case R.id.a4: //Respuesta correcta
                calificacion+=0;
                deshabilitar();
                break;
            case R.id.b4:
                calificacion+=1;
                deshabilitar();
                break;
            case R.id.c4:
                calificacion+=0;
                deshabilitar();
                break;
            case R.id.siguiente4:
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