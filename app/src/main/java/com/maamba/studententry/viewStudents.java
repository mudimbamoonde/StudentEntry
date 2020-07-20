package com.maamba.studententry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class viewStudents extends AppCompatActivity {
   DatabaseHelper helper;
   ListView view;
    ArrayAdapter adapter;
    RecyclerView listRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_students);

        helper = new DatabaseHelper(this);
//        view = findViewById(R.id.listView);
        listRecycler = findViewById(R.id.listRecycler);

        List<StudentModel> allStudents = helper.getStudents();

        adapter = new ArrayAdapter<StudentModel>(viewStudents.this,android.R.layout.simple_list_item_1,allStudents);
        view.setAdapter(adapter);

    }

}