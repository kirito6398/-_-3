package com.example.calculater;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String data;
    Double var,var1;
    boolean Add,Mul,Div,Sub,Mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ed2 = findViewById(R.id.InputView);
        Button btn1 = findViewById(R.id.btn10);
        Button btn2 = findViewById(R.id.btn11);
        Button btn3 = findViewById(R.id.btn12);
        Button btn4 = findViewById(R.id.btn13);
        Button btn5 = findViewById(R.id.btn14);
        Button btn6 = findViewById(R.id.btn15);
        Button btn7 = findViewById(R.id.btn16);
        Button btn8 = findViewById(R.id.btn17);
        Button btn9 = findViewById(R.id.btn18);
        Button btn0 = findViewById(R.id.btn1);
        Button btnDot = findViewById(R.id.btn19);
        Button btnAdd = findViewById(R.id.btn8);
        Button btnSub = findViewById(R.id.btn7);
        Button btnMul = findViewById(R.id.btn6);
        Button btnDiv = findViewById(R.id.btn5);
        Button btnEqual = findViewById(R.id.btn9);
        Button btnClear = findViewById(R.id.btn2);
        Button btnMod = findViewById(R.id.btn4);
        Button btnM = findViewById(R.id.btn3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = ed2.getText().toString();
                ed2.setText(String.format("%s1", data));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = ed2.getText().toString();
                ed2.setText(String.format("%s2", data));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = ed2.getText().toString();
                ed2.setText(String.format("%s3", data));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = ed2.getText().toString();
                ed2.setText(String.format("%s4", data));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = ed2.getText().toString();
                ed2.setText(String.format("%s5", data));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = ed2.getText().toString();
                ed2.setText(String.format("%s6", data));
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = ed2.getText().toString();
                ed2.setText(String.format("%s7", data));
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = ed2.getText().toString();
                ed2.setText(String.format("%s8", data));
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = ed2.getText().toString();
                ed2.setText(String.format("%s9", data));
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = ed2.getText().toString();
                ed2.setText(String.format("%s0", data));
            }
        });
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = ed2.getText().toString();
                ed2.setText(String.format("%s-", data));
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = ed2.getText().toString();
                ed2.setText(String.format("%s.", data));
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed2==null) {
                    ed2.setText("");
                }
                else {
                    var = Double.parseDouble(ed2.getText()+"");
                    Add = true;
                    ed2.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed2==null) {
                    ed2.setText("");
                }
                else {
                    var = Double.parseDouble(ed2.getText()+"");
                    Sub = true;
                    ed2.setText(null);
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed2==null) {
                    ed2.setText("");
                }
                else {
                    var = Double.parseDouble(ed2.getText()+"");
                    Mul = true;
                    ed2.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed2==null) {
                    ed2.setText("");
                }
                else {
                    var = Double.parseDouble(ed2.getText()+"");
                    Div= true;
                    ed2.setText(null);
                }
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed2==null) {
                    ed2.setText("");
                }
                else {
                    var = Double.parseDouble(ed2.getText()+"");
                    Mod= true;
                    ed2.setText(null);
                }
            }

        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                var1 = Double.parseDouble(ed2.getText()+"");
                if (Add) {
                    ed2.setText(var + var1 + "");
                    Add = false;
                }
                if (Sub) {
                    ed2.setText(var - var1 + "");
                    Sub = false;
                }
                if (Mul) {
                    ed2.setText(var * var1 + "");
                    Mul = false;
                }
                if (Div) {
                    ed2.setText(var / var1 + "");
                    Div = false;
                }
                if(Mod){
                    ed2.setText((var/var1)/100+"");
                    Mod = false;
                }
            }

        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed2.setText("");
            }
        });


    }
}


