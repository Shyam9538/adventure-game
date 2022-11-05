/**
 * Write a description of class Teammate_Class here.
 * This superclass has the variable for the teammate subclasses and the values they return for each of the stats for this type of character.
 *
 * @author (Mohan Shyam Murugan)
 * @version (Version 1)
 */


/**
 * The instance variables are declared here.
 */
public class Teammate_Class extends Character_Class {
    // instance variables - replace the example below with your own
    private int powerUp;
    private int plusDamage;

    /**
     * Constructor for objects of class Teammate_Class
     */
    public Teammate_Class(int health, int energy, String name) {
        // initialise instance variables
        super(health, energy, name);
        powerUp=0;
        plusDamage=0;

    }

    /**
     * This method returns the powerUp value
     */
    public int powerUp() {
        powerUp = 50;
        return powerUp;
    }

    /**
     * The method does a calculation for the PunchHealthH method and refines the result returned.
     */
    public int PunchHealthH(Mercenary_Class m) {
        plusDamage = (int) (Math.random() * (20 - 1)) + 1;
        // put your code here
        m.setHealth(m.getHealth() - (30 + plusDamage));
        return m.getHealth();
    }

    /**
     * The method does a calculation for the KickHealthH method and refines the result returned.
     */
    public int KickHealthH(Mercenary_Class m) {
        plusDamage = (int) (Math.random() * (10 - 1)) + 1;
        // put your code here
        m.setHealth(m.getHealth() - (50 + plusDamage));
        return m.getHealth();
    }

    /**
     * The method does a calculation for the Combo method and refines the result returned.
     */
    public int Combo(Mercenary_Class m) {
        // put your code here
        plusDamage = (int) (Math.random() * (10 - 1)) + 1;
        m.setHealth(m.getHealth() - (70 + plusDamage));
        return m.getHealth();
    }

}
