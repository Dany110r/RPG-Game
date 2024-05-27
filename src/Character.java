public class Character {
    String name;
    int health;
    int mana;
    int level;

    public Character(String name, int health, int mana, int level) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.level = level;
    }

    public void attack(Character character) {
        System.out.println(this.name + " attacked " + character.name);
    }

    public void defend(Character character) {
        System.out.println(this.name + " defended against " + character.name);
    }

    public void castSpell(Character character) {
        System.out.println(this.name + " casted a spell on " + character.name);
    }

    public void levelUp() {
        level++;
        System.out.println(this.name + " leveled up!");
    }
}
