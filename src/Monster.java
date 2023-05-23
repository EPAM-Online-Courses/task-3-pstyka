public abstract class Monster implements Fighter {
    protected int health;
    private int damage;

    public Monster(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public  int getHealth() {
        return health;
    }
}
