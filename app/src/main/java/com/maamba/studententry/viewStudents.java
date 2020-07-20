package com.maamba.studententry;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.maamba.studententry.recyclerview.myAdapter;

import java.util.ArrayList;
import java.util.List;

public class viewStudents extends AppCompatActivity {
   DatabaseHelper helper;
   ListView view;

    RecyclerView listRecycler;
    myAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_students);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("View Students");

        helper = new DatabaseHelper(this);
//        view = findViewById(R.id.listView);
        listRecycler = findViewById(R.id.listRecycler);
        listRecycler.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<StudentModel> allStudents = helper.getStudents();
        adapter = new myAdapter(this,allStudents);
        listRecycler.setAdapter(adapter);

//        adapter = new ArrayAdapter<StudentModel>(viewStudents.this,android.R.layout.simple_list_item_1,allStudents);
//        view.setAdapter(adapter);



    }

}