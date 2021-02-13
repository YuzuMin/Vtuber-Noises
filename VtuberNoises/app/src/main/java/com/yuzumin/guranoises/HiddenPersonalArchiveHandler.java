package com.yuzumin.guranoises;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class HiddenPersonalArchiveHandler extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="HiddenArchive.db";
    private static final int SCHEMA_VERSION=1;

    public HiddenPersonalArchiveHandler(Context context) { super(context,DATABASE_NAME,null,SCHEMA_VERSION); }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE archive_table(Numbers TEXT);");
    }

    public void deleterow(String numbers) {
        SQLiteDatabase db =this.getWritableDatabase();
        db.execSQL("DELETE FROM archive_table WHERE Numbers='"+numbers+"'");
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public Cursor getByNumber(String id){
        String[] args ={id};

        return (getReadableDatabase().rawQuery(
                "SELECT Numbers FROM archive_table WHERE Numbers=?",args));

    }


    public Cursor getALL(){
        return(getReadableDatabase().rawQuery(
                "SELECT Numbers FROM archive_table ORDER BY Numbers",null));
    }

    public void insert(String numbers){
        ContentValues cv=new ContentValues();

        cv.put("Numbers",numbers);

        getWritableDatabase().insert("archive_table","Numbers",cv);
    }


    public String getNumber(Cursor c){
        return(c.getString(0));
    }

}
