package com.yuzumin.guranoises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HiddenPersonalArchiveAdder extends AppCompatActivity {

    HiddenPersonalArchiveHandler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hidden_personal_archive_adder);
        getSupportActionBar().hide();

        handler=new HiddenPersonalArchiveHandler(this);


    }
}