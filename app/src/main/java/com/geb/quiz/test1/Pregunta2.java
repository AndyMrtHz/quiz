package com.geb.quiz.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.geb.quiz.R;

public class Pregunta2 extends AppCompatActivity implements View.OnClickListener {
    Button a,b,c,d,sig;
    Intent intent, recibe;
    int calificacion=0;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta2);

        intent = new Intent(Pregunta2.this, Pregunta3.class);
        a = (Button) findViewById(R.id.a2);
        b = (Button) findViewById(R.id.b2);
        c = (Button) findViewById(R.id.c2);
        d = (Button) findViewById(R.id.d2);
        sig = (Button) findViewById(R.id.siguiente2);

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
        d.setOnClickListener(this);
        sig.setOnClickListener(this);
        sig.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.a2: //Respuesta correcta
                calificacion+=0;
                deshabilitar();
                break;
            case R.id.b2:
                calificacion+=0;
                deshabilitar();
                break;
            case R.id.c2:
                calificacion+=1;
                deshabilitar();
                break;
            case R.id.d2:
                calificacion+=0;
                deshabilitar();
                break;
            case R.id.siguiente2:
                startActivity(intent);
                break;
            default:
                break;
        }
        //Toast.makeText(this,"Calificacion:"+ calificacion, Toast.LENGTH_SHORT).show();
        intent.putExtra("calificacion",calificacion);
    }

    public void deshabilitar(){
        a.setBackgroundColor(Color.RED);
        b.setBackgroundColor(Color.RED);
        c.setBackgroundColor(Color.GREEN);
        d.setBackgroundColor(Color.RED);
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        sig.setEnabled(true);
    }
}