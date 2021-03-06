package com.maamba.studententry;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button addStudent,viewStudent,deleteStudent,close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Mudimba Academy");


        deleteStudent = findViewById(R.id.deleteStudent);

        addStudent  = findViewById(R.id.addStudent);
        viewStudent  = findViewById(R.id.viewStudent);
        close  = findViewById(R.id.close);

        addStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add_learner = new Intent(MainActivity.this,AddLearner.class);
                startActivity(add_learner);
            }
        });

        viewStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewSt = new Intent(MainActivity.this,viewStudents.class);
                startActivity(viewSt);
            }
        });


        deleteStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent remov = new Intent(MainActivity.this,removeStudent.class);
                startActivity(remov);
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

    }

}