//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
//package efs.task.oop;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Villager> villagers = new ArrayList();
        villagers.add(new Villager("Kashya", 30));
        villagers.add(new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER));
        villagers.add(new Villager("Gheed", 50));
        villagers.add(new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY));
        villagers.add(new Villager("Warriv", 35));
        villagers.add(new Villager("Flawia", 25));

        for(Villager v: villagers) {
            v.sayHello();
        }

        Object objectDeckardCain = villagers.get(3);
        Object objectAkara = villagers.get(1);
        int i = 0;
        Villager villager;
        while (Monsters.monstersHealth > 0) {
                if(i==5){
                    i=0;
                }
                villager = villagers.get(i);
                System.out.println("Aktualnie walczacy osadnik to " + villager.getName());
                if (Monsters.andariel.getHealth() > 0) {
                    villager.attack(Monsters.andariel);
                }

                if (villager.getHealth() > 0) {
                    Monsters.andariel.attack(villager);
                }

                if (Monsters.blacksmith.getHealth() > 0) {
                    villager.attack(Monsters.blacksmith);
                }

                if (villager.getHealth() > 0) {
                    Monsters.blacksmith.attack(villager);
                }
                i+=1;
                System.out.println("Potwory posiadaja jeszcze " + Monsters.monstersHealth + "punkty zycia");
            }

        objectDeckardCain = (ExtraordinaryVillager) villagers.get(3);
        objectAkara = (ExtraordinaryVillager)villagers.get(1);

        System.out.println("Obozowisko ocalone!");
    }
}
