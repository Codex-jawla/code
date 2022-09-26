package com.example.collagelibrary;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbhelper extends SQLiteOpenHelper {

    public static final String DataBase_Name="Library";
    public static final String Table_Name1="USER_DETAILS";
    public static final String Table_Name2="Book_Details";

    public dbhelper(@Nullable Context context) {
        super(context, DataBase_Name, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqlDb) {
        sqlDb.execSQL("create table "+Table_Name1+"(username TEXT PRIMARY KEY, password TEXT )");
        sqlDb.execSQL("create table "+Table_Name2+"(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,PUBLISHER TEXT,EDITION TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqlDb, int i, int i1) {
        sqlDb.execSQL("drop table if exists users ");

    }

    public boolean insertData(String username,String password){
        SQLiteDatabase Db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("username",username);
        values.put("password",password);
        long result=Db.insert(Table_Name1,null,values);
        if (result==-1)return false;
        else return true;
    }

    public boolean checkUsername(String username){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery(" select * from users where username=?",new String[]{username});
        if(cursor.getCount()>0)return true;
        else return false;
    }

    public boolean checkUsernamePassword(String username, String password){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery(" select * from users where username=? and password=?",new String[]{username,password});
        if(cursor.getCount()>0)return true;
        else return false;
    }
}
