package com.yuzumin.guranoises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

public class Settings extends AppCompatActivity {

    Switch switch2;
    Switch switch3;
    Switch switch4;
    Switch switch5;
    Switch switch6;
    Switch switch7;
    Switch switch8;
    Switch switch9;
    Switch switch10;
    Switch switch11;
    Switch switch12;

    Button button1;
    Button button2;

    SharedPreferences sharedPreferences2;
    SharedPreferences.Editor editor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);


        // for switch 2 to activate
        switch2=findViewById(R.id.switch2);
        sharedPreferences2 =getSharedPreferences("save2",MODE_PRIVATE);
        switch2.setChecked(sharedPreferences2.getBoolean("value2",true));
        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch2.isChecked()){
                    editor2 =getSharedPreferences("save2",MODE_PRIVATE).edit();
                    editor2.putBoolean("value2",true);
                    editor2.apply();
                    switch2.setChecked(true);
                }else{
                    editor2 =getSharedPreferences("save2",MODE_PRIVATE).edit();
                    editor2.putBoolean("value2",false);
                    editor2.apply();
                    switch2.setChecked(false);
                }
            }
        });

        // for switch 3 to activate
        switch3=findViewById(R.id.switch3);
        sharedPreferences2 =getSharedPreferences("save3",MODE_PRIVATE);
        switch3.setChecked(sharedPreferences2.getBoolean("value3",true));
        switch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch3.isChecked()){
                    editor2 =getSharedPreferences("save3",MODE_PRIVATE).edit();
                    editor2.putBoolean("value3",true);
                    editor2.apply();
                    switch3.setChecked(true);
                }else{
                    editor2 =getSharedPreferences("save3",MODE_PRIVATE).edit();
                    editor2.putBoolean("value3",false);
                    editor2.apply();
                    switch3.setChecked(false);
                }
            }
        });

        // for switch 4 to activate
        switch4=findViewById(R.id.switch4);
        sharedPreferences2 =getSharedPreferences("save4",MODE_PRIVATE);
        switch4.setChecked(sharedPreferences2.getBoolean("value4",true));
        switch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch4.isChecked()){
                    editor2 =getSharedPreferences("save4",MODE_PRIVATE).edit();
                    editor2.putBoolean("value4",true);
                    editor2.apply();
                    switch4.setChecked(true);
                }else{
                    editor2 =getSharedPreferences("save4",MODE_PRIVATE).edit();
                    editor2.putBoolean("value4",false);
                    editor2.apply();
                    switch4.setChecked(false);
                }
            }
        });

        // for switch 5 to activate
        switch5=findViewById(R.id.switch5);
        sharedPreferences2 =getSharedPreferences("save5",MODE_PRIVATE);
        switch5.setChecked(sharedPreferences2.getBoolean("value5",true));
        switch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch5.isChecked()){
                    editor2 =getSharedPreferences("save5",MODE_PRIVATE).edit();
                    editor2.putBoolean("value5",true);
                    editor2.apply();
                    switch5.setChecked(true);
                }else{
                    editor2 =getSharedPreferences("save5",MODE_PRIVATE).edit();
                    editor2.putBoolean("value5",false);
                    editor2.apply();
                    switch5.setChecked(false);
                }
            }
        });

        // for switch 6 to activate
        switch6=findViewById(R.id.switch6);
        sharedPreferences2 =getSharedPreferences("save6",MODE_PRIVATE);
        switch6.setChecked(sharedPreferences2.getBoolean("value6",true));
        switch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch6.isChecked()){
                    editor2 =getSharedPreferences("save6",MODE_PRIVATE).edit();
                    editor2.putBoolean("value6",true);
                    editor2.apply();
                    switch6.setChecked(true);
                }else{
                    editor2 =getSharedPreferences("save6",MODE_PRIVATE).edit();
                    editor2.putBoolean("value6",false);
                    editor2.apply();
                    switch6.setChecked(false);
                }
            }
        });

        // for switch 7 to activate
        switch7=findViewById(R.id.switch7);
        sharedPreferences2 =getSharedPreferences("save7",MODE_PRIVATE);
        switch7.setChecked(sharedPreferences2.getBoolean("value7",true));
        switch7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch7.isChecked()){
                    editor2 =getSharedPreferences("save7",MODE_PRIVATE).edit();
                    editor2.putBoolean("value7",true);
                    editor2.apply();
                    switch7.setChecked(true);
                }else{
                    editor2 =getSharedPreferences("save7",MODE_PRIVATE).edit();
                    editor2.putBoolean("value7",false);
                    editor2.apply();
                    switch7.setChecked(false);
                }
            }
        });

        // for switch 8 to activate
        switch8=findViewById(R.id.switch8);
        sharedPreferences2 =getSharedPreferences("save8",MODE_PRIVATE);
        switch8.setChecked(sharedPreferences2.getBoolean("value8",true));
        switch8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch8.isChecked()){
                    editor2 =getSharedPreferences("save8",MODE_PRIVATE).edit();
                    editor2.putBoolean("value8",true);
                    editor2.apply();
                    switch8.setChecked(true);
                }else{
                    editor2 =getSharedPreferences("save8",MODE_PRIVATE).edit();
                    editor2.putBoolean("value8",false);
                    editor2.apply();
                    switch8.setChecked(false);
                }
            }
        });

        // for switch 9 to activate
        switch9=findViewById(R.id.switch9);
        sharedPreferences2 =getSharedPreferences("save9",MODE_PRIVATE);
        switch9.setChecked(sharedPreferences2.getBoolean("value9",true));
        switch9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch9.isChecked()){
                    editor2 =getSharedPreferences("save9",MODE_PRIVATE).edit();
                    editor2.putBoolean("value9",true);
                    editor2.apply();
                    switch9.setChecked(true);
                }else{
                    editor2 =getSharedPreferences("save9",MODE_PRIVATE).edit();
                    editor2.putBoolean("value9",false);
                    editor2.apply();
                    switch9.setChecked(false);
                }
            }
        });

        // for switch 10 to activate
        switch10=findViewById(R.id.switch10);
        sharedPreferences2 =getSharedPreferences("save10",MODE_PRIVATE);
        switch10.setChecked(sharedPreferences2.getBoolean("value10",true));
        switch10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch10.isChecked()){
                    editor2 =getSharedPreferences("save10",MODE_PRIVATE).edit();
                    editor2.putBoolean("value10",true);
                    editor2.apply();
                    switch10.setChecked(true);
                }else{
                    editor2 =getSharedPreferences("save10",MODE_PRIVATE).edit();
                    editor2.putBoolean("value10",false);
                    editor2.apply();
                    switch10.setChecked(false);
                }
            }
        });

        // for switch 11 to activate
        switch11=findViewById(R.id.switch11);
        sharedPreferences2 =getSharedPreferences("save11",MODE_PRIVATE);
        switch11.setChecked(sharedPreferences2.getBoolean("value11",true));
        switch11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch11.isChecked()){
                    editor2 =getSharedPreferences("save11",MODE_PRIVATE).edit();
                    editor2.putBoolean("value11",true);
                    editor2.apply();
                    switch11.setChecked(true);
                }else{
                    editor2 =getSharedPreferences("save11",MODE_PRIVATE).edit();
                    editor2.putBoolean("value11",false);
                    editor2.apply();
                    switch11.setChecked(false);
                }
            }
        });

        // for switch 12 to activate
        switch12=findViewById(R.id.switch12);
        sharedPreferences2 =getSharedPreferences("save12",MODE_PRIVATE);
        switch12.setChecked(sharedPreferences2.getBoolean("value12",true));
        switch12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch12.isChecked()){
                    editor2 =getSharedPreferences("save12",MODE_PRIVATE).edit();
                    editor2.putBoolean("value12",true);
                    editor2.apply();
                    switch12.setChecked(true);
                }else{
                    editor2 =getSharedPreferences("save12",MODE_PRIVATE).edit();
                    editor2.putBoolean("value12",false);
                    editor2.apply();
                    switch12.setChecked(false);
                }
            }
        });


        //Reset button
        button1=findViewById(R.id.buttonR);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //To set all switches to false state and its memory to false

                SharedPreferences.Editor editor2 =getSharedPreferences("save2",MODE_PRIVATE).edit();
                editor2.putBoolean("value2",false);
                editor2.apply();
                switch2.setChecked(false);

                SharedPreferences.Editor editor3 =getSharedPreferences("save3",MODE_PRIVATE).edit();
                editor3.putBoolean("value3",false);
                editor3.apply();
                switch3.setChecked(false);

                SharedPreferences.Editor editor4 =getSharedPreferences("save4",MODE_PRIVATE).edit();
                editor4.putBoolean("value4",false);
                editor4.apply();
                switch4.setChecked(false);

                SharedPreferences.Editor editor5 =getSharedPreferences("save5",MODE_PRIVATE).edit();
                editor5.putBoolean("value5",false);
                editor5.apply();
                switch5.setChecked(false);

                SharedPreferences.Editor editor6 =getSharedPreferences("save6",MODE_PRIVATE).edit();
                editor6.putBoolean("value6",false);
                editor6.apply();
                switch6.setChecked(false);

                SharedPreferences.Editor editor7 =getSharedPreferences("save7",MODE_PRIVATE).edit();
                editor7.putBoolean("value7",false);
                editor7.apply();
                switch7.setChecked(false);

                editor2 =getSharedPreferences("save8",MODE_PRIVATE).edit();
                editor2.putBoolean("value8",false);
                editor2.apply();
                switch8.setChecked(false);

                editor2 =getSharedPreferences("save9",MODE_PRIVATE).edit();
                editor2.putBoolean("value9",false);
                editor2.apply();
                switch9.setChecked(false);

                editor2 =getSharedPreferences("save10",MODE_PRIVATE).edit();
                editor2.putBoolean("value10",false);
                editor2.apply();
                switch10.setChecked(false);

                editor2 =getSharedPreferences("save11",MODE_PRIVATE).edit();
                editor2.putBoolean("value11",false);
                editor2.apply();
                switch11.setChecked(false);

                editor2 =getSharedPreferences("save12",MODE_PRIVATE).edit();
                editor2.putBoolean("value12",false);
                editor2.apply();
                switch12.setChecked(false);
            }
        });


        //Save button
        button2=findViewById(R.id.buttonS);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
}