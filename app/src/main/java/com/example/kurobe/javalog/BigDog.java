package com.example.kurobe.javalog;

/**
 * Created by kurobe on 2017/06/27.
 */
import android.util.Log;

public class BigDog extends Dog {
    static String to_jp = "大型犬";

    public BigDog (String name, int age) {
        super(name, age);
    }

    public static void introduce() {
        Log.d("javatest", "これは大型犬クラスです。");
    }
}
