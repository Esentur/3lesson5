package com.example.a3lesson5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        Button addBtn;
        MainAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addBtn=findViewById(R.id.addBtn);
        RecyclerView recyclerView = findViewById(R.id.ma_recyclerview);

        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
    }
    public void onClick(View v){

        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivityForResult(intent,1);
    }
    private void openDetail(Task task){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra(Main2Activity.DETAILS_KEY,task);
                startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1){
        if(resultCode==RESULT_OK){
            Task task = (Task)data.getSerializableExtra("key");
            adapter.addTask(task);
        }
        }
    }
}
