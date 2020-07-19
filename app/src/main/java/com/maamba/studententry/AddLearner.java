package com.maamba.studententry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class AddLearner extends AppCompatActivity {
    TextInputEditText fname,lname,grade,sClass;
    EditText ydate;
    Button btn_Save;
    DatabaseHelper helper;
    StudentModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_learner);

        helper = new DatabaseHelper(this);

        fname = findViewById(R.id.vfirstname);
        lname = findViewById(R.id.vlastname);
        grade = findViewById(R.id.vgrade);
        sClass = findViewById(R.id.vsClass);
        ydate = findViewById(R.id.ydate);

        btn_Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
//                    (int studentID, String firstName, String lastName, String grade, String studentClass, String yearOfEntry)
                    model = new StudentModel(-1,fname.getText().toString(),lname.getText().toString(),grade.getText().toString()
                            ,sClass.getText().toString(),ydate.getText().toString());
                    helper.addStudent(model);
                    Toast.makeText(AddLearner.this,"Success Inserted!",Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    Toast.makeText(AddLearner.this,"Failed to Insert: "+ e.getMessage(),Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}