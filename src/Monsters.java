public class Monsters{

    static final Monster andariel = new Monster(10,70) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(this.getDamage());
        }

        @Override
        public void takeHit(int damage) {
            andariel.health -= damage;
            monstersHealth -= damage;
        }
        @Override
        public  int getHealth() {
            return health;
        }
    };
    static final Monster blacksmith = new Monster(100,25) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(this.getDamage());
        }

        @Override
        public void takeHit(int damage) {
            andariel.health -= (5+damage);
            monstersHealth -= (5+damage);
        }

    };
    public static int monstersHealth = andariel.getHealth()+blacksmith.getHealth();

    public static int getMonstersHealth() {
        return monstersHealth;
    }

}
