package com.yuzumin.guranoises;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Sources extends AppCompatActivity {

    TextView GodOfFortune;
    TextView HomeBG;
    TextView SoundsBG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sources);
        getSupportActionBar().hide();

        GodOfFortune=findViewById(R.id.gura_img);
        GodOfFortune.setMovementMethod(LinkMovementMethod.getInstance());


        HomeBG=findViewById(R.id.home_bg);
        HomeBG.setMovementMethod(LinkMovementMethod.getInstance());


        SoundsBG=findViewById(R.id.sounds_bg);
        SoundsBG.setMovementMethod(LinkMovementMethod.getInstance());
    }
}