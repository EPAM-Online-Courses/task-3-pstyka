//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

//package efs.task.oop;

public class ExtraordinaryVillager extends Villager {
    Skill skill;

    public ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill = skill;
    }

    public Skill getSkill() {
        return this.skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void sayHello() {

        System.out.println("Greetings traveler... I'm " + this.getName() + " and I'm " + this.getAge() + " years old. " + this.skill.getDesc());
    }

    public void attack(Fighter victim) {
        victim.takeHit(0);
    }

    public void takeHit(int damage) {
        this.health = 0;
    }

    public static enum Skill {
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        private String desc;

        private Skill(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return this.desc;
        }
    }
}
