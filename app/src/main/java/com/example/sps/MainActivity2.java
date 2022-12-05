package com.example.sps;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
   private TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       Bundle b=getIntent().getExtras();
       String s=b.getString("key");
        String tu=b.getString("k");
       textView4=findViewById(R.id.textView4);
       textView4.setText(s+"/"+tu);
    }
        }

