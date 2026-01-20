package com.samhoho.simple_social_app.memory_leak;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MemoryLeakMain {
    private static List<Cat> list = new ArrayList<>();

    public static void simulate() {
        while (true) {
            list.add(new Cat(new Random().nextInt(10)));
        }
    }

    public static class Cat {
        private int age;

        public Cat(int age) {
            this.setAge(age);
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
