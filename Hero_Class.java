/**
 * Write a description of class Hero_Class here.
 *This class has the variable for the hero class and the values they return for each of the stats for this type of character.
 * @author (Mohan Shyam Murugan)
 * @version (Version 1)
 */
public class Hero_Class extends Character_Class {
    // instance variables - replace the example below with your own
    private int luck;
    private int attackBoost;

    /**
     * Constructor for objects of class Hero_Class
     */
    public Hero_Class(int health, int energy) {
        super(health, energy, "Nathan Drake");
        luck=0;
        attackBoost=0;
    }

    /**
     * This method returns the luck value
     */
    public String getLuck() {
        luck = (int) (Math.random() * (5 - 1)) + 1;
        return Integer.toString(luck);
        //return;
    }

    /**
     * This method returns the health of the hero
     */
    public int getHealth(Hero_Class h) {
        return h.getHealth();
    }

    /**
     * This method returns the energy of the hero
     */
    public int getEnergy(Hero_Class h) {
        return h.getEnergy();
    }

    /**
     * This method returns the health of the mercenary after the hero punches
     */
    public int PunchHealthH(Mercenary_Class m) {
        // put your code here
        attackBoost = (int) (Math.random() * (50 - 1)) + 1;
        m.setHealth(m.getHealth() - 90 - attackBoost);
        return m.getHealth();
    }

    /**
     * This method returns the health of the mercenary after the hero kicks
     */
    public int KickHealthH(Mercenary_Class m) {
        // put your code here
        attackBoost = (int) (Math.random() * (50 - 1)) + 1;
        m.setHealth(m.getHealth() - 120 - attackBoost);
        return m.getHealth();
    }

    /**
     * This method returns the energy of the hero after the hero punches
     */
    public int PunchEnergyH(Hero_Class h) {
        // put your code here

        h.setEnergy(h.getEnergy() - 100);
        return h.getEnergy();
    }

    /**
     * This method returns the energy of the hero after the hero kicks
     */
    public int KickEnergyH(Hero_Class h) {
        // put your code here
        h.setEnergy(h.getEnergy() - 130);
        return h.getEnergy();
    }
}
