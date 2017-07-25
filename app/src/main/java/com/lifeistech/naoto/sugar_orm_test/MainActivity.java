package com.lifeistech.naoto.sugar_orm_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.orm.SugarRecord;

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

    public void learn(View view){
        //buttonが押された時の処理
        japanese = editText1.getText().toString();
        english = editText2.getText().toString();
        Two_words2 two_words = new Two_words2(japanese,english);
        two_words.save();
        Log.d("test","learn is ok");
    }

    public void add2(View view){
        SugarRecord.listAll(Two_words2.class);
        Two_words2 two_words = Two_words2.findById(Two_words2.class, 1);
        Log.d("test1",two_words.japanese);
        Log.d("test2",two_words.english);
        textView1.setText(two_words.japanese);
        textView2.setText(two_words.english);
    }

    public void delete(View view){
        Two_words2.deleteAll(Two_words2.class);
    }
}
