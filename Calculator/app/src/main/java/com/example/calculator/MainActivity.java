package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvKQ;
    private int[] buttonIDs = new int[] {R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,
            R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9,R.id.btnCong,R.id.btnTru,R.id.btnNhan,R.id.btnChia,
            R.id.btnDiv,R.id.btnMod,R.id.btnGCD,R.id.btnLCD,R.id.btnNguyento,R.id.btnAmlich,R.id.btnNhuan,
            R.id.btnBang,R.id.btnPhay,R.id.btnClear,R.id.btnBackSpace};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        tvKQ = findViewById(R.id.tvKQ);
        for(int i=0; i<buttonIDs.length; i++) {
            Button b = findViewById(buttonIDs[i]);
            b.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        String temp = tvKQ.getText().toString();
        String temp2 = "";
        Boolean flag = false;
        String current = "";
        for (int i = 0; i < buttonIDs.length; i++) {
            if (v.getId() == buttonIDs[i]) {
                Button b = findViewById(buttonIDs[i]);
                String btnName = (String) b.getText();
                if (btnName.equalsIgnoreCase("Clear")) {
                    temp += "";
                    tvKQ.setText("0");
                }
                else if(btnName.equalsIgnoreCase("Back space")) {
                    if (temp != null && temp.length() > 0) {
                        temp = temp.substring(0, temp.length() - 1);
                    }
                    tvKQ.setText(temp);
                }
                else if(btnName.equalsIgnoreCase("+")) {
                    flag = true;
                    current = "cong";
                }
                else if(btnName.equalsIgnoreCase("-")) {
                    flag = true;
                    current = "tru";
                }
                else if(btnName.equalsIgnoreCase("x")) {
                    flag = true;
                    current = "nhan";
                }
                else if(btnName.equalsIgnoreCase(":")) {
                    flag = true;
                    current = "chia";
                }
                else {
                    temp2 += btnName;
                    int num1 = Integer.parseInt(temp);
                    int num2 = Integer.parseInt(temp2);
                    if (flag == true && current == "cong") {
                        num1 += num2;
                        flag = false;
                    }
                    else if (flag == true && current == "tru") {
                        num1 -= num2;
                        flag = false;
                    }
                    else if (flag == true && current == "nhan") {
                        num1 *= num2;
                        flag = false;
                    }
                    else if (flag == true && current == "chia") {
                        num1 /= num2;
                        flag = false;
                    }
                    temp = "";
                    temp += num1;
                    tvKQ.setText(temp);
                }
            }
        }

    }
}
