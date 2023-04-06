package com.example.randcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout layout = new RelativeLayout(this);
        layout.setBackgroundColor(Color.BLUE);

        RelativeLayout.LayoutParams buttonParams =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);

        buttonParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonParams.addRule(RelativeLayout.CENTER_VERTICAL);

        Button button = initButton();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int rgbOne = random.nextInt(256);
                int rgbTwo = random.nextInt(256);
                int rgbThree = random.nextInt(256);

                layout.setBackgroundColor(Color.rgb(rgbOne, rgbTwo, rgbThree));
            }
        });

        layout.addView(button, buttonParams);
        setContentView(layout);
    }


    public Button initButton() {
        Button button = new Button(this);
        button.setText("PRESS ME");
        button.setTextColor(Color.BLACK);
        button.setBackgroundColor(Color.YELLOW);


        return button;
    }
}