package com.ersubhadip.custombuttons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    private LottieAnimationView button3;
    private AppCompatButton b5;
    private ProgressBar p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button3 = findViewById(R.id.lottieBtn);

        b5=findViewById(R.id.b5);
        p=findViewById(R.id.p);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b5.setText("");
                p.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, "Hello Forks", Toast.LENGTH_SHORT).show();
                for (int i = 0; i < 100; i++) {
                    continue;
                }
                p.setVisibility(View.INVISIBLE);
                b5.setText("Click Me");

            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                button3.playAnimation();
            }
        });
    }
}