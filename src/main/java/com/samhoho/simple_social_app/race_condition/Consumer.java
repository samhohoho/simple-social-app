package com.samhoho.simple_social_app.race_condition;

import java.util.logging.Logger;

public class Consumer extends Thread {
    private Logger log = Logger.getLogger(Consumer.class.getName());

    public Consumer(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            if (RaceConditionMain.list.size() > 0) {
                int x = RaceConditionMain.list.get(0);
                RaceConditionMain.list.remove(0);
                log.info("Consumer " + Thread.currentThread().getName() +
                        " removed value " + x);
            }
        }
    }
}
