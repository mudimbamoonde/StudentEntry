package com.maamba.studententry;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailedStudent extends AppCompatActivity {
    TextView fname,lname,grade,fclass,yeardate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_student);

        ActionBar actionBar = getSupportActionBar();

        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        grade = findViewById(R.id.grade);
        fclass = findViewById(R.id.xclass);
        yeardate = findViewById(R.id.ydatetime);

//*
//    detailed.putExtra("firstname",fname);
//                detailed.putExtra("lastname",lname);
//                detailed.putExtra("grade",grade);
//                detailed.putExtra("yclass",yclass);
//                detailed.putExtra("yearlead",yearLead);
//
// */

        Intent intent = getIntent();
        String mfname = intent.getStringExtra("fname");
        String mlname = intent.getStringExtra("lname");
        String mgrade = intent.getStringExtra("grade");
        String myclass = intent.getStringExtra("yclass");
        String myear = intent.getStringExtra("yearlead");

        actionBar.setTitle(mfname+" "+mlname);

        fname.setText(mfname);
        lname.setText(mlname);
        grade.setText(mgrade);
        fclass.setText(myclass);
        yeardate.setText(myear);

    }
}