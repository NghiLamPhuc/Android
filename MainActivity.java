package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText eUsername,ePass;
    private Button btLogin,btnBai2;
    private CheckBox chbRemember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btLogin.setOnClickListener(this);
        btnBai2.setOnClickListener(this);

        /*chbRemember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this,"MAT KHAU DA LUU",Toast.LENGTH_SHORT).show();
                }
            }
        });*/
    }

    private void initViews() {
        eUsername = findViewById(R.id.etUsername);
        ePass = findViewById(R.id.etPass);
        btLogin = findViewById(R.id.btnLogin);
        chbRemember = findViewById(R.id.chbRem);
        btnBai2 = findViewById(R.id.btnBai2);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnLogin) {
            String username = eUsername.getText().toString();
            String password = ePass.getText().toString();
            if (username.equals("") || password.equals("")) {
                Toast.makeText(MainActivity.this, "NHAP DAY DU USERNAME, PASSWORD.", Toast.LENGTH_SHORT).show();
            } else {
                if (username.equalsIgnoreCase(password)) {
                    if (chbRemember.isChecked()) {
                        Toast.makeText(MainActivity.this, "DANG NHAP THANH CONG.MAT KHAU DA LUU", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this,"DANG NHAP THANH CONG.",Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "DANG NHAP THAT BAI.", Toast.LENGTH_SHORT).show();
                }
            }
        }
        if (v.getId() == R.id.btnBai2) {
            Intent i = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(i);
        }
    }
}
