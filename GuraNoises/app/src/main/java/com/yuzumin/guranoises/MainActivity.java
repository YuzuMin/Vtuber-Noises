package com.yuzumin.guranoises;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.*;

public class MainActivity extends AppCompatActivity implements Count.CountListener{
    ImageView image;
    TextView textCount;

    MediaPlayer guranoise;
    MediaPlayer.OnCompletionListener listener;

    ObjectAnimator anim1, anim2, anim3;
    AnimatorSet set1, set2;

    SharedPreferences SoundSettings;

    boolean switch1;
    boolean switch2;
    boolean switch3;
    boolean switch4;
    boolean switch5;
    boolean switch6;
    boolean switch7;
    boolean switch8;
    boolean switch9;
    boolean switch10;
    boolean switch11;
    boolean switch12;

    List<Integer> listofsounds;

    
    Count count;
    SharedPreferences sp;

    @Override
    public void OnUpdated(int count) {
        sp.edit().putInt("count", count).apply();
        textCount.setText(String.format("Count: %d", count));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        retrievedata();


        SoundSettings =getSharedPreferences("save2",MODE_PRIVATE);
        switch2= SoundSettings.getBoolean("value2",true);

        listener = new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                cleanupMediaPlayer();
            }
        };

        image = findViewById(R.id.image);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(switch2){
                    count.increment();
                    startRandomSound();
                }
                else{
                    Toast.makeText(v.getContext(), "NOT ACTIVE", Toast.LENGTH_SHORT).show();
                }
            }
        });

        textCount = findViewById(R.id.count);


        anim1 = ObjectAnimator.ofFloat(image,"translationY", 0f,-50f, 50f, -50f, 50f, 0);
        anim1.setDuration(600);
        set1 = new AnimatorSet();
        ArrayList<Animator> setArray = new ArrayList<>();


        anim2 = ObjectAnimator.ofFloat(image,"translationY", 0f,-50f, 50f, -50f, 50f, -50f, 50f, -50f, 50f,0);
        anim2.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim2);
        anim2 = ObjectAnimator.ofFloat(image,"translationX", 0f,-70f, 70f, -70f, 70f, 0);
        anim2.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim2);
        set1.playTogether(setArray);
        set1.setDuration(2000);
        anim2 = null;


        set2 = new AnimatorSet();
        setArray = new ArrayList<>();
        anim3 = ObjectAnimator.ofFloat(image, "rotation", 0f, -90f, 0f, 90f, 180f, 270f, 360f);
        anim3.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim3);
        anim3 = ObjectAnimator.ofFloat(image, "scaleX", 1f,0.5f, 1.5f, 0.5f, 1.5f, 1f);
        anim3.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim3);
        anim3 = ObjectAnimator.ofFloat(image, "scaleY", 1f,.5f, 1.5f, 0.5f, 1.5f, 1f);
        anim3.setRepeatCount(ValueAnimator.INFINITE);
        setArray.add(anim3);
        set2.playTogether(setArray);
        set2.setDuration(2000);
        anim3 = null;
        count = new Count();
        count.setListener(this);

        sp = this.getSharedPreferences("count", MODE_PRIVATE);
        count.setCount(sp.getInt("count", 0));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.option,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case(R.id.settings):
                Intent settingmenu;
                settingmenu = new Intent(MainActivity.this, SettingsMenu.class);
                startActivity(settingmenu);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void stopAnimations(){
        if (anim1.isRunning())
            anim1.end();
        if (set1.isRunning())
            set1.end();
        if (set2.isRunning())
            set2.end();
    }

    private void cleanupMediaPlayer(){
        stopAnimations();
        if(guranoise!=null) {
            if(guranoise.isPlaying())
                guranoise.stop();
            guranoise.release();
            guranoise = null;
        }
    }

    private void startRandomSound() {

        int value=(int)(Math.random()*(listofsounds.size()));
        int num = listofsounds.get(value);

        cleanupMediaPlayer();

        if (num==3&&switch3) {

            //play A

            guranoise = MediaPlayer.create(this, R.raw.guranoise1);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            if(switch1){
                Toast.makeText(this, "A", Toast.LENGTH_SHORT).show();
            }
            anim1.start();

        } else if (num==4&&switch4) {

            //play Ehh

            guranoise = MediaPlayer.create(this, R.raw.guranoise2);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            if(switch1){
                Toast.makeText(this, "Ehh", Toast.LENGTH_SHORT).show();
            }
            set1.start();

        } else if (num==5&&switch5) {

            //Play Ahh

            guranoise = MediaPlayer.create(this, R.raw.guranoise3);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            if(switch1){
                Toast.makeText(this, "Ahh", Toast.LENGTH_SHORT).show();
            }
            set1.start();

        }else if (num==6&&switch6) {

            //play Ara Ara

            guranoise = MediaPlayer.create(this, R.raw.guranoise4);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            if(switch1){
                Toast.makeText(this, "Ara Ara", Toast.LENGTH_SHORT).show();
            }
            set1.start();

        }else if (num==7&&switch7){

            //Play NOOOOOO

            guranoise = MediaPlayer.create(this, R.raw.guranoise5);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            if(switch1){
                Toast.makeText(this, "NOOOOOO!", Toast.LENGTH_SHORT).show();
            }
            set2.start();

        }else if (num==8&&switch8){

            //play Hey that's pretty good

            guranoise = MediaPlayer.create(this, R.raw.guranoise6);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            if(switch1){
                Toast.makeText(this, "Hey that's pretty good", Toast.LENGTH_SHORT).show();
            }
            set1.start();

        }else if (num==9&&switch9){

            //play lewd A

            guranoise = MediaPlayer.create(this, R.raw.guranoise7);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            if(switch1){
                Toast.makeText(this, "Lewd 'A'", Toast.LENGTH_SHORT).show();
            }
            anim1.start();

        }else if (num==10&&switch10){

            //play Wake Up

            guranoise = MediaPlayer.create(this, R.raw.guranoise8);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            if(switch1){
                Toast.makeText(this, "Wake Up", Toast.LENGTH_SHORT).show();
            }
            set1.start();

        }else if (num==11&&switch11){

            //play OK?

            guranoise = MediaPlayer.create(this, R.raw.guranoise9);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            if(switch1){
                Toast.makeText(this, "OK?", Toast.LENGTH_SHORT).show();
            }
            anim1.start();

        }else if (switch12){

            //play JA JANG

            guranoise = MediaPlayer.create(this, R.raw.guranoise10);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            if(switch1){
                Toast.makeText(this, "JA JANG", Toast.LENGTH_SHORT).show();
            }
            set1.start();

        }
    }


    private void retrievedata(){

        listofsounds= new ArrayList<Integer>();

        SoundSettings =getSharedPreferences("save1",MODE_PRIVATE);
        switch1= SoundSettings.getBoolean("value1",true);

        SoundSettings =getSharedPreferences("save2",MODE_PRIVATE);
        switch2= SoundSettings.getBoolean("value2",true);


        SoundSettings =getSharedPreferences("save3",MODE_PRIVATE);
        switch3= SoundSettings.getBoolean("value3",true);
        if (switch3) {
            listofsounds.add(3);
        }

        SoundSettings =getSharedPreferences("save4",MODE_PRIVATE);
        switch4= SoundSettings.getBoolean("value4",true);
        if (switch4) {
            listofsounds.add(4);
        }

        SoundSettings =getSharedPreferences("save5",MODE_PRIVATE);
        switch5= SoundSettings.getBoolean("value5",true);
        if (switch5) {
            listofsounds.add(5);
        }

        SoundSettings =getSharedPreferences("save6",MODE_PRIVATE);
        switch6= SoundSettings.getBoolean("value6",true);
        if (switch6) {
            listofsounds.add(6);
        }

        SoundSettings =getSharedPreferences("save7",MODE_PRIVATE);
        switch7= SoundSettings.getBoolean("value7",true);
        if (switch7) {
            listofsounds.add(7);
        }

        SoundSettings =getSharedPreferences("save8",MODE_PRIVATE);
        switch8= SoundSettings.getBoolean("value8",true);
        if (switch8) {
            listofsounds.add(8);
        }

        SoundSettings =getSharedPreferences("save9",MODE_PRIVATE);
        switch9= SoundSettings.getBoolean("value9",true);
        if (switch9) {
            listofsounds.add(9);
        }

        SoundSettings =getSharedPreferences("save10",MODE_PRIVATE);
        switch10= SoundSettings.getBoolean("value10",true);
        if (switch10) {
            listofsounds.add(10);
        }

        SoundSettings =getSharedPreferences("save11",MODE_PRIVATE);
        switch11= SoundSettings.getBoolean("value11",true);
        if (switch11) {
            listofsounds.add(11);
        }

        SoundSettings =getSharedPreferences("save12",MODE_PRIVATE);
        switch12= SoundSettings.getBoolean("value12",true);
        if (switch12) {
            listofsounds.add(12);
        }

    }

    @Override
    protected void onDestroy() {
        cleanupMediaPlayer();
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        cleanupMediaPlayer();
        super.onStop();
    }

    @Override
    protected void onResume() {
        retrievedata();
        super.onResume();
    }

}