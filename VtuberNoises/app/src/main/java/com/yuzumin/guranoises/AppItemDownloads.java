package com.yuzumin.guranoises;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class AppItemDownloads extends AppCompatActivity {

    private static final int MY_PERMISSION_RQUEST_STORAGE=1;

    ImageView GuraIMG0;
    ImageView Gura0;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_item_downloads);
        getSupportActionBar().hide();;

        if(ContextCompat.checkSelfPermission(AppItemDownloads.this, Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(AppItemDownloads.this,Manifest.permission.WRITE_EXTERNAL_STORAGE)){
                ActivityCompat.requestPermissions(AppItemDownloads.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},MY_PERMISSION_RQUEST_STORAGE);
            }else{
                ActivityCompat.requestPermissions(AppItemDownloads.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},MY_PERMISSION_RQUEST_STORAGE);
            }
        }



        Gura0=findViewById(R.id.gura0);
        GuraIMG0=findViewById(R.id.gura_img);
        GuraIMG0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                copyAsset("gura0.png");

            }
        });
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,@NonNull int[] grantResults){
        switch (requestCode){
            case MY_PERMISSION_RQUEST_STORAGE:{
                if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    if(ContextCompat.checkSelfPermission(AppItemDownloads.this,Manifest.permission.WRITE_EXTERNAL_STORAGE)==PackageManager.PERMISSION_GRANTED){
                    }else{
                        Toast.makeText(AppItemDownloads.this,"NO PERMISSION GRANTED",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }
    }

    private void copyAsset(String filename){
        //String dirpath = Environment.getExternalStorageDirectory().getAbsolutePath()+"/GuraNoises/";
        String dirpath = mContext.getExternalFilesDir(null).getAbsolutePath();
        File dir =new File(dirpath);
        if(!dir.exists()){
            dir.mkdir();
        }
        AssetManager assetManager = getAssets();
        InputStream inputStream=null;
        OutputStream outputStream=null;
        try{
            inputStream=assetManager.open(filename);
            File outFile =new File(dirpath,filename);
            outputStream=new FileOutputStream(outFile);
            copyFile(inputStream,outputStream);
            Toast.makeText(AppItemDownloads.this,"SAVED",Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(AppItemDownloads.this,"Fail",Toast.LENGTH_SHORT).show();
        }finally {
            if(inputStream!=null){
                try{
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(outputStream!=null){
                try{
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    private void copyFile(InputStream in, OutputStream out) throws IOException{
        byte[] buffer =new byte[1024];
        int read;
        while((read=in.read(buffer))!=-1){
            out.write(buffer,0,read);
        }
    }

}