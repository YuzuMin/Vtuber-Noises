package com.yuzumin.guranoises;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class About extends AppCompatActivity {

    WebView StoreView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        StoreView=findViewById(R.id.store_view);
        StoreView.loadUrl("https://play.google.com/store/apps/dev?id=8294948611477283731");

    }
}