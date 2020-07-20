package com.maamba.studententry.RemoveStudent;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.maamba.studententry.R;

public class DeleteHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    TextView studentName,yearDate;
    Button delete;
    DeleteItemClickListener itemClickListener;
     DeleteHolder(@NonNull View view) {
        super(view);

         studentName = view.findViewById(R.id.studentName);
         yearDate = view.findViewById(R.id.yeardate);
         delete = view.findViewById(R.id.removeLearner);
         view.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
         this.itemClickListener.onItemClickListener(view,getLayoutPosition());
    }

    public void setItemClickListener(DeleteItemClickListener ic){
         this.itemClickListener = ic;
    }
}
