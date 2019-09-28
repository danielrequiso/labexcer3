package com.requiso.labexcer3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;

public class Main2Activity extends AppCompatActivity {
    EditText course1, course2, course3, course4, course5, course6, course7, course8;
    String dataArray;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        course1 = findViewById(R.id.checkBox);
        course2 = findViewById(R.id.checkBox2);
        course3 = findViewById(R.id.checkBox3);
        course4 = findViewById(R.id.checkBox4);
        course5 = findViewById(R.id.checkBox5);
        course6 = findViewById(R.id.checkBox6);
        course7 = findViewById(R.id.checkBox7);
        course8 = findViewById(R.id.checkBox8);

    }
    public void onStart() {
        super.onStart();
        String data = "";
        String subj1 = "";
        String subj2 = "";
        String subj3 = "";
        String subj4 = "";
        String subj5 = "";
        String subj6 = "";
        String subj7 = "";
        String subj8 = "";
        try {
            FileInputStream reader = openFileInput("data1.txt");
            int token;
            while((token = reader.read()) != -1) {
                subj1 = subj1 + (char)token;
                subj2 = subj2 + (char)token;
                subj3 = subj3 + (char)token;
                subj4 = subj4 + (char)token;
                subj5 = subj5 + (char)token;
                subj6 = subj6 + (char)token;
                subj7 = subj7 + (char)token;
                subj8 = subj8 + (char)token;

            }
        } catch (FileNotFoundException e) {
            Log.d("error", "file not found...");
        } catch (IOException e) {
            Log.d("error", "IO error...");
        }
        
        course1.setText(dataArray);
        course2.setText(dataArray);
        course3.setText(dataArray);
        course4.setText(dataArray);
        course5.setText(dataArray);
        course6.setText(dataArray);
        course7.setText(dataArray);
        course8.setText(dataArray);



    }
}
