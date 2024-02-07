package com.example.inputoutput;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView messageShow;
    EditText firstName, lastName, Age, Course, yearLevel;
    Button btnView,btnClear;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageShow = findViewById(R.id.messageShow);
       firstName= findViewById(R.id.firstName);
       lastName= findViewById(R.id. lastName);
        Age = findViewById(R.id.Age);
         Course= findViewById(R.id.Course);
        yearLevel= findViewById(R.id.yearLevel);

        btnView= findViewById(R.id.btnView);
        btnClear= findViewById(R.id.btnClear);

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fName = firstName.getText().toString();
                String lName = lastName.getText().toString();
                String age = Age.getText().toString();
                String course = Course.getText().toString();
                String yearLvl = yearLevel.getText().toString();


                String Display = "Hello  Ma'am and Sir My Name is " + fName+" "+lName +", I am "+ age +" years old " +
                        "taking of "+course+ " with a year level of "+ yearLvl+".";


                messageShow.setText(Display);

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                firstName.getText().clear();
                lastName.getText().clear();
                Age.getText().clear();
                Course.getText().clear();
                yearLevel.getText().clear();

                messageShow.setText(" ");
            }
        });



    }
    /*
    public void onBtnClick(View view) {
        TextView messageShow = findViewById(R.id.messageShow);
        EditText firstName= findViewById(R.id.firstName);
        EditText lastName= findViewById(R.id. lastName);
        EditText Age = findViewById(R.id.Age);
        EditText Course= findViewById(R.id.Course);
        EditText yearLevel= findViewById(R.id.yearLevel);

        String fName = firstName.getText().toString();
        String lName = lastName.getText().toString();
        String age = Age.getText().toString();
        String course = Course.getText().toString();
        String yearLvl = yearLevel.getText().toString();


       String Display = "Hello  Ma'am and Sir My Name is " + fName+" "+lName +", I am "+ age +" years old " +
               "taking of "+course+ " with a year level of "+ yearLvl+".";


        messageShow.setText(Display);
    }
        */

}