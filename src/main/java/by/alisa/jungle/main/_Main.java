package by.alisa.jungle.main;

import by.alisa.jungle.model.Lion;
import by.alisa.jungle.util.EventProducer;

public class _Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        EventProducer eventProducer = new EventProducer();
        eventProducer.acctivateEvent(lion);
    }
}
