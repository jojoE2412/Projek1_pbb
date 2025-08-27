package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int count=0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text1);

    }

    public void showToto(View view) {
        Toast.makeText(this, "mari berhitung", Toast.LENGTH_SHORT).show();
    }

    public void showTombol(View view) {
        count++;
        textView.setText(count+"");
    }

    public void resetTombol(View view) {
        count = 0;
        textView.setText(String.valueOf(count));
    }
}