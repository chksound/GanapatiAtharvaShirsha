package com.chksound.apps.ganapatiatharvashirsha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class AaratiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aarati);
        WebView webViewMean = (WebView) findViewById(R.id.webViewAarati);
        webViewMean.loadUrl("file:///android_asset/Aarati1.html");
    }
}
