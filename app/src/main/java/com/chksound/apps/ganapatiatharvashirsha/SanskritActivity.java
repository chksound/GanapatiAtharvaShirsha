package com.chksound.apps.ganapatiatharvashirsha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class SanskritActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanskrit);
        WebView webViewSan = (WebView) findViewById(R.id.webViewSan);
        webViewSan.loadUrl("file:///android_asset/Sanskrit.html");
    }
}
