package com.example.kurobe.javalog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Human human = new Human("山田太郎", 20, "囲碁");
        human.say();
        human.think();

        Human human2 = new Human("山田よしお", 30, "将棋");
        human2.say();
        human2.think();


    }




}
