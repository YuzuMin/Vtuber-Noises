package com.yuzumin.guranoises;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class SettingsMenu extends AppCompatActivity {

    CardView AppName;
    CardView AppVersion;
    CardView LegalInformation;

    CardView Sound_Settings;
    CardView Character;
    CardView MoreApps;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_menu);
        getSupportActionBar().hide();

        AppName=findViewById(R.id.app_name);
        AppVersion=findViewById(R.id.app_version);
        LegalInformation=findViewById(R.id.app_legal);

        Sound_Settings=findViewById(R.id.sounds);
        Sound_Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(SettingsMenu.this, SoundSettings.class);
                startActivity(intent);
            }
        });
        Sound_Settings.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    Sound_Settings.setCardBackgroundColor(getResources().getColor(R.color.darkblvck));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    Sound_Settings.setCardBackgroundColor(getResources().getColor(R.color.blvck));
                }
                return false;
            }
        });
        Character=findViewById(R.id.character);
        MoreApps=findViewById(R.id.more_apps);


    }
}