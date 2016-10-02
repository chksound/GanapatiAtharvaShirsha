package com.chksound.apps.ganapatiatharvashirsha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class MeaningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meaning);
        WebView webViewMean = (WebView) findViewById(R.id.webViewMean);
        webViewMean.loadUrl("file:///android_asset/Meaning.html");
    }
}
