package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvKQ;
//    private int[] buttonIDs = new int[] {R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,
//            R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9,R.id.btnCong,R.id.btnTru,R.id.btnNhan,R.id.btnChia,
//            R.id.btnDiv,R.id.btnMod,R.id.btnGCD,R.id.btnLCD,R.id.btnNguyento,R.id.btnAmlich,R.id.btnNhuan,
//            R.id.btnBang,R.id.btnPhay,R.id.btnClear,R.id.btnBackSpace};
    private Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btCong,btTru,btNhan,btChia,btDiv,btMod,btGCD,btLCD,btNgto,
                    btAmLich,btNhuan,btBang,btPhay,btClear,btBackSpace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        tvKQ = findViewById(R.id.tvKQ);
//        for(int i=0; i<buttonIDs.length; i++) {
//            Button b = findViewById(buttonIDs[i]);
//            b.setOnClickListener(this);
//        }
        bt0 = findViewById(R.id.btn0);
        bt1 = findViewById(R.id.btn1);
        bt2 = findViewById(R.id.btn2);
        bt3 = findViewById(R.id.btn3);
        bt4 = findViewById(R.id.btn4);
        bt5 = findViewById(R.id.btn5);
        bt6 = findViewById(R.id.btn6);
        bt7 = findViewById(R.id.btn7);
        bt8 = findViewById(R.id.btn8);
        bt9 = findViewById(R.id.btn9);
        btCong = findViewById(R.id.btnCong);
        btTru = findViewById(R.id.btnTru);
        btNhan = findViewById(R.id.btnNhan);
        btChia = findViewById(R.id.btnChia);
        btDiv = findViewById(R.id.btnDiv);
        btMod = findViewById(R.id.btnMod);
        btGCD = findViewById(R.id.btnGCD);
        btLCD = findViewById(R.id.btnLCD);
        btNgto = findViewById(R.id.btnNguyento);
        btAmLich = findViewById(R.id.btnAmlich);
        btNhuan = findViewById(R.id.btnNhuan);
        btBang = findViewById(R.id.btnBang);
        btPhay = findViewById(R.id.btnPhay);
        btClear = findViewById(R.id.btnClear);
        btBackSpace = findViewById(R.id.btnBackSpace);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn0) {

        }
        else if (v.getId() == R.id.btn1) {

        }
        else if (v.getId() == R.id.btn2) {

        }
        else if (v.getId() == R.id.btn3) {

        }
        else if (v.getId() == R.id.btn4) {

        }
        else if (v.getId() == R.id.btn5) {

        }
        else if (v.getId() == R.id.btn6) {

        }
        else if (v.getId() == R.id.btn7) {

        }
        else if (v.getId() == R.id.btn8) {

        }
        else if (v.getId() == R.id.btn9) {

        }
        else if (v.getId() == R.id.btnCong) {

        }
        else if (v.getId() == R.id.btnTru) {

        }
        else if (v.getId() == R.id.btnNhan) {

        }
        else if (v.getId() == R.id.btnChia) {

        }
        else if (v.getId() == R.id.btnDiv) {

        }
        else if (v.getId() == R.id.btnMod) {

        }
        else if (v.getId() == R.id.btnGCD) {

        }
        else if (v.getId() == R.id.btnLCD) {

        }
        else if (v.getId() == R.id.btnNguyento) {

        }
        else if (v.getId() == R.id.btnAmlich) {

        }
        else if (v.getId() == R.id.btnNhuan) {

        }
        else if (v.getId() == R.id.btnBang) {

        }
        else if (v.getId() == R.id.btnPhay) {

        }
        else if (v.getId() == R.id.btnClear) {

        }
        else if (v.getId() == R.id.btnBackSpace) {

        }
    }

//    @Override
//    public void onClick(View v) {
//        String temp = tvKQ.getText().toString();
//        String temp2 = "";
//        Boolean flag = false;
//        String current = "";
//        for (int i = 0; i < buttonIDs.length; i++) {
//            if (v.getId() == buttonIDs[i]) {
//                Button b = findViewById(buttonIDs[i]);
//                String btnName = (String) b.getText();
//                if (btnName.equalsIgnoreCase("Clear")) {
//                    temp += "";
//                    tvKQ.setText("0");
//                }
//                else if(btnName.equalsIgnoreCase("Back space")) {
//                    if (temp != null && temp.length() > 0) {
//                        temp = temp.substring(0, temp.length() - 1);
//                    }
//                    tvKQ.setText(temp);
//                }
//                else if(btnName.equalsIgnoreCase("+")) {
//                    flag = true;
//                    current = "cong";
//                }
//                else if(btnName.equalsIgnoreCase("-")) {
//                    flag = true;
//                    current = "tru";
//                }
//                else if(btnName.equalsIgnoreCase("x")) {
//                    flag = true;
//                    current = "nhan";
//                }
//                else if(btnName.equalsIgnoreCase(":")) {
//                    flag = true;
//                    current = "chia";
//                }
//                else {
//                    temp2 += btnName;
//                    int num1 = Integer.parseInt(temp);
//                    int num2 = Integer.parseInt(temp2);
//                    if (flag == true && current == "cong") {
//                        num1 += num2;
//                        flag = false;
//                    }
//                    else if (flag == true && current == "tru") {
//                        num1 -= num2;
//                        flag = false;
//                    }
//                    else if (flag == true && current == "nhan") {
//                        num1 *= num2;
//                        flag = false;
//                    }
//                    else if (flag == true && current == "chia") {
//                        num1 /= num2;
//                        flag = false;
//                    }
//                    temp = "";
//                    temp += num1;
//                    tvKQ.setText(temp);
//                }
//            }
//        }

//    }
}
