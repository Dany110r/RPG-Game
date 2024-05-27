public class Rogue extends Character{
    int agility;
    int dexterity;

    public Rogue(String name, int health, int mana, int level, int agility, int dexterity) {
        super(name, health, mana, level);
        this.agility = agility;
        this.dexterity = dexterity;
    }

    public void Steal(Character c)
    {
        System.out.println(this.name + " stole from " + c.name);
    }
}
