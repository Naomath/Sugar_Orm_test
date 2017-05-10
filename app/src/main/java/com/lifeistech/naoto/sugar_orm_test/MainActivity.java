package com.lifeistech.naoto.sugar_orm_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //このアプリはSugarORMのテストをやる
    //何か入れてそれをボタンで出すようにする
    TextView textView1;
    TextView textView2;
    EditText editText1;
    EditText editText2;
    String japanese;
    String english;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        editText1 = (EditText)findViewById(R.id.editText2);
        editText2 = (EditText)findViewById(R.id.editText);
    }

    public void add(View view){
        //buttonが押された時の処理
        japanese = editText1.getText().toString();
        english = editText2.getText().toString();
        Two_words two_words = new Two_words(japanese,english);
        two_words.save();
    }

    public void add2(View view){
        Two_words two_words = Two_words.findById(Two_words.class, 0L);
        textView1.setText(two_words.japanese);
        textView2.setText(two_words.english);
    }
}
