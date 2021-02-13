package com.yuzumin.guranoises;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class HiddenPersonalArchive extends AppCompatActivity {

    ImageView backBTN;
    ImageView addBTN;

    Cursor model=null;
    HiddenPersonalArchiveHandler handler=null;

    ListView ArchiveList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hidden_personal_archive);
        getSupportActionBar().hide();

        handler=new HiddenPersonalArchiveHandler(this);

        ArchiveList=findViewById(R.id.ArchiveList);


        backBTN=findViewById(R.id.back_btn);
        backBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        addBTN=findViewById(R.id.add_btn);
        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }


    @Override
    protected void onResume() {
        super.onResume();

    }



}