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

        fname = findViewById(R.id.pfname);
        lname = findViewById(R.id.plname);
        grade = findViewById(R.id.Grade);
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

        Bundle intent = getIntent().getExtras();
        if (intent != null) {
            String  mfname = intent.getString("firstname");
            String mlname = intent.getString("lastname");
            String mgrade = intent.getString("grade");
            String myclass = intent.getString("yclass");
            String myear = intent.getString("yearlead");
            actionBar.setTitle(mfname+" "+mlname);

            fname.setText(mfname);
            lname.setText(mlname);
            grade.setText(mgrade);
            fclass.setText(myclass);
            yeardate.setText(myear);

        }else{
            //
        }



    }
}