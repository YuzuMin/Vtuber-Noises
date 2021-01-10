package com.yuzumin.pekoranoises;

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

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Count.CountListener{
    ImageView image;
    TextView textCount;

    MediaPlayer polkanoise;
    MediaPlayer.OnCompletionListener listener;

    ObjectAnimator anim1, anim2, anim3;
    AnimatorSet set1, set2;
    

    Count count;
    SharedPreferences sp;

    @Override
    public void OnUpdated(int count) {
        sp.edit().putInt("count", count).apply();
        textCount.setText(String.format("Count: %d", count));
        retrievedata();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().hide();
        retrievedata();


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

                sharedPreferences2=getSharedPreferences("save2",MODE_PRIVATE);
                switch2=sharedPreferences2.getBoolean("value2",true);
                if(switch2){
                    editor2 =getSharedPreferences("save2",MODE_PRIVATE).edit();
                    editor2.putBoolean("value2",true);
                    editor2.apply();
                }else{
                    editor2 =getSharedPreferences("save2",MODE_PRIVATE).edit();
                    editor2.putBoolean("value2",false);
                    editor2.apply();
                }

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
        if(polkanoise!=null) {
            if(polkanoise.isPlaying())
                polkanoise.stop();
            polkanoise.release();
            polkanoise = null;
        }
    }

    private void startRandomSound() {
        int num=(int)(Math.random()*((13-1)))+1;
        cleanupMediaPlayer();
        System.out.println(num);
        if (num==1&&switch3) {

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise1);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "She'll take care of it for you, Shishiro Botan!", Toast.LENGTH_SHORT).show();
            set1.start();

        } else if (num==2&&switch4) {

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise2);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Hyah!", Toast.LENGTH_SHORT).show();
            anim1.start();

        } else if (num==3&&switch5) {

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise3);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Don't touch me there!", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (num==4&&switch6) {

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise4);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Aha! Having my head patted feels really good!", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (num==5&&switch7){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise5);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Polka Oruka?", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (num==6&&switch8){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise6);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Polka Oruyo!", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (num==7&&switch9){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise7);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Wakata?", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (num==8&&switch10){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise8);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Pol!", Toast.LENGTH_SHORT).show();
            anim1.start();

        }else if (num==9&&switch11){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise9);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Po Pi Po", Toast.LENGTH_SHORT).show();
            set2.start();

        }else if (num==10&&switch12){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise10);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Padoru", Toast.LENGTH_SHORT).show();
            set2.start();

        }else if (num==11&&switch13){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise11);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Selamat Pagi", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (num==12&&switch14){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise12);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Mmmm, Pa!", Toast.LENGTH_SHORT).show();
            set2.start();

        }else if (switch15){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise13);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Unidentified sound", Toast.LENGTH_SHORT).show();
            set1.start();

        }if (switch3) {

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise1);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "She'll take care of it for you, Shishiro Botan!", Toast.LENGTH_SHORT).show();
            set1.start();

        } else if (switch4) {

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise2);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Hyah!", Toast.LENGTH_SHORT).show();
            anim1.start();

        } else if (switch5) {

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise3);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Don't touch me there!", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (switch6) {

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise4);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Aha! Having my head patted feels really good!", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (switch7){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise5);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Polka Oruka?", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (switch8){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise6);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Polka Oruyo!", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (switch9){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise7);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Wakata?", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (switch10){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise8);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Pol!", Toast.LENGTH_SHORT).show();
            anim1.start();

        }else if (switch11){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise9);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Po Pi Po", Toast.LENGTH_SHORT).show();
            set2.start();

        }else if (switch12){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise10);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Padoru", Toast.LENGTH_SHORT).show();
            set2.start();

        }else if (switch13){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise11);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Selamat Pagi", Toast.LENGTH_SHORT).show();
            set1.start();

        }else if (switch14){

            polkanoise = MediaPlayer.create(this, R.raw.polkanoise12);
            polkanoise.setOnCompletionListener(listener);
            polkanoise.start();
            Toast.makeText(this, "Mmmm, Pa!", Toast.LENGTH_SHORT).show();
            set2.start();

        }
    }


    private void retrievedata(){
        sharedPreferences2=getSharedPreferences("save2",MODE_PRIVATE);
        switch2=sharedPreferences2.getBoolean("value2",true);
        if(switch2){
            editor2 =getSharedPreferences("save2",MODE_PRIVATE).edit();
            editor2.putBoolean("value2",true);
            editor2.apply();
        }else{
            editor2 =getSharedPreferences("save2",MODE_PRIVATE).edit();
            editor2.putBoolean("value2",false);
            editor2.apply();
        }

        sharedPreferences2=getSharedPreferences("save3",MODE_PRIVATE);
        switch3=sharedPreferences2.getBoolean("value3",true);
        if(switch3){
            editor2 =getSharedPreferences("save3",MODE_PRIVATE).edit();
            editor2.putBoolean("value3",true);
            editor2.apply();
        }else{
            editor2 =getSharedPreferences("save3",MODE_PRIVATE).edit();
            editor2.putBoolean("value3",false);
            editor2.apply();
        }

        sharedPreferences2=getSharedPreferences("save4",MODE_PRIVATE);
        switch4=sharedPreferences2.getBoolean("value4",true);
        if(switch4){
            editor2 =getSharedPreferences("save4",MODE_PRIVATE).edit();
            editor2.putBoolean("value4",true);
            editor2.apply();
        }else{
            editor2 =getSharedPreferences("save4",MODE_PRIVATE).edit();
            editor2.putBoolean("value4",false);
            editor2.apply();
        }

        sharedPreferences2=getSharedPreferences("save5",MODE_PRIVATE);
        switch5=sharedPreferences2.getBoolean("value5",true);
        if(switch5){
            editor2 =getSharedPreferences("save5",MODE_PRIVATE).edit();
            editor2.putBoolean("value5",true);
            editor2.apply();
        }else{
            editor2 =getSharedPreferences("save5",MODE_PRIVATE).edit();
            editor2.putBoolean("value5",false);
            editor2.apply();
        }

        sharedPreferences2=getSharedPreferences("save6",MODE_PRIVATE);
        switch6=sharedPreferences2.getBoolean("value6",true);
        if(switch6){
            editor2 =getSharedPreferences("save6",MODE_PRIVATE).edit();
            editor2.putBoolean("value6",true);
            editor2.apply();
        }else{
            editor2 =getSharedPreferences("save6",MODE_PRIVATE).edit();
            editor2.putBoolean("value6",false);
            editor2.apply();
        }

        sharedPreferences2=getSharedPreferences("save7",MODE_PRIVATE);
        switch7=sharedPreferences2.getBoolean("value7",true);
        if(switch7){
            editor2 =getSharedPreferences("save7",MODE_PRIVATE).edit();
            editor2.putBoolean("value7",true);
            editor2.apply();
        }else{
            editor2 =getSharedPreferences("save7",MODE_PRIVATE).edit();
            editor2.putBoolean("value7",false);
            editor2.apply();
        }


        sharedPreferences2=getSharedPreferences("save8",MODE_PRIVATE);
        switch8=sharedPreferences2.getBoolean("value8",true);
        if(switch8){
            editor2 =getSharedPreferences("save8",MODE_PRIVATE).edit();
            editor2.putBoolean("value8",true);
            editor2.apply();
        }else{
            editor2 =getSharedPreferences("save8",MODE_PRIVATE).edit();
            editor2.putBoolean("value8",false);
            editor2.apply();
        }

        sharedPreferences2=getSharedPreferences("save9",MODE_PRIVATE);
        switch9=sharedPreferences2.getBoolean("value9",true);
        if(switch9){
            editor2 =getSharedPreferences("save9",MODE_PRIVATE).edit();
            editor2.putBoolean("value9",true);
            editor2.apply();
        }else{
            editor2 =getSharedPreferences("save9",MODE_PRIVATE).edit();
            editor2.putBoolean("value9",false);
            editor2.apply();
        }

        sharedPreferences2=getSharedPreferences("save10",MODE_PRIVATE);
        switch10=sharedPreferences2.getBoolean("value10",true);
        if(switch10){
            editor2 =getSharedPreferences("save10",MODE_PRIVATE).edit();
            editor2.putBoolean("value10",true);
            editor2.apply();
        }else{
            editor2 =getSharedPreferences("save10",MODE_PRIVATE).edit();
            editor2.putBoolean("value10",false);
            editor2.apply();
        }

        sharedPreferences2=getSharedPreferences("save11",MODE_PRIVATE);
        switch11=sharedPreferences2.getBoolean("value11",true);
        if(switch11){
            editor2 =getSharedPreferences("save11",MODE_PRIVATE).edit();
            editor2.putBoolean("value11",true);
            editor2.apply();
        }else{
            editor2 =getSharedPreferences("save11",MODE_PRIVATE).edit();
            editor2.putBoolean("value11",false);
            editor2.apply();
        }

        sharedPreferences2=getSharedPreferences("save12",MODE_PRIVATE);
        switch12=sharedPreferences2.getBoolean("value12",true);
        if(switch12){
            editor2 =getSharedPreferences("save12",MODE_PRIVATE).edit();
            editor2.putBoolean("value12",true);
            editor2.apply();
        }else{
            editor2 =getSharedPreferences("save12",MODE_PRIVATE).edit();
            editor2.putBoolean("value12",false);
            editor2.apply();
        }

        sharedPreferences2=getSharedPreferences("save13",MODE_PRIVATE);
        switch13=sharedPreferences2.getBoolean("value13",true);
        if(switch13){
            editor2 =getSharedPreferences("save13",MODE_PRIVATE).edit();
            editor2.putBoolean("value13",true);
            editor2.apply();
        }else{
            editor2 =getSharedPreferences("save13",MODE_PRIVATE).edit();
            editor2.putBoolean("value13",false);
            editor2.apply();
        }

        sharedPreferences2=getSharedPreferences("save14",MODE_PRIVATE);
        switch14=sharedPreferences2.getBoolean("value14",true);
        if(switch14){
            editor2 =getSharedPreferences("save14",MODE_PRIVATE).edit();
            editor2.putBoolean("value14",true);
            editor2.apply();
        }else{
            editor2 =getSharedPreferences("save14",MODE_PRIVATE).edit();
            editor2.putBoolean("value14",false);
            editor2.apply();
        }

        sharedPreferences2=getSharedPreferences("save15",MODE_PRIVATE);
        switch15=sharedPreferences2.getBoolean("value15",true);
        if(switch15){
            editor2 =getSharedPreferences("save15",MODE_PRIVATE).edit();
            editor2.putBoolean("value15",true);
            editor2.apply();
        }else{
            editor2 =getSharedPreferences("save15",MODE_PRIVATE).edit();
            editor2.putBoolean("value15",false);
            editor2.apply();
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

}