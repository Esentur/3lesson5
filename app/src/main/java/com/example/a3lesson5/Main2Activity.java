package com.example.a3lesson5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    static final String DETAILS_KEY ="details_key";
    EditText el1;
    EditText el2;
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        el1 = findViewById(R.id.editText);
        el2 = findViewById(R.id.editText2);
        saveButton = findViewById(R.id.saveButton);



    }

    public void onClick(View v) {
        Intent intent = new Intent();
        String str1 = el1.getText().toString();
        String str2 = el2.getText().toString();
        Task task = new Task(str1,str2);

        intent.putExtra("key",task);
        setResult(RESULT_OK,intent);
        finish();


    }

}
