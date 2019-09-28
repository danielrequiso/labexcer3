package com.requiso.labexcer3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText course1, course2, course3, course4, course5, course6, course7, course8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        course1 = findViewById(R.id.editText);
        course2 = findViewById(R.id.editText2);
        course3 = findViewById(R.id.editText3);
        course4 = findViewById(R.id.editText4);
        course5 = findViewById(R.id.editText5);
        course6 = findViewById(R.id.editText6);
        course7 = findViewById(R.id.editText7);
        course8 = findViewById(R.id.editText8);
    }
    public void writeData(View v) {
        String subj1 = course1.getText().toString() + " ";
        String subj2 = course2.getText().toString() + " ";
        String subj3 = course3.getText().toString() + " ";
        String subj4 = course4.getText().toString() + " ";
        String subj5 = course5.getText().toString() + " ";
        String subj6 = course6.getText().toString() + " ";
        String subj7 = course7.getText().toString() + " ";
        String subj8= course8.getText().toString() + " ";
        FileOutputStream writer = null;
        try {
            writer = openFileOutput("data1.txt", MODE_PRIVATE );
            writer.write(subj1.getBytes());
            writer.write(subj2.getBytes());
            writer.write(subj3.getBytes());
            writer.write(subj4.getBytes());
            writer.write(subj5.getBytes());
            writer.write(subj6.getBytes());
            writer.write(subj7.getBytes());
            writer.write(subj8.getBytes());
        } catch (FileNotFoundException e) {
            Log.d("error", "file not found...");
        } catch (IOException e) {
            Log.d("error", "IO error...");
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                Log.d("error", "file not found...");
            }
        }
        Toast.makeText(this, "data saved...", Toast.LENGTH_LONG).show();

    }

    public void next(View v) {
        Intent i  = new Intent (this, Main2Activity.class);
        startActivity(i);

    }
}
