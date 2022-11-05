import javax.swing.JOptionPane;

/**
 * Write a description of class Weapon_Class here.
 * This class creates the weapons for both the mercenary and hero.
 *
 * @author (Mohan Shyam Murugan)
 * @version (Version 1)
 */

public class Weapon_Class {
    // instance variables - replace the example below with your own
    private int ammo;

    /**
     * Constructor for objects of class Weapon_Class
     */
    public Weapon_Class(int ammo) {
        // initialise instance variables
        this.ammo = ammo;

    }

    /**
     * This method sets the health of the mercenary depending on the weapon used.
     */
    public int WeaponHealthHero(String weapon, Mercenary_Class m) {
        if (weapon.equals("Pistol")) {
            m.setHealth(m.getHealth() - 70);

        } else if (weapon.equals("Machine Gun")) {
            m.setHealth(m.getHealth() - 150);

        } else if (weapon.equals("Grenade Launcher")) {
            m.setHealth(m.getHealth() - 200);

        } else {
            JOptionPane.showInputDialog("You have chosen an invalid weapon.Please choose a valid one.");
        }

        return m.getHealth();
    }

    /**
     * This method sets the health of the hero depending on the weapon used.
     */
    public int WeaponHealthMercenary(String weapon, Hero_Class h) {
        if (weapon.equals("Pistol")) {
            h.setHealth(h.getHealth() - 70);


        } else if (weapon.equals("Machine Gun")) {
            h.setHealth(h.getHealth() - 150);


        } else if (weapon.equals("Grenade Launcher")) {
            h.setHealth(h.getHealth() - 200);


        } else {
            JOptionPane.showInputDialog("You have chosen an invalid weapon.Please choose a valid one.");
        }

        return h.getHealth();
    }
}