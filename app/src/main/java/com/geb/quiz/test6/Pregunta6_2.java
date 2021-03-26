package com.geb.quiz.test6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.geb.quiz.R;
import com.geb.quiz.test5.Pregunta5_2;
import com.geb.quiz.test5.Pregunta5_3;

public class Pregunta6_2 extends AppCompatActivity implements View.OnClickListener {
    Button a,b,sig;
    Intent intent, recibe;
    int calificacion=0;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta6_2);
        intent = new Intent(Pregunta6_2.this, Pregunta6_3.class);
        a = (Button) findViewById(R.id.a6_2);
        b = (Button) findViewById(R.id.b6_2);
        sig = (Button) findViewById(R.id.siguiente6_2);

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
        sig.setOnClickListener(this);
        sig.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.a6_2: //Respuesta correcta
                calificacion+=1;
                deshabilitar();
                break;
            case R.id.b6_2:
                calificacion+=0;
                deshabilitar();
                break;
            case R.id.siguiente6_2:
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
        a.setEnabled(false);
        b.setEnabled(false);
        sig.setEnabled(true);
    }
}