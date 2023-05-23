package efs.task.oop;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Villager> villagers = new ArrayList<>();
        villagers.add(new Villager("Kashya", 30));
        villagers.add(new ExtraordinaryVillager("Akara",40, ExtraordinaryVillager.Skill.SHELTER));
        villagers.add(new Villager("Gheed",50));
        villagers.add(new ExtraordinaryVillager("Deckard Cain",85, ExtraordinaryVillager.Skill.IDENTIFY));
        villagers.add(new Villager("Warivv",35));
        villagers.add(new Villager("Flawia",25));

        for (Villager villager : villagers) {
            villager.sayHello();
        }

        //Villager v1 = new Villager("Kashya", 30);
        //ExtraordinaryVillager v2 = new ExtraordinaryVillager("Akara",40, ExtraordinaryVillager.Skill.SHELTER);
        //Villager v3 = new Villager("Gheed",50);
        //ExtraordinaryVillager v4 = new ExtraordinaryVillager("Deckard Cain",85, ExtraordinaryVillager.Skill.IDENTIFY);
        //Villager v5 = new Villager("Warivv",35);
        //Villager v6 = new Villager("Flawia",25);

        Object objectDeckardCain =villagers.get(3);
        Object objectAkara = villagers.get(1);

        while(Monsters.monstersHealth > 0){
            for (Villager villager : villagers) {
                System.out.println("Aktualnie walczacy osadnik to "+villager.getName());
                if(!(Monsters.andariel.getHealth()<=0)){
                    villager.attack(Monsters.andariel);
                }
                if(!(villager.getHealth()<=0)){
                    Monsters.andariel.attack(villager);
                }
                if(!(Monsters.blacksmith.getHealth()<=0)){
                    villager.attack(Monsters.blacksmith);
                }
                if(!(villager.getHealth()<=0)){
                    Monsters.blacksmith.attack(villager);
                }

            }
            System.out.println("Potwory posiadaja jeszcze "+Monsters.monstersHealth+ "punkty zycia");

        }
        System.out.println("Obozowisko ocalone!");

        //villagers.get(3) = (ExtraordinaryVillager) objectDeckardCain;






    }
}
