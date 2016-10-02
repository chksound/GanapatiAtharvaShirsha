package com.chksound.apps.ganapatiatharvashirsha;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.util.Linkify;
import android.widget.TextView;

class AboutDialog extends Dialog {

    public AboutDialog(Context context) {
        super(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.about);
        TextView tv = (TextView) findViewById(R.id.info_text);
        tv.setText(Html.fromHtml("<h3>Ganapati AtharvaShirsha & Arati</h3>\n" +
                "Version 1.8<br>\n" +
                "Copyright 2016<br>\n" +
                "<b>www.chksound.com</b><br><br>\n"));
        tv.setLinkTextColor(Color.RED);
        Linkify.addLinks(tv, Linkify.ALL);
    }
}
