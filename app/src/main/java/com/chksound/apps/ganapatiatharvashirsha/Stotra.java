package com.chksound.apps.ganapatiatharvashirsha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class Stotra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stotra);
        WebView webViewStotra = (WebView) findViewById(R.id.webViewStotra);
        webViewStotra.loadUrl("file:///android_asset/Stotra.html");
    }
}
