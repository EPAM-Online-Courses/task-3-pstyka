//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package efs.task.oop;
import java.io.PrintStream;

public class Villager implements Fighter {
    private String name;
    private int age;
    protected int health;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
        this.health = 100;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHealth() {
        return this.health;
    }

    public void sayHello() {
       System.out.println("Greetings traveler... I'm " + this.getName() + " and I'm " + this.getAge() + " years old");
    }

    public void attack(Fighter victim) {
        victim.takeHit((int)((100.0 - (double)this.age * 0.5) / 10.0));
    }

    public void takeHit(int damage) {
        this.health -= damage;
    }
}
