package com.maamba.studententry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button addStudent,viewStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        addStudent  = findViewById(R.id.addStudent);
        viewStudent  = findViewById(R.id.viewStudent);

        addStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add_learner = new Intent(MainActivity.this,AddLearner.class);
                startActivity(add_learner);
            }
        });

    }

}