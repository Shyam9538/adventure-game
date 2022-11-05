/**
 * Write a description of class Mercenary_Class here.
 * This class has the variable for the mercenary class and the values they return for each of the stats for this type of character.
 *
 * @author (Mohan Shyam Murugan)
 * @version (Version 1)
 */
public class Mercenary_Class extends Character_Class {
    // instance variables - replace the example below with your own
    private boolean dead;
    private int energyBoost;

    /**
     * Constructor for objects of class Mercenary_Class
     */
    public Mercenary_Class(int health, int energy) {
        // initialise instance variables
        super(health, energy, "Mercenary");
        dead = false;
        energyBoost=0;
    }

    /**
     * This method returns the getDead value
     */
    public boolean getDead() {
        return dead;
        //return;
    }

    /**
     * This method returns the health value
     */
    public int getHealth(Mercenary_Class m) {
        return m.getHealth();
    }

    /**
     * This method returns the energy value
     */
    public int getEnergy(Mercenary_Class m) {
        return m.getEnergy();
    }

    /**
     * This method returns the health of the hero after the mercenary kicks
     */
    public int KickHealthM(Hero_Class h) {
        // put your code here
        h.setHealth(h.getHealth() - 160);
        return h.getHealth();
    }

    /**
     * This method returns the energy of the mercenary after the mercenary kicks
     */
    public int KickEnergyM(Mercenary_Class m) {
        // put your code here
        m.setEnergy(m.getEnergy() - 100);
        return m.getEnergy();
    }

    /**
     * This method returns random health boost
     */
    public int Boost(Mercenary_Class m) {
        // put your code here
        energyBoost = (int) (Math.random() * (50 - 1)) + 1;
        m.setEnergy(m.getEnergy() + energyBoost);
        return m.getEnergy();
    }

}
