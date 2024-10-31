package by.alisa.jungle.util;

import by.alisa.jungle.model.Lion;

public class EventProducer {
    public void acctivateEvent(Lion lion) {
        while (checkStatus(lion)) {
            int eventNumber = (int) (Math.random() * 100);
            if (eventNumber >= 0 && eventNumber < 15) {
                sleepEvent(lion);
            } else if (eventNumber >= 15 && eventNumber < 25) {
                play(lion);
            } else if (eventNumber >= 15 && eventNumber < 25) {
                lionEatZebra(lion);
            } else if (eventNumber >= 25 && eventNumber < 35) {
                lionEatRhino(lion);
            } else if (eventNumber >= 35 && eventNumber < 45) {
                lionAttackedHunter(lion);
            } else if (eventNumber >= 45 && eventNumber < 50) {
                lionfight(lion);
            } else if (eventNumber >= 50 && eventNumber < 60) {
                lionDrinkWater(lion);
            } else if (eventNumber >= 60 && eventNumber < 70) {
                lionSwim(lion);
            } else if (eventNumber >= 70 && eventNumber < 80) {
                lionRelax(lion);
            } else if (eventNumber >= 90 && eventNumber < 100) {
                lionWatchDesert(lion);
            }
            int x = 0;
            while (x < 10000) {
                System.out.println(x);
                Thread.sleep(1000);
                x = x + 1;
            }
        }
    }

    public int checkEnergy(Lion lion) {
        int energy = lion.getEnergy();
        if (energy > 100) {
            energy = 100;
        } else if (energy < 0) {
            energy = 0;
        }
        return energy;
    }

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

    private void sleepEvent(Lion lion) {
        int energy = lion.getEnergy();
        energy = energy + 20;
        checkEnergy(energy);
        lion.setEnergy(energy);
        System.out.println("Лев поспал  + 20 энергии. Текущая энергия: " + lion.getEnergy());
    }

    private void play(Lion lion) {
        int energy = lion.getEnergy();
        int health = lion.getHealth();
        energy = energy - 5;
        checkEnergy(energy);
        lion.setHealth(energy);
        health = health + 7;
        checkHealth(health);
        lion.setHealth(health);
        System.out.println("Лев поиграл  - 5 энергии + 7 здоровья. Текущая энергия: " + lion.getEnergy() + " Текущее здоровье: " + lion.getHealth());
    }

    private void lionEatZebra(Lion lion) {
        int energy = lion.getEnergy();
        int health = lion.getHealth();
        energy = energy - 7;
        checkEnergy();
        health = health + (int) (lion.Fangs() * 5);
        checkHealth(health);
        lion.setEnergy(energy);
        lion.setHealth(health);
        System.out.println("Лев съел зебру - 7 энергии + " + health + "здоровья. Текущая энергия: " + lion.getEnergy() + "Текущее здоровье: " + lion.getHealth());
    }

    private void lionEatRhino(Lion lion) {
        int energy = lion.getEnergy();
        int health = lion.getHealth();
        energy = energy - 10;
        checkEnergy(energy);
        health = health + (int) (Lion.Fangs() * 8);
        checkHealth(health);
        lion.setEnergy(energy);
        lion.setHealth(health);
        System.out.println("Лев съел носорога - 14 энергии + " + health + "здоровья. Текущая энергия: " + lion.getEnergy() + "Текущее здоровье: " + lion.getHealth());
    }

    private void lionAttackedHunter(Lion lion) {
        int energy = lion.getEnergy();
        int health = lion.getHealth();
        energy = energy - 15;
        checkEnergy(energy);
        health = health - 15;
        checkHealth(health);
        lion.setEnergy(energy);
        lion.setHealth(health);
        System.out.println("На Льва напал охотник - 7 энергии - 15 здоровья. Текущая энергия: " + lion.getEnergy() + "Текущее здоровье: " + lion.getHealth());
    }

    private void lionfight(Lion lion) {
        int energy = lion.getEnergy();
        int health = lion.getHealth();
        energy = energy - 7;
        checkEnergy(energy);
        health = health - 7;
        checkHealth(health);
        lion.setEnergy(energy);
        lion.setHealth(health);
        System.out.println("Лев подрался- 7 энергии - 7 здоровья. Текущая энергия: " + lion.getEnergy() + "Текущее здоровье: " + lion.getHealth());
    }

    private void lionDrinkWater(Lion lion) {
        int energy = lion.getEnergy();
        int health = lion.getHealth();
        energy = energy - 2;
        checkEnergy(energy);
        health = health + (int) (lion.getFangs() * 4);
        checkHealth(health);
        lion.setEnergy(energy);
        lion.setHealth(health);
        System.out.println("Лев попил воды - 2 энергии + " + health + "здоровья. Текущая энергия: " + lion.getEnergy() + "Текущее здоровье: " + lion.getHealth());
    }

    private void lionSwim(Lion lion) {
        int energy = lion.getEnergy();
        int health = lion.getHealth();
        energy = energy - 3;
        checkEnergy(energy);
        health = health + (int) (lion.getFangs() * 2);
        checkHealth(health);
        lion.setEnergy(energy);
        lion.setHealth(health);
        System.out.println("Лев поплавал - 3 энергии + " + health + "здоровья. Текущая энергия: " + lion.getEnergy() + "Текущее здоровье: " + lion.getHealth());
    }

    private void lionRelax(Lion lion) {
        int energy = lion.getEnergy();
        int health = lion.getHealth();
        energy = energy + 10;
        checkEnergy(energy);
        lion.setEnergy(energy);
        System.out.println("Лев отдохнул + 10 энергии + " + health + "здоровья. Текущая энергия: " + lion.getEnergy() + "Текущее здоровье: " + lion.getHealth());
    }

    private void lionWatchDesert(Lion lion) {
        int energy = lion.getEnergy();
        int health = lion.getHealth();
        energy = energy - 2;
        checkEnergy(energy);
        health = health - 2;
        checkHealth(health);
        lion.setEnergy(energy);
        lion.setHealth(health);
        System.out.println("Лев посмотрел на пустыню - 2 энергии - 2 здоровья. Текущая энергия: " + lion.getEnergy() + "Текущее здоровье: " + lion.getHealth());
    }
}
}
