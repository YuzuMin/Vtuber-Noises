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
import java.util.Random;

public class MainActivity extends AppCompatActivity implements Count.CountListener{
    ImageView image;
    TextView textCount;

    MediaPlayer guranoise;
    MediaPlayer.OnCompletionListener listener;

    ObjectAnimator anim1, anim2, anim3;
    AnimatorSet set1, set2;

    SharedPreferences sharedPreferences;

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

        sharedPreferences =getSharedPreferences("save2",MODE_PRIVATE);
        switch2= sharedPreferences.getBoolean("value2",true);

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
            case(R.id.about):
                Intent intent;
                intent = new Intent(MainActivity.this,About.class);
                startActivity(intent);
                break;
            case(R.id.settings):
                Intent settingmenu;
                settingmenu = new Intent(MainActivity.this,Settings.class);
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
        Random random = new Random();
        float next = random.nextFloat();
        int counter =count.getCount();

        cleanupMediaPlayer();

        System.out.println(next);
        if (counter%31==0&&switch3) {

            //play A

            guranoise = MediaPlayer.create(this, R.raw.guranoise1);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "A", Toast.LENGTH_SHORT).show();
            anim1.start();

        } else if (counter%19==0&&switch4) {

            //play Ehh

            guranoise = MediaPlayer.create(this, R.raw.guranoise2);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "Ehh", Toast.LENGTH_SHORT).show();
            set1.start();

        } else if (next < 0.7&&switch5) {

            //Play Ahh

            guranoise = MediaPlayer.create(this, R.raw.guranoise3);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "Ahh", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (next < .9&&switch6) {

            //play Ara Ara

            guranoise = MediaPlayer.create(this, R.raw.guranoise4);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "Ara Ara", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (counter%30==0&&switch7){

            //Play NOOOOOO

            guranoise = MediaPlayer.create(this, R.raw.guranoise5);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "NOOOOOO!", Toast.LENGTH_SHORT).show();
            set2.start();

        }else if (counter%15==0&&switch8){

            //play Hey that's pretty good

            guranoise = MediaPlayer.create(this, R.raw.guranoise6);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "Hey that's pretty good", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (counter%69==0&&switch9){

            //play lewd A

            guranoise = MediaPlayer.create(this, R.raw.guranoise7);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "Lewd 'A'", Toast.LENGTH_SHORT).show();
            anim1.start();

        }else if (counter%500==0&&switch10){

            //play Wake Up

            guranoise = MediaPlayer.create(this, R.raw.guranoise8);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "Wake Up", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (counter%7==0&&switch11){

            //play OK?

            guranoise = MediaPlayer.create(this, R.raw.guranoise9);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "OK?", Toast.LENGTH_SHORT).show();
            anim1.start();

        }else if (switch12){

            //play JA JANG

            guranoise = MediaPlayer.create(this, R.raw.guranoise10);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "JA JANG", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (switch3) {

            //play A

            guranoise = MediaPlayer.create(this, R.raw.guranoise1);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "A", Toast.LENGTH_SHORT).show();
            anim1.start();

        } else if (switch4) {

            //play Ehh

            guranoise = MediaPlayer.create(this, R.raw.guranoise2);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "Ehh", Toast.LENGTH_SHORT).show();
            set1.start();

        } else if (switch5) {

            //Play Ahh

            guranoise = MediaPlayer.create(this, R.raw.guranoise3);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "Ahh", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (switch6) {

            //play Ara Ara

            guranoise = MediaPlayer.create(this, R.raw.guranoise4);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "Ara Ara", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (switch7){

            //Play NOOOOOO

            guranoise = MediaPlayer.create(this, R.raw.guranoise5);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "NOOOOOO!", Toast.LENGTH_SHORT).show();
            set2.start();

        }else if (switch8){

            //play Hey that's pretty good

            guranoise = MediaPlayer.create(this, R.raw.guranoise6);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "Hey that's pretty good", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (switch9){

            //play lewd A

            guranoise = MediaPlayer.create(this, R.raw.guranoise7);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "Lewd 'A'", Toast.LENGTH_SHORT).show();
            anim1.start();

        }else if (switch10){

            //play Wake Up

            guranoise = MediaPlayer.create(this, R.raw.guranoise8);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "Wake Up", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (switch11){

            //play OK?

            guranoise = MediaPlayer.create(this, R.raw.guranoise9);
            guranoise.setOnCompletionListener(listener);
            guranoise.start();
            Toast.makeText(this, "OK?", Toast.LENGTH_SHORT).show();
            anim1.start();

        }
    }


    private void retrievedata(){
        sharedPreferences =getSharedPreferences("save2",MODE_PRIVATE);
        switch2= sharedPreferences.getBoolean("value2",true);


        sharedPreferences =getSharedPreferences("save3",MODE_PRIVATE);
        switch3= sharedPreferences.getBoolean("value3",true);


        sharedPreferences =getSharedPreferences("save4",MODE_PRIVATE);
        switch4= sharedPreferences.getBoolean("value4",true);


        sharedPreferences =getSharedPreferences("save5",MODE_PRIVATE);
        switch5= sharedPreferences.getBoolean("value5",true);


        sharedPreferences =getSharedPreferences("save6",MODE_PRIVATE);
        switch6= sharedPreferences.getBoolean("value6",true);


        sharedPreferences =getSharedPreferences("save7",MODE_PRIVATE);
        switch7= sharedPreferences.getBoolean("value7",true);


        sharedPreferences =getSharedPreferences("save8",MODE_PRIVATE);
        switch8= sharedPreferences.getBoolean("value8",true);


        sharedPreferences =getSharedPreferences("save9",MODE_PRIVATE);
        switch9= sharedPreferences.getBoolean("value9",true);


        sharedPreferences =getSharedPreferences("save10",MODE_PRIVATE);
        switch10= sharedPreferences.getBoolean("value10",true);


        sharedPreferences =getSharedPreferences("save11",MODE_PRIVATE);
        switch11= sharedPreferences.getBoolean("value11",true);


        sharedPreferences =getSharedPreferences("save12",MODE_PRIVATE);
        switch12= sharedPreferences.getBoolean("value12",true);


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