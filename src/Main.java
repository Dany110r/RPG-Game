public class Main {
    public static void main(String[] args) {

        Warrior warrior = new Warrior("Dani", 30, 5 ,1, 10, 10);
        Mage mage = new Mage("Alex", 20, 30, 1, 10, 10);
        Rogue rogue = new Rogue("Rogue",20, 10, 1, 10, 10);

        warrior.attack(mage);
        warrior.war();
        mage.defend(warrior);
        rogue.Steal(mage);
        rogue.attack(mage);
        mage.castDoubleSpell(warrior, rogue);
    }
}
