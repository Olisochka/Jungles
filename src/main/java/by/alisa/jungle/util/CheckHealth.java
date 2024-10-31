package by.alisa.jungle.util;

import by.alisa.jungle.model.Lion;

public class CheckHealth {
    public int checkHealth(Lion lion) {
        int health = lion.getHealth();
        if (health > 100) {
            health = 100;
            return health;
        } else if (health < 0) {
            health = 0;
            System.out.println("Лев умер.");
        }
        return health;
    }
}
