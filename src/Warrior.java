public class Warrior extends Character{

    int strength;
    int armor;

    public Warrior(String name, int health, int mana, int level, int strength, int armor) {
        super(name, health, mana, level);
        this.strength = strength;
        this.armor = armor;
    }

    public void war()
    {
        System.out.println(this.name + " started a war");
    }
}
