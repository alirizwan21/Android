package com.example.activitylog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_two extends AppCompatActivity {
    static int start1=0,restart1=0,resume1=0,create1=0;
    TextView tvCreate1,tvStart1, tvResume1,tvRestart1;
    Button btnActivity1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Log.i("key","onCreate is called for activity 2");
        create1++;
        tvCreate1=findViewById(R.id.tvCreate1);
        tvStart1=findViewById(R.id.tvStart1);
        tvRestart1=findViewById(R.id.tvRestart1);
        tvResume1=findViewById(R.id.tvResume1);
        btnActivity1=findViewById(R.id.btnActivity1);
        tvCreate1.setText("onCreate is called: "+create1);
        tvStart1.setText("onStart is called: "+start1);
        tvResume1.setText("onResume is called: "+resume1);
        tvRestart1.setText("onRestart is called: "+restart1);

        btnActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity_two.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    protected void onStart(){
        super.onStart();
        Log.i("key","onStart is called for activity 2");
        start1++;
        tvStart1.setText("onStart is called: "+start1);
    }

    protected void onRestart(){
        super.onRestart();
        Log.i("key","onRestart is called for activity 2");
        restart1++;
        tvRestart1.setText("onRestart is called: "+restart1);
    }

    protected void onResume(){
        super.onResume();
        Log.i("key","onResume is called for activity 2");
        resume1++;
        tvResume1.setText("onResume is called: "+resume1);
    }

    protected void onPause(){
        super.onPause();
        Log.i("key","onPause is called for activity 2");
    }

    protected void onStop(){
        super.onStop();
        Log.i("key","onStop is called for activity 2");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i("key","onDestroy is called for activity 2");
    }
}