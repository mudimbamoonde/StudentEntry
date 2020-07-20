package com.maamba.studententry.RemoveStudent;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.maamba.studententry.DatabaseHelper;
import com.maamba.studententry.DetailedStudent;
import com.maamba.studententry.R;
import com.maamba.studententry.StudentModel;

import java.util.ArrayList;

public class DeleteAdapter extends RecyclerView.Adapter<DeleteHolder> {
    Context context;
    ArrayList<StudentModel> model;

    public DeleteAdapter(Context context, ArrayList<StudentModel> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public DeleteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.remove,parent,false);
        return new DeleteHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final DeleteHolder holder, final int position) {
        String fullName = model.get(position).getFirstName() +" "+ model.get(position).getLastName();
        holder.studentName.setText(fullName);
        holder.yearDate.setText(model.get(position).getYearOfEntry());

        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatabaseHelper helper = new DatabaseHelper(context);
                StudentModel clickedStudent =  model.get(position);
                helper.deleteStudent(clickedStudent);
                Toast.makeText(context,"Successfully Deleted! Refresh Page",Toast.LENGTH_SHORT).show();
            }

        });
    }

    @Override
    public int getItemCount() {
        return model.size();
    }
}
