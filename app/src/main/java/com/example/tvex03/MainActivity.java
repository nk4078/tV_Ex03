package com.example.tvex03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    TextView tV;
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        tV = (TextView) findViewById(R.id.tV);
        x=0;
    }

    public void clicked(View view) {
        x=x+1;
        tV.setText("This is a click number: " + x);
        if (x==6){
            tV.setText("Enough to click. Go to new start!");
            x=0;
        }
    }
}