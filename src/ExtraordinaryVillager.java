package efs.task.oop;
public class ExtraordinaryVillager extends Villager{

    Skill skill;
    public ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill = skill;
    }


    public enum Skill{
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");
        private String desc;
        Skill(String desc) {
            this.desc = desc;
        }
        public String getDesc() {
            return desc;
        }
    }

    public Skill getSkill() {
        return skill;
    }
    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    @Override
    public  void sayHello(){
        System.out.println("Greetings traveller... I'm "+getName()+" and I'm "+getAge()+" years old. "+skill.getDesc());
    }
    @Override
    public void attack(Fighter victim) {
        victim.takeHit(0);
    }
    @Override
    public void takeHit(int damage) {
        this.health = 0;
    }
}
