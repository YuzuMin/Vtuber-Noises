package com.yuzumin.guranoises;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableRow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class CharacterSettings extends AppCompatActivity {

    TableRow GuraIMGRow;
    TableRow GuraIMG2Row;
    RadioGroup CharaTypes;

    RadioButton GuraIMG;
    RadioButton GuraIMG2;

    CardView SaveButton;
    CardView ResetButton;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Integer charavalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_settings);
        getSupportActionBar().hide();



        CharaTypes=findViewById(R.id.character_types);


        GuraIMG=findViewById(R.id.gura_img);
        GuraIMGRow =findViewById(R.id.gura_img_row);
        GuraIMG2 =findViewById(R.id.gura2_img);
        GuraIMG2Row=findViewById(R.id.gura2_img_row);

        retrievedata();

        GuraIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GuraIMG.setChecked(true);
                GuraIMG2.setChecked(false);
                charavalue=0;
            }
        });
        GuraIMGRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GuraIMG.setChecked(true);
                GuraIMG2.setChecked(false);
                charavalue=0;
            }
        });
        GuraIMG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GuraIMG.setChecked(false);
                GuraIMG2.setChecked(true);
                charavalue=1;
            }
        });
        GuraIMG2Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GuraIMG.setChecked(false);
                GuraIMG2.setChecked(true);
                charavalue=1;
            }
        });

        SaveButton=findViewById(R.id.buttonS);
        SaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                editor.putInt("CharaValue",charavalue);
                editor.apply();
                finish();
            }
        });
        SaveButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    SaveButton.setCardBackgroundColor(getResources().getColor(R.color.button));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    SaveButton.setCardBackgroundColor(getResources().getColor(R.color.clearbutton));
                }
                return false;
            }
        });

        ResetButton=findViewById(R.id.buttonR);
        ResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GuraIMG.setChecked(true);
                GuraIMG2.setChecked(false);
            }
        });
        ResetButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    ResetButton.setCardBackgroundColor(getResources().getColor(R.color.button));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    ResetButton.setCardBackgroundColor(getResources().getColor(R.color.clearbutton));
                }
                return false;
            }
        });



    }

    private void retrievedata(){
        sharedPreferences=getSharedPreferences("Chara",MODE_PRIVATE);
        charavalue=sharedPreferences.getInt("CharaValue",0);

        if(charavalue==0){
            GuraIMG.setChecked(true);
            GuraIMG2.setChecked(false);
        }else if(charavalue==1){
            GuraIMG.setChecked(false);
            GuraIMG2.setChecked(true);
        }
    }




}