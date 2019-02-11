package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    private EditText etDisplay;
    private Button btBai3;
    int[] buttonIDs = new int[] {R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,
            R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9,R.id.btnCong,R.id.btnTru,R.id.btnNhan,R.id.btnChia,
            R.id.btnEqual,R.id.btnDIV,R.id.btnDot,R.id.btnMOD,R.id.btnSQRT1,R.id.btnSQRT2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initViews();
    }

    private void initViews() {
        btBai3 = findViewById(R.id.btnBai3);
        etDisplay = findViewById(R.id.etDisplay);
        for(int i=0; i<buttonIDs.length; i++) {
            Button b = findViewById(buttonIDs[i]);
            b.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        String temp = etDisplay.getText().toString();
//        if (v.getId() == R.id.btn0) {
//            temp += "0";
//            etDisplay.setText(temp);
//        }
//        if (v.getId() == R.id.btn1) {
//            temp += "1";
//            etDisplay.setText(temp);
//        }

        if (v.getId() == R.id.btnBai3) {
            Intent i = new Intent(Main2Activity.this,Main3Activity.class);
            startActivity(i);
        }
        else {
            for (int i = 0; i < buttonIDs.length; i++) {
                if (v.getId() == buttonIDs[i]) {
                    Button b = findViewById(buttonIDs[i]);
                    String btnName = (String) b.getText();
                    temp += btnName;
                    etDisplay.setText(temp);
                }
            }
        }

    }
}
