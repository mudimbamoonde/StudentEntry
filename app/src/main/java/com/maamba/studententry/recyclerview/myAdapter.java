package com.maamba.studententry.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.maamba.studententry.DetailedStudent;
import com.maamba.studententry.R;
import com.maamba.studententry.StudentModel;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<MyHolder> {
    Context context;
    ArrayList<StudentModel> model;

    public myAdapter(Context context, ArrayList<StudentModel> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rows,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        String fullName = model.get(position).getFirstName() +" "+ model.get(position).getLastName();
        holder.studentName.setText(fullName);
        holder.yearDate.setText(model.get(position).getYearOfEntry());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                String fname = model.get(position).getFirstName();
                String lname = model.get(position).getLastName();
                String grade = model.get(position).getGrade();
                String yclass = model.get(position).getStudentClass();
                String yearLead = model.get(position).getYearOfEntry();

                Intent detailed = new Intent(context, DetailedStudent.class);

                detailed.putExtra("firstname",fname);
                detailed.putExtra("lastname",lname);
                detailed.putExtra("grade",grade);
                detailed.putExtra("yclass",yclass);
                detailed.putExtra("yearlead",yearLead);

                context.startActivity(detailed);

            }
        });
    }

    @Override
    public int getItemCount() {
        return model.size();
    }
}
