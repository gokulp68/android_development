package com.example.goku.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int rand1;
    private int rand2;
    private  int points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int points;
        pickRandomnumbers();

    }
    private void pickRandomnumbers(){
        Random randy = new Random();
        rand1 = randy.nextInt(10);
        rand2 = randy.nextInt(10);
        Button lbutt = (Button) findViewById(R.id.left_button);
        lbutt.setText(Integer.toString(rand1));
        Button rbutt = (Button) findViewById(R.id.right_button);
        rbutt.setText(Integer.toString(rand2));
    }

    public void leftButtonClicked(View view) {
        if (rand1 <= rand2){
            points--;
        }else {
            points++;
        }
        TextView text = (TextView) findViewById(R.id.point_bar);
        text.setText("POINTS:"+points);
        pickRandomnumbers();
    }
    public void rightButtonClicked(View view) {
        if (rand1 <= rand2){
            points++;
        }else {
            points--;
        }
        TextView text = (TextView) findViewById(R.id.point_bar);
        text.setText("POINTS:"+points);
        pickRandomnumbers();
    }
}
