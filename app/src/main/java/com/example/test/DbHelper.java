package com.example.test;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper
{
    public static String DATABASE_NAME = "Customers.db";
    public static String TABLE_NAME = "Login";
    public static String TABLE_NAME_2 = "Bill";
    public static String TABLE_NAME_3 = "Complaints";
    public static String COL_1 = "ID";
    public static String COL_2 = "Username";
    public static String COL_3 = "Password";
    public static String COL_4 = "MobileNumber";
    public static String COL_5 = "EmailID";
    public static String COL_3_TABLE_2 = "Units";
    public static String COL_4_TABLE_2 = "Amount";
    public static String COL_5_TABLE_2 = "Status";
    public static String COL_3_TABLE_3 = "Complaint";
    public static String COL_4_TABLE_3 = "Status";
    public DbHelper(@Nullable Context context)
    {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE "+ TABLE_NAME +" ("+COL_1+" INTEGER PRIMARY KEY AUTOINCREMENT, "+COL_2+" TEXT, "+COL_3+" TEXT, "+COL_4+" TEXT, "+COL_5+" TEXT);");
        db.execSQL("CREATE TABLE "+ TABLE_NAME_2 +" ("+COL_1+" INTEGER PRIMARY KEY AUTOINCREMENT, "+COL_2+" TEXT, "+COL_3_TABLE_2+" INTEGER, "+COL_4_TABLE_2+" INTEGER, "+COL_5_TABLE_2+" TEXT);");
        db.execSQL("CREATE TABLE "+ TABLE_NAME_3 +" ("+COL_1+" INTEGER PRIMARY KEY AUTOINCREMENT, "+COL_2+" TEXT, "+COL_3_TABLE_3+" TEXT, "+COL_4_TABLE_3+" TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME_2);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME_3);
        onCreate(db);
    }

    public boolean insertData(String username, String password, String mn, String email)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,username);
        contentValues.put(COL_3,password);
        contentValues.put(COL_4,mn);
        contentValues.put(COL_5,email);
        long result = db.insert(TABLE_NAME,null,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

   /* public boolean checkUser(String username)
    {

    }*/

    public boolean insertData2(String username, int units, int amount, String status)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,username);
        contentValues.put(COL_3_TABLE_2,units);
        contentValues.put(COL_4_TABLE_2,amount);
        contentValues.put(COL_5_TABLE_2,status);
        long result = db.insert(TABLE_NAME_2,null,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public boolean insertData3(String username, String complaint, String status)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,username);
        contentValues.put(COL_3_TABLE_3,complaint);
        contentValues.put(COL_4_TABLE_3,status);
        long result = db.insert(TABLE_NAME_3,null,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM "+TABLE_NAME, null);
        return res;
    }

    public Cursor getAllData2()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM "+TABLE_NAME_2, null);
        return res;
    }

    public boolean updateData2(int id,String username, int units, int amount, String status)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,username);
        contentValues.put(COL_3_TABLE_2,units);
        contentValues.put(COL_4_TABLE_2,amount);
        contentValues.put(COL_5_TABLE_2,status);
        db.update(TABLE_NAME_2, contentValues, "Username = ?", new String[] {username});
        return true;
    }

    public Cursor getAllData3()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM "+TABLE_NAME_3, null);
        return res;
    }
}