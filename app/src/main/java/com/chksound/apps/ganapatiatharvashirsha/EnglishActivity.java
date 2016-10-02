package com.chksound.apps.ganapatiatharvashirsha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class EnglishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        WebView webViewEng = (WebView) findViewById(R.id.webViewEng);
        webViewEng.loadUrl("file:///android_asset/Eng.html");
    }
}
