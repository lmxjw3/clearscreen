package com.lmx.clearscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lmx.library.widget.ClearScreenLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        ClearScreenLayout layoutClear = findViewById(R.id.layoutClear);
        View viewWhite = findViewById(R.id.viewWhite);
        View ll12 = findViewById(R.id.ll12);
        View tv3 = findViewById(R.id.tv3);
        View viewBg = findViewById(R.id.viewBg);
        layoutClear.addClearViews(viewWhite, ll12, tv3, viewBg);
    }
}
