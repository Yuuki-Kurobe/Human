package com.example.kurobe.javalog;

/**
 * Created by kurobe on 2017/06/27.
 */
import android.util.Log;
class Human extends Animal implements Thinkable {

    String hobby;

    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。歳は" + this.age + "歳です。");
    }
    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }

}
