package com.maamba.studententry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class AddLearner extends AppCompatActivity {
    ImageView addStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_learner);

        addStudent = findViewById(R.id.addStudent);

        addStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AddLearner.this, "Hello", Toast.LENGTH_SHORT).show();
            }
        });
    }
}