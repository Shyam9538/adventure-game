/**
 * Write a description of class Teammate3 here.
 * This subclass has the variable for the teammate3 subclass and the values they return for each of the stats for this type of character.
 *
 * @author (Mohan Shyam Murugan)
 * @version (Version 1)
 */

public class Teammate3 extends Teammate_Class {

    /**
     * Constructor for objects of class Teammate_Class
     *
     * @param health
     * @param energy
     * @param name
     */
    private double extraDamage;
    private int chloeBoost;

    /**
     * Constructor for objects of class Teammate3
     */
    public Teammate3(int health, int energy, String name) {
        super(health, energy, name);
        extraDamage=0;
        chloeBoost=0;
    }

    /**
     * This method returns the powerUp value in the superclass.
     */
    public int powerUp() {
        chloeBoost=(int) (Math.random() * (30 - 1)) + 1;
        return (super.powerUp()+chloeBoost);
    }

    /**
     * The method does a calculation for the PunchHealthH method and refines the result returned by using the instance variable.
     */
    public int PunchHealthH(Mercenary_Class m) {
        double val = 40;
        if (m.getEnergy() < 200) {
            extraDamage = val * 1.2;
        } else {
            extraDamage = val;
        }
        m.setHealth((int) (m.getHealth() - extraDamage));
        return m.getHealth();
    }

    /**
     * The method does a calculation for the KickHealthH method and refines the result returned by using the instance variable.
     */
    public int KickHealthH(Mercenary_Class m) {
        // put your code here
        double val = 50;
        if (m.getEnergy() < 200) {
            extraDamage = val * 1.2;
        } else {
            extraDamage = val;
        }
        m.setHealth((int) (m.getHealth() - extraDamage));
        return m.getHealth();
    }

    /**
     * The method does a calculation for the Combo method and refines the result returned by using the instance variable.
     */
    public int Combo(Mercenary_Class m) {
        // put your code here
        double val = 70;
        if (m.getEnergy() < 200) {
            extraDamage = val * 1.2;
        } else {
            extraDamage = val;
        }
        m.setHealth((int) (m.getHealth() - extraDamage));
        return m.getHealth();
    }
}
