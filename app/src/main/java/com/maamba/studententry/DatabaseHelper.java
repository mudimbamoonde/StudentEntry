package com.maamba.studententry;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String TABLENAME = "STUDENT";
    public static final String STUDENTID = "STUDENTID";
    public static final String FIRSTNAME = "FIRSTNAME";
    public static final String LASTNAME = "LASTNAME";
    public static final String GRADE = "GRADE";
    public static final String CLASS = "CLASS";
    public static final String YEAROFENTRY = "YEAROFENTRY";

    public DatabaseHelper(@Nullable Context context) {
        super(context, "studentDB.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlstatement = "CREATE TABLE " + TABLENAME + "(" + STUDENTID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                FIRSTNAME + " text," +
                LASTNAME + " text," +
                GRADE + " text," +
                CLASS + " text," +
                YEAROFENTRY + " text)";
        db.execSQL(sqlstatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String drop = "DROP TABLE IF EXISTS "+TABLENAME;
        db.execSQL(drop);
    }

    public boolean addStudent(StudentModel sm){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(FIRSTNAME,sm.getFirstName());
        cv.put(LASTNAME,sm.getLastName());
        cv.put(GRADE,sm.getGrade());
        cv.put(CLASS,sm.getStudentClass());
        cv.put(YEAROFENTRY,sm.getYearOfEntry());

        long succ = db.insert(TABLENAME,null,cv);
        if (succ==-1){
            return false;
        }else{
            return true;
        }
    }

    public ArrayList<StudentModel> getStudents(){
        ArrayList<StudentModel> model = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        String stmt = "SELECT*FROM " + TABLENAME;

        Cursor cursor = db.rawQuery(stmt,null);
        if (cursor.moveToFirst()){
            do {
                int studentID = cursor.getInt(0);
                String fname = cursor.getString(1);
                String lname = cursor.getString(2);
                String grade = cursor.getString(3);
                String sClass = cursor.getString(4);
                String ydate = cursor.getString(5);

                StudentModel viewStudent = new StudentModel(studentID,fname,lname,grade,sClass,ydate);
                model.add(viewStudent);

            }while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return model;
    }

    public boolean deletStudent(StudentModel model){

        SQLiteDatabase db = this.
    }

}
