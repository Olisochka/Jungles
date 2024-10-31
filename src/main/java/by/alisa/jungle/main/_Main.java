package by.alisa.jungle.main;

import by.alisa.jungle.model.Lion;
import by.alisa.jungle.util.EventProducer;

public class _Main {
    public static void main(String[] args) throws InterruptedException {
        Lion lion = new Lion();
        EventProducer eventProducer = new EventProducer();
        eventProducer.acctivateEvent(lion);
        int x = 0;
        while (x < 10000) {
            System.out.println(x);
            Thread.sleep(1000);
            x = x + 1;
        }
    }

}
