package com.example.tableau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.AndroidException;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer GroovePoint=0;
    Integer BalasPoint=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("SCPPoint", GroovePoint);
        outState.putInt("GOCPoint", BalasPoint);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("SCPPoint")) {
            GroovePoint = savedInstanceState.getInt("SCPPoint");
        }
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("GOCPoint")) {
            BalasPoint = savedInstanceState.getInt("GOCPoint");
        }
    }



    public void addPointSCP(View view){
        TextView textViewSCP = findViewById(R.id.SCPPoints);
        GroovePoint++;
        textViewSCP.setText(GroovePoint.toString());
    }

    public void addPointGOC(View view){
        TextView textViewGOC = findViewById(R.id.GOCPoints);
        BalasPoint++;
        textViewGOC.setText(BalasPoint.toString());
    }

    public void reset(View view){
        TextView textViewSCP = findViewById(R.id.SCPPoints);
        TextView textViewGOC = findViewById(R.id.GOCPoints);
        GroovePoint=0;
        BalasPoint=0;
        textViewSCP.setText(GroovePoint.toString());
        textViewGOC.setText(BalasPoint.toString());
    }
}
