package com.samhoho.simple_social_app.race_condition.solution;

import com.samhoho.simple_social_app.race_condition.RaceConditionMain;

import java.util.logging.Logger;

public class ConsumerSync extends Thread {
    private Logger log = Logger.getLogger(ConsumerSync.class.getName());

    public ConsumerSync(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (RaceConditionMain.list) {
                if (RaceConditionMain.list.size() > 0) {
                    int x = RaceConditionMain.list.get(0);
                    RaceConditionMain.list.remove(0);
                    log.info("Consumer " + Thread.currentThread().getName() +
                            " removed value " + x);
                }
            }
        }
    }
}
