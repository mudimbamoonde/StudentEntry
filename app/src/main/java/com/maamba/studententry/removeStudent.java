package com.maamba.studententry;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.maamba.studententry.RemoveStudent.DeleteAdapter;
import com.maamba.studententry.recyclerview.myAdapter;

import java.util.ArrayList;

public class removeStudent extends AppCompatActivity {
    Button removeLearner;
    DatabaseHelper helper;
    ListView view;

    RecyclerView removeRe;
    DeleteAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remove_student);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Remove Student");


        helper = new DatabaseHelper(this);
//        view = findViewById(R.id.listView);
        removeRe = findViewById(R.id.removeRe);
        removeRe.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<StudentModel> allStudents = helper.getStudents();
        adapter = new DeleteAdapter(this,allStudents);
        removeRe.setAdapter(adapter);



    }
}