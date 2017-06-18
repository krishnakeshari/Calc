package com.example.android.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonZero,buttonOne,buttonTwo,buttonThree,buttonFour,buttonFive,buttonSix,buttonSeven,buttonEight,buttonNine,buttonPlus,buttonMinus,buttonDivide,buttonMultiply,buttonEquals,buttonClear,buttonDot;
    double a,b;
    String data,show;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] function = {0};
        buttonDot = (Button) findViewById(R.id.button_dot);
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show==null){
                    show ="0.";
                    data ="0.";
                }
                else {
                    show +=".";
                    data +=".";
                }
                display(show);
            }
        });
        buttonZero = (Button) findViewById(R.id.button_zero);
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show==null){
                    show ="0";
                    data ="0";
                }
                else {
                    show +="0";
                    data +="0";
                }
                display(show);
            }
        });
        buttonOne = (Button) findViewById(R.id.button_one);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show==null){
                    show ="1";
                    data ="1";
                }
                else {
                    show +="1";
                    data +="1";
                }
                display(show);
            }
        });
        buttonTwo = (Button) findViewById(R.id.button_two);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show==null){
                    show ="2";
                    data ="2";
                }
                else {
                    show +="2";
                    data +="2";
                }
                display(show);
            }
        });
        buttonThree = (Button) findViewById(R.id.button_three);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show==null){
                    show ="3";
                    data ="3";
                }
                else {
                    show +="3";
                    data +="3";
                }
                display(show);
            }
        });
        buttonFour = (Button) findViewById(R.id.button_four);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show==null){
                    show ="4";
                    data ="4";
                }
                else {
                    show +="4";
                    data +="4";
                }
                display(show);
            }
        });
        buttonFive = (Button) findViewById(R.id.button_five);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show==null){
                    show ="5";
                    data ="5";
                }
                else {
                    show +="5";
                    data +="5";
                }
                display(show);
            }
        });
        buttonSix = (Button) findViewById(R.id.button_six);
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show==null){
                    show ="6";
                    data ="6";
                }
                else {
                    show +="6";
                    data +="6";
                }
                display(show);
            }
        });
        buttonSeven = (Button) findViewById(R.id.button_seven);
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show==null){
                    show ="7";
                    data ="7";
                }
                else {
                    show +="7";
                    data +="7";
                }
                display(show);
            }
        });
        buttonEight = (Button) findViewById(R.id.button_eight);
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show==null){
                    show ="8";
                    data ="8";
                }
                else {
                    show +="8";
                    data +="8";
                }
                display(show);
            }
        });
        buttonNine = (Button) findViewById(R.id.button_nine);
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show==null){
                    show ="9";
                    data ="9";
                }
                else {
                    show +="9";
                    data +="9";
                }
                display(show);
            }
        });
        buttonPlus = (Button) findViewById(R.id.button_plus);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show = null;
                function[0] = 1;
                display(show);
                try{
                    a = Double.parseDouble(data);
                    data="";
                }catch (NullPointerException e){
                    Toast toast = Toast.makeText(MainActivity.this,"Enter The Number",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        buttonMinus = (Button) findViewById(R.id.button_minus);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show = null;
                function[0] = 2;
                display(show);
                try{
                    a = Double.parseDouble(data);
                    data="";
                }catch (NullPointerException e){
                    Toast toast = Toast.makeText(MainActivity.this,"Enter The Number",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        buttonMultiply = (Button) findViewById(R.id.button_multiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show = null;
                function[0] = 3;
                display(show);
                try{
                    a = Double.parseDouble(data);
                    data="";
                }catch (NullPointerException e){
                    Toast toast = Toast.makeText(MainActivity.this,"Enter The Number",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        buttonDivide = (Button) findViewById(R.id.button_divide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show = null;
                function[0] = 4;
                display(show);
                try{
                    a = Double.parseDouble(data);
                    data="";
                }catch (NullPointerException e){
                    Toast toast = Toast.makeText(MainActivity.this,"Enter The Number",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        buttonEquals = (Button) findViewById(R.id.button_equals);
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c=0;
                try{
                    b = Double.parseDouble(data);
                    data="";
                    show="";
                }catch (NullPointerException e){
                    e.printStackTrace();
                }
                if(function[0] == 0){
                    b=0;
                    display(""+c);
                    return;
                }
                else if (function[0] ==1)
                    c=a+b;
                else if (function[0] ==2)
                    c=a-b;
                else if (function[0] ==3)
                    c=a*b;
                else if (function[0] ==4){
                    c=a/b;
                }

                if(c!=0) {
                    data = ""+c;
                }
                display(""+c);
            }
        });
        buttonClear = (Button)findViewById(R.id.button_clear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=0;
                b=0;
                show=null;
                data=null;
                function[0] = 0;
                display("0");
            }
        });
    }
    void display(String d){
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(d);
    }
}