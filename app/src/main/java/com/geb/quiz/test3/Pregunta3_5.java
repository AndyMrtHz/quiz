package com.geb.quiz.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.geb.quiz.R;

public class Pregunta3_5 extends AppCompatActivity implements View.OnClickListener {
    Button a,b,sig;
    Intent intent, recibe;
    int calificacion=0;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3_5);
        intent = new Intent(Pregunta3_5.this, Score_3.class);
        a = (Button) findViewById(R.id.a3_5);
        b = (Button) findViewById(R.id.b3_5);
        sig = (Button) findViewById(R.id.siguiente3_5);

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
            case R.id.a3_5: //Respuesta correcta
                calificacion+=1;
                deshabilitar();
                break;
            case R.id.b3_5:
                calificacion+=0;
                deshabilitar();
                break;
            case R.id.siguiente3_5:
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