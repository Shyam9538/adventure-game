/**
 * Write a description of class Teammate1 here.
 * This subclass has the variable for the teammate1 subclass and the values they return for each of the stats for this type of character.
 *
 * @author (Mohan Shyam Murugan)
 * @version (Version 1)
 */

public class Teammate1 extends Teammate_Class {
    /**
     * Constructor for objects of class Teammate_Class
     *
     * @param health
     * @param energy
     * @param name
     */
    private int comboTakedown;
    private int elenaBoost;

    /**
     * Constructor for objects of class Teammate1
     */
    public Teammate1(int health, int energy, String name) {
        super(health, energy, name);
        comboTakedown=0;
        elenaBoost=0;

    }

    /**
     * This method returns the powerUp value in the superclass.
     */
    public int powerUp() {
        elenaBoost=(int) (Math.random() * (20 - 1)) + 1;
        return (super.powerUp()+elenaBoost);
    }

    /**
     * The method does a calculation for the PunchHealthH method and refines the result returned.
     */
    public int PunchHealthH(Mercenary_Class m) {
        // put your code here
        m.setHealth(m.getHealth() - 30);
        return m.getHealth();
    }

    /**
     * The method does a calculation for the KickHealthH method and refines the result returned.
     */
    public int KickHealthH(Mercenary_Class m) {
        // put your code here
        m.setHealth(m.getHealth() - 60);
        return m.getHealth();
    }

    /**
     * The method does a calculation for the Combo method and refines the result returned by using the instance variable.
     */
    public int Combo(Mercenary_Class m) {
        // put your code here
        int val = 40;
        if (m.getHealth() > 800) {
            comboTakedown = val * 2;
        } else {
            comboTakedown = val;
        }
        m.setHealth((int) (m.getHealth() - comboTakedown));
        return m.getHealth();
    }
}
