package com.example.a3lesson5;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        textView= itemView.findViewById(R.id.vh_text_view);

    }
    public  void onBind(Task task){
        textView.setText(task.el1);

    }
}
