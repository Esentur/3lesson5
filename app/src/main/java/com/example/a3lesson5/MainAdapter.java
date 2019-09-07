package com.example.a3lesson5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {
    ArrayList<Task> data;

    public MainAdapter(){
        data = new ArrayList<>();

    }
    public void addTask(Task task){
        data.add(task);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext()); //сканнер по хмл файлам создаст нам вью объект
        View view = inflater.inflate(R.layout.view_holder_main,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(data.get(position));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
