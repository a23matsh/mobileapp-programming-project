package com.example.project;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;


public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView webView = findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/about.html");
    }
}