package com.alect.lesson1example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.io.Console;

public class CalculatorActivity extends AppCompatActivity {

    TextView resultTv = null;
    TextView operationTv = null;

    Button calcBtn = null;
    Button btn_0 = null;
    Button btn_1 = null;
    Button btn_2 = null;
    Button btn_3 = null;
    Button btn_4 = null;
    Button btn_5 = null;
    Button btn_6 = null;
    Button btn_7 = null;
    Button btn_8 = null;
    Button btn_9 = null;
    Button btn_plus = null;
    Button btn_minus = null;

    View.OnClickListener nBtnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_0: {
                    operationTv.setText(operationTv.getText() + "0");
                    break;
                }
                case R.id.btn_1: {
                    operationTv.setText(operationTv.getText() + "1");
                    break;
                }
                case R.id.btn_2: {
                    operationTv.setText(operationTv.getText() + "2");
                    break;
                }
                case R.id.btn_3: {
                    operationTv.setText(operationTv.getText() + "3");
                    break;
                }
                case R.id.btn_4: {
                    operationTv.setText(operationTv.getText() + "4");
                    break;
                }
                case R.id.btn_5: {
                    operationTv.setText(operationTv.getText() + "5");
                    break;
                }
                case R.id.btn_6: {
                    operationTv.setText(operationTv.getText() + "6");
                    break;
                }
                case R.id.btn_7: {
                    operationTv.setText(operationTv.getText() + "7");
                    break;
                }
                case R.id.btn_8: {
                    operationTv.setText(operationTv.getText() + "8");
                    break;
                }
                case R.id.btn_9: {
                    operationTv.setText(operationTv.getText() + "9");
                    break;
                }

                case R.id.plus: {
                    operationTv.setText(operationTv.getText() + "+");
                    break;
                }

                case R.id.minus: {
                    operationTv.setText(operationTv.getText() + "-");
                    break;
                }

                case R.id.calcBtn: {
                    String operation = operationTv.getText().toString() + "+";

                    if(!operation.isEmpty()) {
                        char[] simArray = operation.toCharArray();
                        int res = 0;
                        char sim = '+';
                        String tmpString = "";
                        for(int i = 1;  i < operation.length(); ++i){
                            if(operation.charAt(i) == '+' || operation.charAt(i) == '-'){
                                int tmpNum = Integer.parseInt(tmpString);
                                tmpString = "";
                                switch (sim){
                                    case '+':
                                            res += tmpNum;
                                            break;
                                    case '-':
                                            res -= tmpNum;
                                            break;
                                }
                                sim = operation.charAt(i);
                            }
                            else{
                                tmpString += Character.toString(operation.charAt(i));
                            }
                        }
                        resultTv.setText(Integer.toString(res));
                    }

                    break;
                }

            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         calcBtn = (Button) findViewById(R.id.calcBtn);
         resultTv = (TextView) findViewById(R.id.result);
         operationTv = (TextView) findViewById(R.id.operation);

         btn_0 = (Button) findViewById(R.id.btn_0);
         btn_1 = (Button) findViewById(R.id.btn_1);
         btn_2 = (Button) findViewById(R.id.btn_2);
         btn_3 = (Button) findViewById(R.id.btn_3);
         btn_4 = (Button) findViewById(R.id.btn_4);
         btn_5 = (Button) findViewById(R.id.btn_5);
         btn_6 = (Button) findViewById(R.id.btn_6);
         btn_7 = (Button) findViewById(R.id.btn_7);
         btn_8 = (Button) findViewById(R.id.btn_8);
         btn_9 = (Button) findViewById(R.id.btn_9);
         btn_plus = (Button) findViewById(R.id.plus);
         btn_minus = (Button) findViewById(R.id.minus);

         calcBtn.setOnClickListener(nBtnClickListener);
        btn_0.setOnClickListener(nBtnClickListener);
        btn_1.setOnClickListener(nBtnClickListener);
        btn_2.setOnClickListener(nBtnClickListener);
        btn_3.setOnClickListener(nBtnClickListener);
        btn_4.setOnClickListener(nBtnClickListener);
        btn_5.setOnClickListener(nBtnClickListener);
        btn_6.setOnClickListener(nBtnClickListener);
        btn_7.setOnClickListener(nBtnClickListener);
        btn_8.setOnClickListener(nBtnClickListener);
        btn_9.setOnClickListener(nBtnClickListener);
        btn_plus.setOnClickListener(nBtnClickListener);
        btn_minus.setOnClickListener(nBtnClickListener);
    }
}