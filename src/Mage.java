public class Mage extends Character {

    int inteligence;
    int spellpower;

    public Mage(String name, int health, int mana, int level, int inteligence, int spellpower) {
        super(name, health, mana, level);
        this.inteligence = inteligence;
        this.spellpower = spellpower;
    }

    public void castDoubleSpell(Character a, Character b)
    {
        System.out.println(this.name + " casted a spell on " + a.name + " and " + b.name);
    }
}
