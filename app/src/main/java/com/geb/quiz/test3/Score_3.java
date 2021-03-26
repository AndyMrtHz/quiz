package com.geb.quiz.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.geb.quiz.MainActivity;
import com.geb.quiz.R;
import com.geb.quiz.test1.Score;

public class Score_3 extends AppCompatActivity {
    Intent intent, recibe;
    int calificacion=0;
    Bundle bundle;
    Button back;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_3);

        back = (Button) findViewById(R.id.back3);
        txt = (TextView) findViewById(R.id.score3);
        intent = new Intent(Score_3.this, MainActivity.class);

        try {
            recibe=getIntent();
            bundle=recibe.getExtras();
            calificacion = bundle.getInt("calificacion");
            txt.setText("Score:" + calificacion);
        }
        catch (Exception e){
            Toast.makeText(this,"Errod al recibir calificacion", Toast.LENGTH_SHORT).show();
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}