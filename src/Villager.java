public class Villager implements Fighter{
    private String name;
    private int age;
    protected int health;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
        this.health = 100;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public  void sayHello(){
        System.out.println("Greetings traveller... I'm "+getName()+" and I'm "+getAge()+" years old");
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit((int) ((100 - age * 0.5) / 10));
    }

    @Override
    public void takeHit(int damage) {
        this.health -= damage;
    }
}
