package com.example.user.billardtrainningapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by user on 2017-02-08.
 */

public class DB_Adapter{

    private static final String DATABASE_NAME = "jaehakiDB";
    private static final String DATABASE_TABLE = "TB_JAE";
    private static final int DATABASE_VERSION = 1;
    private final Context mCtx;

    private DatabaseHelper mDbHelper;
    private SQLiteDatabase mDb;

    //생성테이블
    private static final String DATABASE_CREATE="CREATE TABLE " +DATABASE_TABLE+ "" +
                " (    ID    INTEGER PRIMARY    KEY AUTOINCREMENT, TIP INTEGER,   PHONE TEXT,    ADDR TEXT,    NAME TEXT)";

        //테이블  드랍

    public static class DatabaseHelper extends SQLiteOpenHelper {

        DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            //데이터베이스 최초 생성될때 실행 디비가 생성될때 실행된다
            Log.d("TEST","onCreate DATABSE_CREATE");
            db.execSQL(DATABASE_CREATE);
        }

        @Override
        //데이터베이스가 업그레이드가 필요할때
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // db.execSQL( SQL_DELETE_TABLE);
        }

    }

    //
    public void open() throws SQLException {
        mDbHelper = new DatabaseHelper(mCtx);
/*
    DB가 없다면 onCreate가 호출 후 생성, version이 바뀌었다면 onUpgrade 메소드 호출
    mDb = mDbHelper.getWritableDatabase();
*/
        // 권한부여 읽고 쓰기를 위해
        mDb = mDbHelper.getWritableDatabase();
        Log.d("TEST","open");
    }

    public DB_Adapter(Context ctx) {
            this.mCtx = ctx;
    }

    //닫기
    public void close() {
        mDbHelper.close();
    }


    //넣기
    public long insert(int thick,  int tip, float RedX, float RedY,float YellowX, float YellowY ) {
        ContentValues insertValues = new ContentValues();
        Log.d("TEST","THICK");
        Log.d("TEST","TIP");

        insertValues.put("THICK", thick);
        insertValues.put("TIP", tip);
        insertValues.put("REDX", RedX);
        insertValues.put("REDY", RedY);
        insertValues.put("REDX", YellowX);
        insertValues.put("REDY", YellowY);
        Log.d("TEST","insert suc");
        return mDb.insert(DATABASE_TABLE, null, insertValues);
    }
    //업데이트~
    public long update(int thick, int tip, float RedX, float RedY,float YellowX, float YellowY) {
        ContentValues updateValues = new ContentValues();

        updateValues.put("THICK", thick);
        updateValues.put("TIP", tip);
        updateValues.put("REDX", RedX);
        updateValues.put("REDY", RedY);
        updateValues.put("REDX", YellowX);
        updateValues.put("REDY", YellowY);

        String id=null;
        return mDb.update(DATABASE_TABLE, updateValues, "ID" + "=?", new String[]{id});
    }

    //한개씩삭제
    public boolean deleteRow(String id) {
        return mDb.delete(DATABASE_TABLE, "ID" + "=?", new String[]{id}) > 0;

    }

    //다삭제
    public boolean deleteAll() {
        return mDb.delete(DATABASE_TABLE, null, null) > 0;
    }

    public Cursor AllRows() {
        return mDb.query(DATABASE_TABLE, null, null, null, null, null, null);

    }


}

