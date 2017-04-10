package com.example.test.taehyung.wordtestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.regex.Matcher;

public class MainActivity extends AppCompatActivity {
    TextView tv_first;
    TextView tv_second;
    TextView tv_third;

    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Word> myWord = new ArrayList<>();
        myWord.add(new Word("Word","단어"));
        myWord.add(new Word("Cold","감기"));
        myWord.add(new Word("Hot","뜨거운"));
        myWord.add(new Word("Name","이름"));
        myWord.add(new Word("Apple","사과"));
        myWord.add(new Word("Peach","복숭아"));
        myWord.add(new Word("Build","짓다"));
        myWord.add(new Word("Finish","완료하다"));
        myWord.add(new Word("Main","주된"));
        myWord.add(new Word("White","흰"));


        int r1 = (int)(Math.random()*myWord.size());
        int r2 = (int)(Math.random()*myWord.size());
        int r3 = (int)(Math.random()*myWord.size());
        while (r1 == r2 || r1 == r3 || r2 == r3){
            r1 = (int)(Math.random()*myWord.size());
            r2 = (int)(Math.random()*myWord.size());
            r3 = (int)(Math.random()*myWord.size());
        }

        tv_first = (TextView)findViewById(R.id.first);
        tv_first.setText(myWord.get(r1).kor);
        tv_first.setTag(r1);

        tv_second = (TextView)findViewById(R.id.second);
        tv_second.setText(myWord.get(r2).kor);
        tv_second.setTag(r2);

        tv_third = (TextView)findViewById(R.id.third);
        tv_third.setText(myWord.get(r3).kor);
        tv_third.setTag(r3);

        int rn = (int)(Math.random() * 3);
        if (rn == 0) {
            tv_result = (TextView)findViewById(R.id.result);
            tv_result.setText(myWord.get(r1).eng);
            tv_result.setTag(r1);
        }else if (rn == 1) {
            tv_result = (TextView)findViewById(R.id.result);
            tv_result.setText(myWord.get(r2).eng);
            tv_result.setTag(r2);
        }else {
            tv_result = (TextView)findViewById(R.id.result);
            tv_result.setText(myWord.get(r3).eng);
            tv_result.setTag(r3);
        }
    }

    public void onFirst(View view) {
        int a = (int)tv_first.getTag();
        int b = (int)tv_result.getTag();
        if(a==b){
            recreate();
        }else{
            Toast.makeText(this, "오답입니다.", Toast.LENGTH_SHORT).show();
        }

    }

    public void onSecond(View view) {
        int a = (int)tv_second.getTag();
        int b = (int)tv_result.getTag();
        if(a==b){
            recreate();
        }else{
            Toast.makeText(this, "오답입니다.", Toast.LENGTH_SHORT).show();
        }
    }

    public void onThird(View view) {
        int a = (int)tv_third.getTag();
        int b = (int)tv_result.getTag();
        if(a==b){
            recreate();
        }else{
            Toast.makeText(this, "오답입니다.", Toast.LENGTH_SHORT).show();
        }
    }
}
