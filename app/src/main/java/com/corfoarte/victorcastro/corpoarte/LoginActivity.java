package com.corfoarte.victorcastro.corpoarte;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.musi);
        mediaPlayer.setVolume(30, 10);
        mediaPlayer.start();

    }

    @OnClick(R.id.Inscripciones)
    public void sayHi(Button button) {
        //button.setText("Hello!");
        Intent intent = new Intent(getApplicationContext(), InscripcionesActivity.class);
        ///
        startActivity(intent);
    }

    @OnClick(R.id.Home)
    public void sayHis(Button button) {
        //button.setText("Hello!");
        Intent intent = new Intent(getApplicationContext(), NoticiasActivity.class);
        startActivity(intent);
    }
}