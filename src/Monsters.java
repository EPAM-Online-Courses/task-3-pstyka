//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package efs.task.oop;
public class Monsters {
    static final Monster andariel = new Monster(10, 70) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(this.getDamage());
        }
        @Override
        public void takeHit(int damage) {
            health -= damage;
            Monsters.monstersHealth -= damage;
        }
        @Override
        public int getHealth() {
            return this.health;
        }
    };
    static final Monster blacksmith = new Monster(100, 25) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(this.getDamage());
        }
        @Override
        public void takeHit(int damage) {
            health -= 5 + damage;
            Monsters.monstersHealth -= 5 + damage;
        }
    };
    public static int monstersHealth = andariel.getHealth() + blacksmith.getHealth();;

    public static int getMonstersHealth() {
        return monstersHealth;
    }
}
