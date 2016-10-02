package com.chksound.apps.ganapatiatharvashirsha;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    //private final String LOG_TAG = "AtharvaShirsha";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnglish = (Button) findViewById(R.id.btnEnglish);
        btnEnglish.setOnClickListener(EnglishListener);
        Button btnSanskrit = (Button) findViewById(R.id.btnSanskrit);
        btnSanskrit.setOnClickListener(SanskritListener);
        Button btnMeaning = (Button) findViewById(R.id.btnMeaning);
        btnMeaning.setOnClickListener(MeaningListener);
        Button btnMedia = (Button) findViewById(R.id.btnPlay);
        btnMedia.setOnClickListener(PlayListener);
        Button btnStotra = (Button) findViewById(R.id.btnStotra);
        btnStotra.setOnClickListener(StotraListener);
        Button btnAarati = (Button) findViewById(R.id.btnAarati);
        btnAarati.setOnClickListener(AaratiListner);

        ImageButton btnPro = (ImageButton) findViewById(R.id.imageButtonPro);
        btnPro.setOnClickListener(ProListener);

    }

    private final View.OnClickListener EnglishListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent eIntent1 = new Intent(getBaseContext(), EnglishActivity.class);
            startActivity(eIntent1);
        }
    };

    private final View.OnClickListener SanskritListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent eIntent2 = new Intent(getBaseContext(), SanskritActivity.class);
            startActivity(eIntent2);
        }
    };

    private final View.OnClickListener MeaningListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent eIntent3 = new Intent(getBaseContext(), MeaningActivity.class);
            startActivity(eIntent3);
        }
    };
    private final View.OnClickListener PlayListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent eIntent4 = new Intent(getBaseContext(), PlayActivity.class);
            startActivity(eIntent4);
        }
    };

    private final View.OnClickListener StotraListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent eIntent5 = new Intent(getBaseContext(), Stotra.class);
            startActivity(eIntent5);
        }
    };

    private final View.OnClickListener AaratiListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent eIntent6 = new Intent(getBaseContext(), AaratiActivity.class);
            startActivity(eIntent6);
        }
    };

    private final View.OnClickListener ProListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent eIntent7 = new Intent(Intent.ACTION_VIEW);
            eIntent7.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.chksound.apps.ganapatiatharvashirshapro"));
            startActivity(eIntent7);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            AboutDialog about = new AboutDialog(this);
            about.setTitle("About..");
            about.show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
