package com.samhoho.simple_social_app.race_condition;

import com.samhoho.simple_social_app.race_condition.solution.ConsumerSync;
import com.samhoho.simple_social_app.race_condition.solution.ProducerSync;

import java.util.ArrayList;
import java.util.List;

public class RaceConditionMain {
    public static List<Integer> list = new ArrayList<>();

    public static void simulate() {
        new Producer("_Produce 1").start();
        new Producer("_Produce 2").start();
        new Consumer("_Consumer 1").start();
        new Consumer("_Consumer 2").start();
    }

    public static void solve() {
        new ProducerSync("_Produce 1").start();
        new ProducerSync("_Produce 2").start();
        new ConsumerSync("_Consumer 1").start();
        new ConsumerSync("_Consumer 2").start();
    }
}
