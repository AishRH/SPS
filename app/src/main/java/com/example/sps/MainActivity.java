package com.example.sps;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button STONE;
    private Button PAPER;
    private Button SCISSORS;
    private Button button;
    private TextView textView3;
    static int t = 0;
    static int score = 0;
public static final String EXTRA_NAME="com.example.sps.extra.name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        STONE = findViewById(R.id.STONE);
        PAPER = findViewById(R.id.PAPER);
        SCISSORS = findViewById(R.id.SCISSORS);
        textView3 = findViewById(R.id.textView3);
        button = findViewById(R.id.button);

        // prints out the value at the randomly selected index


        STONE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t++;
                String[] arr = {"STONE", "PAPER", "SCISSORS"};
                Random random = new Random();

                // randomly selects an index from the arr
                int select = random.nextInt(arr.length);
                textView3.setText("Computer Selected: " + arr[select]);
                if (arr[select].equals("STONE")) {
                    Toast toast = Toast.makeText(MainActivity.this,"TIE OCCURS", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.RIGHT, 0, 150);
                    toast.show();
                } else if (arr[select].equals("PAPER")) {
                    Toast toast = Toast.makeText(MainActivity.this,"COMPUTER WON", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.RIGHT, 0, 150);
                    toast.show();
                } else if (arr[select].equals("SCISSORS")) {
                    Toast toast = Toast.makeText(MainActivity.this,"YOU WON", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.RIGHT, 0, 150);
                    toast.show();
                    score++;
                }
            }
        });
        PAPER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t++;

                String[] arr = {"STONE", "PAPER", "SCISSORS"};
                Random random = new Random();

                // randomly selects an index from the arr
                int select = random.nextInt(arr.length);
                textView3.setText("Computer Selected: " + arr[select]);
                if (arr[select].equals("STONE")) {
                    Toast toast = Toast.makeText(MainActivity.this,"YOU WON", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP, 0, 150);
                    toast.show();
                    score++;
                } else if (arr[select].equals("PAPER")) {
                    Toast toast = Toast.makeText(MainActivity.this,"TIE OCCURS", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP, 0, 150);
                    toast.show();
                } else if (arr[select] == "SCISSORS") {
                    Toast toast = Toast.makeText(MainActivity.this,"COMPUTER WON", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP, 0, 150);
                    toast.show();
                }
            }
        });
        SCISSORS.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                t++;

                String[] arr = {"STONE", "PAPER", "SCISSORS"};
                Random random = new Random();

                // randomly selects an index from the arr
                int select = random.nextInt(arr.length);
                textView3.setText("Computer Selected: " + arr[select]);
                if (arr[select].equals("STONE")) {
                    Toast toast = Toast.makeText(MainActivity.this,"COMPUTER WON", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP, 0, 150);
                    toast.show();
                } else if (arr[select].equals("PAPER")) {
                    Toast toast = Toast.makeText(MainActivity.this,"YOU WON", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP, 0, 150);
                    toast.show();
                    score++;
                } else if (arr[select].equals("SCISSORS")) {
                    Toast toast = Toast.makeText(MainActivity.this,"TIE OCCURS", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP, 0, 100);
                    toast.show();
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                Bundle b=new Bundle();

                b.putString("key", String.valueOf(score));
                b.putString("k", String.valueOf(t));
                i.putExtras(b);
                startActivity(i);
            }

        });
    }
}