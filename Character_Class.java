/**
 * Write a description of class Character_Class here.
 * This superclass has the variables for the character class and the values they return for each of the stats for this type of character.
 *
 * @author (Mohan Shyam Murugan)
 * @version (Version 1)
 */
public class Character_Class {
    // instance variables - replace the example below with your own
    private int health;
    private int energy;
    private String name;

    /**
     * Constructor for objects of class Move_Class
     */
    public Character_Class(int health, int energy, String name) {
        this.health = health;
        this.energy = energy;
        this.name = name;
    }

    /**
     * This method sets the health of the character
     */
    public void setHealth(int n) {
        health = n;
    }

    /**
     * This method sets the energy of the character
     */
    public void setEnergy(int n) {
        energy = n;
    }

    /**
     * This method sets the name of the character
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * This method gets the health of the character
     */
    public int getHealth() {
        return health;
    }

    /**
     * This method gets the energy of the character
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * This method gets the name of the character
     */
    public String getName() {
        return name;
    }

    /**
     * This method returns the health of the mercenary after the hero punches
     */
    public int PunchHealthH(Mercenary_Class c) {
        health = health - 30;
        return health;
    }

    /**
     * This method returns the energy of the hero after the hero punches
     */
    public int PunchEnergyH(Hero_Class c) {
        energy = energy - 40;
        return energy;
    }

    /**
     * This method returns the health of the mercenary after the hero kicks
     */
    public int KickHealthH(Mercenary_Class c) {
        health = health - 80;
        return health;
    }

    /**
     * This method returns the energy of the hero after the hero kicks
     */
    public int KickEnergyH(Hero_Class c) {
        energy = energy - 90;
        return energy;
    }

    /**
     * This method returns the health of the hero after the mercenary punches
     */
    public int PunchHealthM(Hero_Class c) {
        health = health - 30;
        return health;
    }

    /**
     * This method returns the energy of the mercenary after the mercenary punches
     */
    public int PunchEnergyM(Mercenary_Class c) {
        energy = energy - 40;
        return energy;
    }

    /**
     * This method returns the health of the hero after the mercenary kicks
     */
    public int KickHealthM(Hero_Class c) {
        health = health - 80;
        return health;
    }

    /**
     * This method returns the energy of the mercenary after the mercenary punches
     */
    public int KickEnergyM(Mercenary_Class c) {
        energy = energy - 90;
        return energy;
    }

    /**
     * This method returns the health of the mercenary after the combo move is used
     */
    public int Combo(Mercenary_Class c) {
        health = health - 130;
        return health;
    }

}
