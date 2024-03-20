package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void calcMBI(View view) {
        EditText height  = findViewById(R.id.etHeight);
        EditText weight = findViewById(R.id.etWeight);
        double h = Double.parseDouble(height.getText().toString());
        double w = Double.parseDouble(weight.getText().toString());
        double bmi = w / (h/100.0 * h/100.0);
        String result = "你的BMI是：" + bmi;
//        5555555
        TextView show = findViewById(R.id.tvShow);
        show.setText(result);
    }
}
