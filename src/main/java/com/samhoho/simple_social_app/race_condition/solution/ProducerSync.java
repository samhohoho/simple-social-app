package com.samhoho.simple_social_app.race_condition.solution;

import com.samhoho.simple_social_app.race_condition.RaceConditionMain;

import java.util.Random;
import java.util.logging.Logger;

public class ProducerSync extends Thread {
    private final Logger log = Logger.getLogger(com.samhoho.simple_social_app.race_condition.Producer.class.getName());

    public ProducerSync(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true) {
            synchronized (RaceConditionMain.list) {
                if (RaceConditionMain.list.size() < 100) {
                    int x = r.nextInt();
                    RaceConditionMain.list.add(x);
                    log.info("Producer " + Thread.currentThread().getName() +
                            " added value " + x);
                }
            }
        }
    }
}
