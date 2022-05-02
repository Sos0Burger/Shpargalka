package com.example.shpargalka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class window_in extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window_in);
        Intent intent = getIntent();
        WebView textView = findViewById(R.id.qq);
        textView.loadUrl("file:///android_asset/" + intent.getStringExtra("key"));

    }
}