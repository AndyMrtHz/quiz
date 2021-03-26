package com.geb.quiz.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.geb.quiz.R;

public class Pregunta2_3 extends AppCompatActivity implements View.OnClickListener {
    Button a,b,c,d,sig;
    Intent intent, recibe;
    int calificacion=0;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta2_3);
        intent = new Intent(Pregunta2_3.this, Pregunta2_4.class);
        a = (Button) findViewById(R.id.a2_3);
        b = (Button) findViewById(R.id.b2_3);
        c = (Button) findViewById(R.id.c2_3);
        d = (Button) findViewById(R.id.d2_3);
        sig = (Button) findViewById(R.id.siguiente2_3);

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
            case R.id.a2_3: //Respuesta correcta
                calificacion+=1;
                deshabilitar();
                break;
            case R.id.b2_3:
                calificacion+=1;
                deshabilitar();
                break;
            case R.id.c2_3: //Respuesta correcta
                calificacion+=1;
                deshabilitar();
                break;
            case R.id.d2_3:
                calificacion+=1;
                deshabilitar();
                break;
            case R.id.siguiente2_3:
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
        b.setBackgroundColor(Color.GREEN);
        c.setBackgroundColor(Color.GREEN);
        d.setBackgroundColor(Color.GREEN);
        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        sig.setEnabled(true);
    }
}