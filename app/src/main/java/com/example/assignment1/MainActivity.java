package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int score = 0;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private Spinner spinner1;
    private Spinner spinner2;
    private EditText answer;

    private Button submit;
    private TextView finalscore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup1 = findViewById(R.id.myRadioGroup);
        RadioGroup radioGroup2 = findViewById(R.id.RG2);

        radioButton1 = findViewById(R.id.option1);
        radioButton2 = findViewById(R.id.op2);

        spinner1 = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);

        spinner1.setSelection(-1);
        spinner2.setSelection(-1);

         answer = findViewById(R.id.editText);
         submit = findViewById(R.id.button);

        finalscore = findViewById(R.id.textView7);


        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButton1.isChecked()) {
                    score++;
                }
            }
        });  // this method is to check if the checked radio button is the correct answer

        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButton2.isChecked()) {
                    score++;
                }
            }
        });  // this method is to check if the checked radio button is the correct answer

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedValue = (String) parent.getItemAtPosition(position);
                if (selectedValue.equals("is")) {
                    score++;
                }
            } // if the selected option is (is) the answer is correct and the score is incremented

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // if there is nothing selected do nothing
            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedValue = (String) parent.getItemAtPosition(position);
                if (selectedValue.equals("have")) {
                    score++;
                }
            } // if the selected option is (have) the answer is correct and the score is incremented

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // if there is nothing selected do nothing

            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            String ans = answer.getText().toString();
            if (ans.equals("am")) {
                score++;
            }



            finalscore.setText("Your Score is: " + score + "/5");
            finalscore.setVisibility(View.VISIBLE);


                String message;
                if (score > 3) {
                    message = "Brilliant!";
                } else if (score > 1) {
                    message = "Good, but you can do better.";
                } else {
                    message = "You should improve your English.";
                }
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
        }

    }); // when the button is clicked firstly it will get the text and check whether it is correct or not
        // to increment the score , then it will display the score and the toast based on ur score

        }
}