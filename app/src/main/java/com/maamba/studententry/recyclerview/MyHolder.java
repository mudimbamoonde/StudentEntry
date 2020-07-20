package com.maamba.studententry.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.maamba.studententry.R;

public class MyHolder extends RecyclerView.ViewHolder {
    TextView studentName,yearDate;

    public MyHolder(@NonNull View view) {
        super(view);

         studentName = view.findViewById(R.id.studentName);
         yearDate = view.findViewById(R.id.yeardate);
    }
}
