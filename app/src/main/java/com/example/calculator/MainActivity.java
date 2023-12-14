package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText display;
    Button percBtn, ceBtn, cBtn, delBtn,
            fracBtn, sqrBtn, sqrtBtn, divideBtn,
            sevenBtn, eightBtn, nineBtn, multiplyBtn,
            fourBtn, fiveBtn, sixBtn, subtractBtn,
            oneBtn, twoBtn, threeBtn, addBtn,
            signBtn, zeroBtn, dotBtn, equalBtn;


        // This function allows the user to add numbers and operators in everywhere of the calculation.
    private void updateText(String strToAdd){
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
        display.setSelection(cursorPos + 1);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);

        // In this part buttons and their id's are connected.
        zeroBtn = findViewById(R.id.zeroBtn);
        oneBtn = findViewById(R.id.oneBtn);
        twoBtn = findViewById(R.id.twoBtn);
        threeBtn = findViewById(R.id.threeBtn);
        fourBtn = findViewById(R.id.fourBtn);
        fiveBtn = findViewById(R.id.fiveBtn);
        sixBtn = findViewById(R.id.sixBtn);
        sevenBtn = findViewById(R.id.sevenBtn);
        eightBtn = findViewById(R.id.eightBtn);
        nineBtn = findViewById(R.id.nineBtn);
        addBtn = findViewById(R.id.addBtn);
        subtractBtn = findViewById(R.id.subtractBtn);
        multiplyBtn = findViewById(R.id.multiplyBtn);
        divideBtn = findViewById(R.id.divideBtn);
        percBtn = findViewById(R.id.percBtn);
        ceBtn = findViewById(R.id.ceBtn);
        cBtn = findViewById(R.id.cBtn);
        delBtn = findViewById(R.id.delBtn);
        fracBtn = findViewById(R.id.fracBtn);
        sqrBtn = findViewById(R.id.sqrBtn);
        sqrtBtn = findViewById(R.id.sqrtBtn);
        signBtn = findViewById(R.id.signBtn);
        dotBtn = findViewById(R.id.dotBtn);
        equalBtn = findViewById(R.id.equalBtn);


        // In this part functionality is added to buttons

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("0");
            }
        });

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("1");
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("2");
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("3");
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("4");
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("5");
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("6");
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("7");
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("8");
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("9");
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("+");
            }
        });

        subtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("-");
            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("×");
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("÷");
            }
        });

        percBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!display.getText().toString().isEmpty()) {
                    double number = Double.parseDouble(display.getText().toString());
                    double result = number / 100;
                    display.setText(String.valueOf(result));
                }
            }
        });

        ceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cursorPos = display.getSelectionStart();
                int textLen = display.getText().length();
                if(cursorPos != 0 && textLen != 0){
                    SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
                    selection.replace(cursorPos - 1, cursorPos, "");
                    display.setText(selection);
                    display.setSelection(cursorPos - 1);
                }
            }
        });

        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });

        delBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cursorPos = display.getSelectionStart();
                int textLen = display.getText().length();
                if(cursorPos != 0 && textLen != 0){
                    SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
                    selection.replace(cursorPos - 1, cursorPos, "");
                    display.setText(selection);
                    display.setSelection(cursorPos - 1);
                }
            }
        });

        fracBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cursorPos = display.getSelectionStart();
                updateText("1/");
                display.setSelection(cursorPos + 2);
            }
        });

        sqrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cursorPos = display.getSelectionStart();
                updateText("^2");
                display.setSelection(cursorPos + 2);
            }
        });

        sqrtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cursorPos = display.getSelectionStart();
                updateText("^(1/2)");
                display.setSelection(cursorPos + 6);
            }
        });

        signBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("-");
            }
        });

        dotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(".");
            }
        });

        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userExp = display.getText().toString();
                Expression exp = new Expression(userExp);

                String result = String.valueOf(exp.calculate());

                display.setText(result);
                display.setSelection(result.length());
            }
        });

    }
}