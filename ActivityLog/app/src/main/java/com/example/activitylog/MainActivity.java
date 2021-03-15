package com.example.activitylog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static int start=0,restart=0,resume=0,create=0;
    TextView tvCreate,tvStart, tvResume,tvRestart;
    Button btnActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("key","onCreate is called for activity 1");
        create++;
        tvCreate=findViewById(R.id.tvCreate);
        tvStart=findViewById(R.id.tvStart);
        tvRestart=findViewById(R.id.tvRestart);
        tvResume=findViewById(R.id.tvResume);
        btnActivity=findViewById(R.id.btnActivity);
        tvCreate.setText("onCreate is called: "+create);
        tvStart.setText("onStart is called: "+start);
        tvResume.setText("onResume is called: "+resume);
        tvRestart.setText("onRestart is called: "+restart);

        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Activity_two.class);
                startActivity(intent);
            }
        });
    }

    protected void onStart(){
        super.onStart();
        Log.i("key","onStart is called for activity 1");
        start++;
        tvStart.setText("onStart is called: "+start);
    }

    protected void onRestart(){
        super.onRestart();
        Log.i("key","onRestart is called for activity 1");
        restart++;
        tvRestart.setText("onRestart is called: "+restart);
    }

    protected void onResume(){
        super.onResume();
        Log.i("key","onResume is called for activity 1");
        resume++;
        tvResume.setText("onResume is called: "+resume);
    }

    protected void onPause(){
        super.onPause();
        Log.i("key","onPause is called for activity 1");
    }

    protected void onStop(){
        super.onStop();
        Log.i("key","onStop is called for activity 1");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i("key","onDestroy is called for activity 1");
    }

}