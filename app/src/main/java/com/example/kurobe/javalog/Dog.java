package com.example.kurobe.javalog;

/**
 * Created by kurobe on 2017/06/27.
 */
import android.util.Log;

class Dog extends Animal implements Movable {
    static String to_jp = "犬";

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void introduce() {
        Log.d("javatest", "これは犬クラスです。");
    }
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳）" + "「ワンワン」");
    }
    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳）" + "は全力で走った。");
    }
}
