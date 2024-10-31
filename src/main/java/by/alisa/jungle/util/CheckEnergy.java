package by.alisa.jungle.util;

import by.alisa.jungle.model.Lion;

public class CheckEnergy {
    public int checkEnergy(Lion lion) {
        int energy = lion.getEnergy();
        if (energy > 100) {
            energy = 100;
        } else if (energy < 0) {
            energy = 0;
        }
        return energy;
    }
}
