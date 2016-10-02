package com.chksound.apps.ganapatiatharvashirsha;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;

public class PlayActivity extends AppCompatActivity {

    private ImageButton play,pause;
    private MediaPlayer mediaPlayer;
    private SeekBar seekBar;
    private Handler myHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        play = (ImageButton) findViewById(R.id.buttonPlay);
        pause = (ImageButton) findViewById(R.id.buttonPause);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setClickable(false);
        mediaPlayer = MediaPlayer.create(this, R.raw.atharvashirsha_final_chksound);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                //Log.d("MP", "MP:::Play Pressed " + mediaPlayer.isPlaying());
                seekBar.setMax(mediaPlayer.getDuration());
                seekBar.setProgress(mediaPlayer.getCurrentPosition());
                myHandler.postDelayed(UpdateSongTime, 1000);
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    //Log.d("MP", "MP:::Pause Pressed " + mediaPlayer.isPlaying());
                }
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (mediaPlayer != null && fromUser) {
                    mediaPlayer.seekTo(progress * 1000);
                }
            }
        });
    }//oncreate

    private Runnable UpdateSongTime = new Runnable() {
        public void run() {
            seekBar.setProgress(mediaPlayer.getCurrentPosition());
            myHandler.postDelayed(this, 1000);
        }
    };


    @Override
    protected void onStart() {
        super.onStart();
//        Log.d("MP", "MP:::OnStart Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
//        Log.d("MP", "MP:::OnStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        Log.d("MP", "MP:::OnDestroy Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
//        Log.d("MP","MP:::OnResume Called");
        if (mediaPlayer != null) {
            if (mediaPlayer.getCurrentPosition() > 0) {
                mediaPlayer.start();
            }
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
//        Log.d("MP", "MP:::OnPause Called");
        if (mediaPlayer != null && mediaPlayer.isPlaying()) mediaPlayer.pause();
    }

}//class
