package com.geb.quiz.test6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.geb.quiz.R;

public class Pregunta6_4 extends AppCompatActivity implements View.OnClickListener {
    Button a,b,sig;
    Intent intent, recibe;
    int calificacion=0;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta6_4);
        intent = new Intent(Pregunta6_4.this, Pregunta6_5.class);
        a = (Button) findViewById(R.id.a6_4);
        b = (Button) findViewById(R.id.b6_4);
        sig = (Button) findViewById(R.id.siguiente6_4);

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
            case R.id.a6_4: //Respuesta correcta
                calificacion+=0;
                deshabilitar();
                break;
            case R.id.b6_4:
                calificacion+=1;
                deshabilitar();
                break;
            case R.id.siguiente6_4:
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
        a.setEnabled(false);
        b.setEnabled(false);
        sig.setEnabled(true);
    }
}