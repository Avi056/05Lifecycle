package com.example.a5lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
/*
countonCreate
countonStart
countonResume
countonPause
countonStop
countonRestart
countonDestroy
 */
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    int countonCreate = 0;
    int countonStart = 0;
    int countonResume = 0;
    int countonPause = 0;
    int countonStop = 0;
    int countonRestart = 0;
    int countonDestroy = 0;
    int ccountonCreate = 0;
    int ccountonStart = 0;
    int ccountonResume = 0;
    int ccountonPause = 0;
    int ccountonStop = 0;
    int ccountonRestart = 0;
    int ccountonDestroy = 0;
    TextView countonCreatet;
    TextView countonStartt;
    TextView countonResumet;
    TextView countonPauset;
    TextView countonStopt;
    TextView countonRestartt;
    TextView countonDestroyt;
    TextView ccountonCreatet;
    TextView ccountonStartt;
    TextView ccountonResumet;
    TextView ccountonPauset;
    TextView ccountonStopt;
    TextView ccountonRestartt;
    TextView ccountonDestroyt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("com.example.a5lifecycle.sharedpreferences", MODE_PRIVATE);
        editor = sharedPreferences.edit();

        countonCreatet = findViewById(R.id.lonCreate);
        countonStartt = findViewById(R.id.lonStart);
        countonResumet = findViewById(R.id.lonResume);
        countonPauset = findViewById(R.id.lonPause);
        countonStopt = findViewById(R.id.lonStop);
        countonRestartt = findViewById(R.id.lonRestart);
        countonDestroyt = findViewById(R.id.lonDestroy);

        ccountonCreatet = findViewById(R.id.conCreate);
        ccountonStartt = findViewById(R.id.conStart);
        ccountonResumet = findViewById(R.id.conResume);
        ccountonPauset = findViewById(R.id.conPause);
        ccountonStopt = findViewById(R.id.conStop);
        ccountonRestartt = findViewById(R.id.conRestart);
        ccountonDestroyt = findViewById(R.id.conDestroy);

        setInitialValues();
        countonCreate += 1;
        ccountonCreate += 1;
        ccountonCreatet.setText("onCreate: " + ccountonCreate);
        editor.putInt("onCreate", countonCreate);
        countonCreatet.setText("onCreate: " + countonCreate);
        editor.apply();
    }
    private void setInitialValues(){
        countonCreate = sharedPreferences.getInt("onCreate",0);
        countonStart = sharedPreferences.getInt("onStart",0);
        countonResume = sharedPreferences.getInt("onResume",0);
        countonPause = sharedPreferences.getInt("onPause",0);
        countonStop = sharedPreferences.getInt("onStop",0);
        countonRestart = sharedPreferences.getInt("onRestart",0);
        countonDestroy = sharedPreferences.getInt("onDestroy",0);
        countonCreatet.setText("onCreate: " + countonCreate);
        countonStartt.setText("onStart: " + countonStart);
        countonResumet.setText("onResume: " + countonResume);
        countonPauset.setText("onPause: " + countonPause);
        countonStopt.setText("onStop: " + countonStop);
        countonRestartt.setText("onRestart: " + countonRestart);
        countonDestroyt.setText("onDestroy: " + countonDestroy);
        ccountonCreatet.setText("onCreate: " + ccountonCreate);
        ccountonStartt.setText("onStart: " + ccountonStart);
        ccountonResumet.setText("onResume: " + ccountonResume);
        ccountonPauset.setText("onPause: " + ccountonPause);
        ccountonStopt.setText("onStop: " + ccountonStop);
        ccountonRestartt.setText("onRestart: " + ccountonRestart);
        ccountonDestroyt.setText("onDestroy: " + ccountonDestroy);
    }

    @Override
    protected void onStart() {
        countonStart += 1;
        ccountonStart += 1;
        ccountonStartt.setText("onStart: " + ccountonStart);
        editor.putInt("onStart", countonStart);
        countonStartt.setText("onStart: " + countonStart);
        editor.apply();
        super.onStart();
    }

    @Override
    protected void onResume() {
        countonResume += 1;
        ccountonResume += 1;
        ccountonResumet.setText("onResume: " + ccountonResume);
        editor.putInt("onResume", countonResume);
        countonResumet.setText("onResume: " + countonResume);
        editor.apply();
        super.onResume();
    }

    @Override
    protected void onPause() {
        countonPause += 1;
        ccountonPause += 1;
        ccountonPauset.setText("onPause: " + ccountonPause);
        editor.putInt("onPause", countonPause);
        countonPauset.setText("onPause: " + countonPause);
        editor.apply();
        super.onPause();
    }

    @Override
    protected void onStop() {
        countonStop += 1;
        ccountonStop += 1;
        ccountonStopt.setText("onStop: " + ccountonStop);
        editor.putInt("onStop", countonStop);
        countonStopt.setText("onStop: " + countonStop);
        editor.apply();
        super.onStop();
    }

    @Override
    protected void onRestart() {
        countonRestart += 1;
        ccountonRestart += 1;
        ccountonRestartt.setText("onRestart: " + ccountonRestart);
        editor.putInt("onRestart", countonRestart);
        countonRestartt.setText("onRestart: " + countonRestart);
        editor.apply();
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        countonDestroy += 1;
        ccountonDestroy += 1;
        ccountonDestroyt.setText("onDestroy: " + ccountonDestroy);
        editor.putInt("onDestroy", countonDestroy);
        countonDestroyt.setText("onDestroy: " + countonDestroy);
        editor.apply();
        super.onDestroy();
    }

    public void reset(View view) {
       countonCreate = 0;
        countonStart = 0;
        countonResume = 0;
        countonPause = 0;
        countonStop = 0;
        countonRestart = 0;
        countonDestroy = 0;
        ccountonCreate = 0;
        ccountonStart = 0;
        ccountonResume = 0;
        ccountonPause = 0;
        ccountonStop = 0;
        ccountonRestart = 0;
        ccountonDestroy = 0;
        editor.putInt("onCreate", countonCreate);
        editor.putInt("onStart", countonStart);
        editor.putInt("onResume", countonResume);
        editor.putInt("onPause", countonPause);
        editor.putInt("onStop", countonStop);
        editor.putInt("onRestart", countonRestart);
        editor.putInt("onDestroy", countonDestroy);
        countonCreatet.setText("onCreate: " + countonCreate);
        countonStartt.setText("onStart: " + countonStart);
        countonResumet.setText("onResume: " + countonResume);
        countonPauset.setText("onPause: " + countonPause);
        countonStopt.setText("onStop: " + countonStop);
        countonRestartt.setText("onRestart: " + countonRestart);
        countonDestroyt.setText("onDestroy: " + countonDestroy);
        ccountonCreatet.setText("onCreate: " + ccountonCreate);
        ccountonStartt.setText("onStart: " + ccountonStart);
        ccountonResumet.setText("onResume: " + ccountonResume);
        ccountonPauset.setText("onPause: " + ccountonPause);
        ccountonStopt.setText("onStop: " + ccountonStop);
        ccountonRestartt.setText("onRestart: " + ccountonRestart);
        ccountonDestroyt.setText("onDestroy: " + ccountonDestroy);
        editor.apply();
    }
}