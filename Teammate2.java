/**
 * Write a description of class Teammate2 here.
 * This subclass has the variable for the teammate2 subclass and the values they return for each of the stats for this type of character.
 *
 * @author (Mohan Shyam Murugan)
 * @version (Version 1)
 */

public class Teammate2 extends Teammate_Class {
    private double rage;
    private int samBoost;
    /**
     * Constructor for objects of class Teammate_Class
     *
     * @param health
     * @param energy
     * @param name
     */

    /**
     * Constructor for objects of class Teammate2
     */
    public Teammate2(int health, int energy, String name) {
        super(health, energy, name);
        rage=0;
        samBoost=0;
    }

    /**
     * This method returns the powerUp value in the superclass.
     */
    public int powerUp() {
        samBoost=(int) (Math.random() * (10 - 1)) + 1;
        return (super.powerUp()+samBoost);
    }

    /**
     * The method does a calculation for the PunchHealthH method and refines the result returned by using the instance variable.
     */
    public int PunchHealthH(Mercenary_Class m) {
        // put your code here
        double val = 50;
        if (m.getHealth() > 600) {
            rage = val * 1.5;
        } else {
            rage = val;
        }
        m.setHealth((int) (m.getHealth() - rage));
        return m.getHealth();
    }

    /**
     * The method does a calculation for the KickHealthH method and refines the result returned by using the instance variable.
     */
    public int KickHealthH(Mercenary_Class m) {
        // put your code here
        double val = 40;
        if (m.getHealth() > 600) {
            rage = val * 1.5;
        } else {
            rage = val;
        }
        m.setHealth((int) (m.getHealth() - rage));
        return m.getHealth();
    }

    /**
     * The method does a calculation for the Combo method and refines the result returned.
     */
    public int Combo(Mercenary_Class m) {
        // put your code here
        m.setHealth(m.getHealth() - 90);
        return m.getHealth();
    }
}
