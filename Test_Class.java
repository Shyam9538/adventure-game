/*import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;*/
import javax.swing.JOptionPane;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Write a description of class Test_Class here.
 * This class contains all the methods for the game to function. It also has the main.
 *
 * @author (Mohan Shyam Murugan)
 * @version (Version 1)
 */
public class Test_Class {
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Test_Class
     */
    public Test_Class() {
        // initialise instance variables
        x = 0;
    }

    /**
     * The method asks the user to enter an input for the player's health.
     */
    public static Hero_Class chooseHero() {

        int health = 0;
        while (!(health >= 500 & health <= 1000)) {
            try {
                health = Integer.parseInt(JOptionPane.showInputDialog("Please choose the health for the hero. It must be an integer between 500 and 1000."));
                if (health >= 500 & health <= 1000) {
                } else {

                    JOptionPane.showMessageDialog(null, "You have chosen an invalid health option. Please choose a valid health option.");
                }
            }
            //else {
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You have chosen an invalid health option. Please choose a valid health option.");
                //}
            }
        }
        JOptionPane.showMessageDialog(null, "Hero Health: " + health);
        return new Hero_Class(health, 500);
    }

    /**
     * The method asks the user to enter an input for the enemy's health.
     */
    public static Mercenary_Class Mercenary() {

        int health = 0;
        while (!(health >= 500 & health <= 1000)) {
            try {
                health = Integer.parseInt(JOptionPane.showInputDialog("Please choose the health for the mercenaries. It must be an integer between 500 and 1000."));
                if (health >= 500 & health <= 1000) {
                } else {

                    JOptionPane.showMessageDialog(null, "You have chosen an invalid health option. Please choose a valid health option.");
                }
            }
            //else {
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You have chosen an invalid health option. Please choose a valid health option.");
                //}
            }
        }
        JOptionPane.showMessageDialog(null, "Mercenary Health: " + health);
        return new Mercenary_Class(health, 500);
    }


    public static void fileOutput() throws IOException {
        try {
            File myFile1 = new File("Character.txt");

            BufferedReader br = new BufferedReader(new FileReader(myFile1));
            String st;
            while ((st = br.readLine()) != null) {
                JOptionPane.showMessageDialog(null, st);
            }
        } catch (IOException e) {

        }
    }

    public static void fileInput() throws IOException {
        try {
            File openFile = new File("Results.txt");
            Desktop desktop = Desktop.getDesktop();
            desktop.open(openFile);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }
    
    /*public static void email() {
       String yesOrNo = "";
        while (!(yesOrNo.equals("Yes") || yesOrNo.equals("yes") || yesOrNo.equals("YES") || yesOrNo.equals("No") || yesOrNo.equals("no") || yesOrNo.equals("NO"))) {
            yesOrNo = JOptionPane.showInputDialog(null, "Would you your results emailed to you so you can strategize and practice?");
            if (yesOrNo.equals("Yes") || yesOrNo.equals("yes") || yesOrNo.equals("YES")) {

                //final String username = "username";
                //final String password = "password";
                String frommail = "adventuregame12@yahoo.com";
                String toemail = JOptionPane.showInputDialog("Please enter your email address:");

                Properties properties = new Properties();
                properties.put("mail.smtp.auth", "true");
                properties.put("mail.smtp.starttls.enable", "true");
                properties.put("mail.smtp.host", "smtp.mail.yahoo.com");
                properties.put("mail.smtp.port", "587");

                Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("adventuregame12@yahoo.com", "gmvshzbvekhidbbn");
                    }
                });
                MimeMessage msg = new MimeMessage(session);
                try {
                    msg.setFrom(new InternetAddress(frommail));
                    msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toemail));
                    msg.setSubject("Adventure game results");

                    Multipart emailContent = new MimeMultipart();

                    MimeBodyPart body = new MimeBodyPart();
                    body.setText("Thank you for playing");
                    MimeBodyPart gameFile = new MimeBodyPart();
                    gameFile.attachFile("Results.txt");

                    emailContent.addBodyPart(body);
                    emailContent.addBodyPart(gameFile);
                    msg.setContent(emailContent);
                    Transport.send(msg);
                    JOptionPane.showMessageDialog(null,"The email has been sent.");
                } catch (MessagingException | IOException e) {
                    JOptionPane.showMessageDialog(null,"There was an error while sending. The game details have been opened on your desktop. ");
                }

                JOptionPane.showMessageDialog(null, "Thank you for playing.");
            } else if (yesOrNo.equals("No") || yesOrNo.equals("no") || yesOrNo.equals("NO")) {
                JOptionPane.showMessageDialog(null, "Thank you for playing.");
            } else {
                JOptionPane.showMessageDialog(null, "You have chosen an invalid option. Please choose either yes or no.");
            }
        }
    }*/

    /**
     * The method is the main method where the game runs.
     */
    public static void main(String args[]) throws IOException {
        JOptionPane.showMessageDialog(null, "You are in the middle of the Amazon rainforest and have almost discovered the treasure.");
        JOptionPane.showMessageDialog(null, "A mercenary is in your way and you must defeat him to reach the treasure.");
        JOptionPane.showMessageDialog(null, "You can kick, punch, call a teammate, use a weapon or use your luck.");
        JOptionPane.showMessageDialog(null, "Good luck!!!");

        String name = "Nathan Drake";
        JOptionPane.showMessageDialog(null, "Nathan Drake: 'My name is " + name + ". Famous explorer, archeologist...'");
        JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Alright kid we've heard that story like a million times. You're gonna tell them we're right over here with that racket you're making.'");
        JOptionPane.showMessageDialog(null, "Nathan Drake: 'Well you're with me so that shouldn't be a problem. We also have Elena and Sam waiting by the boat.'");
        JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Shhhhh. I think we're close. Look at that guy over there he's huge. They don't want us getting to the treasure do they.'");
        JOptionPane.showMessageDialog(null, "Nathan Drake: 'Yeah, they definitely don't. We need to take him out. You wait and call for backup if needed. I'll take care of him.'");

        Character_Class hero = new Hero_Class(chooseHero().getHealth(), 500);
        Character_Class mercenary = new Mercenary_Class(Mercenary().getHealth(), 500);

        Weapon_Class weaponChoice1a = new Weapon_Class(100);
        Weapon_Class weaponChoice2a = new Weapon_Class(100);
        Weapon_Class weaponChoice3a = new Weapon_Class(100);

        Weapon_Class weaponChoice1b = new Weapon_Class(100);
        Weapon_Class weaponChoice2b = new Weapon_Class(100);
        Weapon_Class weaponChoice3b = new Weapon_Class(100);

        Character_Class teammate = new Teammate_Class(500, 500, "");
        Teammate_Class Elena = new Teammate1(500, 500, "Elena Fisher");
        Teammate_Class Sam = new Teammate2(500, 500, "Sam Drake");
        Teammate_Class Chloe = new Teammate3(500, 500, "Chloe Frazer");

        Teammate_Class help;
        help = (Teammate_Class) teammate;
        Hero_Class luckMeter;
        luckMeter = (Hero_Class) hero;
        Mercenary_Class dead;
        dead = (Mercenary_Class) mercenary;
        int ans = 0;
        String choice = "";

        int count = 0;
        ArrayList<Integer> hh = new ArrayList<>();
        ArrayList<Integer> he = new ArrayList<>();
        ArrayList<Integer> mh = new ArrayList<>();
        ArrayList<Integer> me = new ArrayList<>();


        FileWriter myWriter = new FileWriter("Results.txt", true);
        BufferedWriter bw = new BufferedWriter(myWriter);
        PrintWriter out = new PrintWriter(bw);
        new FileOutputStream("Results.txt").close();

        try {
            hh.add(hero.getHealth());
            me.add(mercenary.getEnergy());
            he.add(hero.getEnergy());
            mh.add(mercenary.getHealth());

            out.println("Hero health before fight " + (count) + ": " + hh.get(count));
            out.println("Mercenary energy before fight " + (count) + ": " + me.get(count));
            out.println("Hero energy before fight " + (count) + ": " + he.get(count));
            out.println("Mercenary health before fight " + (count) + ": " + mh.get(count));
            out.flush();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }


        JOptionPane.showMessageDialog(null, "Nathan Drake:'Alright let's do this one last time.'");


        String yesOrNo = "";
        while (!(yesOrNo.equals("Yes") || yesOrNo.equals("yes") || yesOrNo.equals("YES") || yesOrNo.equals("No") || yesOrNo.equals("no") || yesOrNo.equals("NO"))) {
            //try {
            yesOrNo = JOptionPane.showInputDialog(null, "Would you like to read the character bios before starting the game?");
            if (yesOrNo.equals("Yes") || yesOrNo.equals("yes") || yesOrNo.equals("YES")) {
                fileOutput();

            } else if (yesOrNo.equals("No") || yesOrNo.equals("no") || yesOrNo.equals("NO")) {
                JOptionPane.showMessageDialog(null, "You have chosen to not view the file.");
            }
            //}
            // catch (Exception e) {
            else {
                JOptionPane.showMessageDialog(null, "You have chosen an invalid option. Please choose either yes or no.");
            }
            //}
        }


        while (!(hero.getEnergy() <= 0) || (hero.getHealth() <= 0) || (mercenary.getHealth() <= 0) || (mercenary.getEnergy() <= 0)) {


            {
                JOptionPane.showMessageDialog(null, "Nathan Drake:'I can kick, punch, use a weapon, call a teammate or hope my luck hasn't run out.'");
                choice = JOptionPane.showInputDialog(null, "Please choose either 'Kick' or 'Punch' or 'Weapon' or 'Teammate' or 'Luck' in any case. If you type it incorrectly Nathan Drake will miss a go.");


                if (choice.equals("Kick") || choice.equals("kick") || choice.equals("KICK")) {
                    int val1 = hero.KickHealthH((Mercenary_Class) mercenary);
                    JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nice kick!'");
                    JOptionPane.showMessageDialog(null, "Mercenary health: " + val1);
                    int val2 = hero.KickEnergyH((Hero_Class) hero);
                    JOptionPane.showMessageDialog(null, "Hero energy: " + val2);
                } else if (choice.equals("Punch") || choice.equals("punch") || choice.equals("PUNCH")) {
                    int val3 = hero.PunchHealthH((Mercenary_Class) mercenary);
                    JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nice punch!'");
                    JOptionPane.showMessageDialog(null, "Mercenary health: " + val3);
                    int val4 = hero.PunchEnergyH((Hero_Class) hero);
                    JOptionPane.showMessageDialog(null, "Hero energy: " + val4);
                } else if (choice.equals("Weapon") || choice.equals("weapon") || choice.equals("WEAPON")) {

                    String weapon = "";
                    {
                        JOptionPane.showMessageDialog(null, "Nathan Drake: 'I have a pistol, machine gun and a grenade launcher here. Which one should I use?' .");
                        weapon = JOptionPane.showInputDialog("Please choose either the 'Pistol', 'Machine Gun' or 'Grenade Launcher' in any case.");
                        if (weapon.equals("Pistol") || weapon.equals("pistol") || weapon.equals("PISTOL")) {
                            JOptionPane.showMessageDialog(null, "Weapon chosen: Pistol");
                            weaponChoice1a.WeaponHealthHero("Pistol", (Mercenary_Class) mercenary);
                            JOptionPane.showMessageDialog(null, "Mercenary health: " + mercenary.getHealth());
                        } else if (weapon.equals("Machine Gun") || weapon.equals("machine gun") || weapon.equals("MACHINE GUN")) {
                            JOptionPane.showMessageDialog(null, "Weapon chosen: Machine Gun");
                            weaponChoice2a.WeaponHealthHero("Machine Gun", (Mercenary_Class) mercenary);
                            JOptionPane.showMessageDialog(null, "Mercenary health: " + mercenary.getHealth());
                        } else if (weapon.equals("Grenade Launcher") || weapon.equals("grenade launcher") || weapon.equals("GRENADE LAUNCHER")) {
                            JOptionPane.showMessageDialog(null, "Weapon chosen: Grenade Launcher");
                            weaponChoice3a.WeaponHealthHero("Grenade Launcher", (Mercenary_Class) mercenary);
                            JOptionPane.showMessageDialog(null, "Mercenary health: " + mercenary.getHealth());
                        } else {
                            JOptionPane.showMessageDialog(null, "Nathan Drake: 'Oh scrap I took too long to reload by pressing the wrong thing!'");
                        }

                    }
                } else if (choice.equals("Teammate") || choice.equals("teammate") || choice.equals("TEAMMATE")) {
                    String answer = "";
                    ans = (int) (Math.random() * (5 - 1)) + 1;
                    while (!(answer.equals("Elena Fisher") || answer.equals("elena fisher") || answer.equals("ELENA FISHER") || answer.equals("Sam Drake") || answer.equals("sam drake") || answer.equals("SAM DRAKE") || answer.equals("Chloe Frazer") || answer.equals("chloe frazer") || answer.equals("CHLOE FRAZER"))) {
                        answer = JOptionPane.showInputDialog("Who would you like to play as? Please choose either 'Elena Fisher', 'Sam Drake' or 'Chloe Frazer' in an case.");
                        if (answer.equals("Elena Fisher") || answer.equals("elena fisher") || answer.equals("ELENA FISHER")) {
                            JOptionPane.showMessageDialog(null, "You have chosen Elena Fisher to assist you.");
                            if (ans == 1) {
                                int val5 = Elena.KickHealthH((Mercenary_Class) mercenary);
                                JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nice kick!'");
                                JOptionPane.showMessageDialog(null, "Mercenary health:" + val5);
                                hero.setHealth(hero.getHealth() + Elena.powerUp());
                                JOptionPane.showMessageDialog(null, "Elena Fisher: 'Nate remember the tree sap from Shambala. Take some now.'");
                                JOptionPane.showMessageDialog(null, "Hero health: " + hero.getHealth());
                            } else if (ans == 2) {
                                int val6 = Elena.PunchHealthH((Mercenary_Class) mercenary);
                                JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nice punch!'");
                                JOptionPane.showMessageDialog(null, "Mercenary health:" + val6);
                                hero.setHealth(hero.getHealth() + Elena.powerUp());
                                JOptionPane.showMessageDialog(null, "Elena Fisher: 'Nate remember the tree sap from Shambala. Take some now.'");
                                JOptionPane.showMessageDialog(null, "Hero health: " + hero.getHealth());
                            } else if (ans == 3) {
                                int val7 = Elena.Combo((Mercenary_Class) mercenary);
                                JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nice combo move!'");
                                JOptionPane.showMessageDialog(null, "Mercenary health:" + val7);
                                hero.setHealth(hero.getHealth() + Elena.powerUp());
                                JOptionPane.showMessageDialog(null, "Elena Fisher: 'Nate remember the tree sap from Shambala. Take some now.'");
                                JOptionPane.showMessageDialog(null, "Hero health: " + hero.getHealth());
                            } else if (ans == 4) {
                                JOptionPane.showMessageDialog(null, "Elena Fisher: 'Nate I can't get of the boat. The waves are too rough.'");
                                JOptionPane.showMessageDialog(null, "Mercenary health: " + hero.getHealth());
                            }

                        } else if (answer.equals("Sam Drake") || answer.equals("sam drake") || answer.equals("SAM DRAKE")) {
                            JOptionPane.showMessageDialog(null, "You have chosen Sam Drake to assist you.");
                            if (ans == 2) {
                                int val5 = Sam.KickHealthH((Mercenary_Class) mercenary);
                                JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nice kick!'");
                                JOptionPane.showMessageDialog(null, "Mercenary health:" + val5);
                                hero.setHealth(hero.getHealth() + Sam.powerUp());
                                JOptionPane.showMessageDialog(null, "Sam Drake: 'Here Nathan take this. It gives you a health boost.'");
                                JOptionPane.showMessageDialog(null, "Hero health: " + hero.getHealth());
                            } else if (ans == 3) {
                                int val6 = Sam.PunchHealthH((Mercenary_Class) mercenary);
                                JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nice punch!'");
                                JOptionPane.showMessageDialog(null, "Mercenary health:" + val6);
                                hero.setHealth(hero.getHealth() + Sam.powerUp());
                                JOptionPane.showMessageDialog(null, "Sam Drake: 'Here Nathan take this. It gives you a health boost.'");
                                JOptionPane.showMessageDialog(null, "Hero health: " + hero.getHealth());
                            } else if (ans == 4) {
                                int val7 = Sam.Combo((Mercenary_Class) mercenary);
                                JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nice combo move!'");
                                JOptionPane.showMessageDialog(null, "Mercenary health:" + val7);
                                hero.setHealth(hero.getHealth() + Sam.powerUp());
                                JOptionPane.showMessageDialog(null, "Sam Drake: 'Here Nathan take this. It gives you a health boost.'");
                                JOptionPane.showMessageDialog(null, "Hero health: " + hero.getHealth());
                            } else if (ans == 1) {
                                JOptionPane.showMessageDialog(null, "Sam Drake: 'Nate I can't get of the boat. The waves are too rough.'");
                                JOptionPane.showMessageDialog(null, "Mercenary health: " + hero.getHealth());
                            }

                        } else if (answer.equals("Chloe Frazer") || answer.equals("chloe frazer") || answer.equals("CHLOE FRAZER")) {
                            JOptionPane.showMessageDialog(null, "You have chosen Chloe Frazer to assist you.");
                            if (ans == 3) {
                                int val5 = Chloe.KickHealthH((Mercenary_Class) mercenary);
                                JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nice kick!'");
                                JOptionPane.showMessageDialog(null, "Mercenary health:" + val5);
                                hero.setHealth(hero.getHealth() + Chloe.powerUp());
                                JOptionPane.showMessageDialog(null, "Chloe Frazer: 'Nate take this now. It probably will be a good idea to get some health.'");
                                JOptionPane.showMessageDialog(null, "Hero health: " + hero.getHealth());
                            } else if (ans == 4) {
                                int val6 = Chloe.PunchHealthH((Mercenary_Class) mercenary);
                                JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nice punch!'");
                                JOptionPane.showMessageDialog(null, "Mercenary health:" + val6);
                                hero.setHealth(hero.getHealth() + Chloe.powerUp());
                                JOptionPane.showMessageDialog(null, "Chloe Frazer: 'Nate take this now. It probably will be a good idea to get some health.'");
                                JOptionPane.showMessageDialog(null, "Hero health: " + hero.getHealth());
                            } else if (ans == 1) {
                                int val7 = Chloe.Combo((Mercenary_Class) mercenary);
                                JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nice combo move!'");
                                JOptionPane.showMessageDialog(null, "Mercenary health:" + val7);
                                hero.setHealth(hero.getHealth() + Chloe.powerUp());
                                JOptionPane.showMessageDialog(null, "Chloe Frazer: 'Nate take this now. It probably will be a good idea to get some health.'");
                                JOptionPane.showMessageDialog(null, "Hero health: " + hero.getHealth());
                            } else if (ans == 2) {
                                JOptionPane.showMessageDialog(null, "Chloe Frazer: 'Nate I can't get of the boat. The waves are too rough.'");
                                JOptionPane.showMessageDialog(null, "Mercenary health: " + hero.getHealth());
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "You have chosen an invalid team mate. Please choose a valid team mate.");
                        }
                    }
                } else if (choice.equals("Luck") || choice.equals("luck") || choice.equals("LUCK")) {
                    String lucky = "";

                    lucky = JOptionPane.showInputDialog(null, "Nathan Drake: 'I hope there's something useful in 1 of these 4 boxes labelled '1','2','3'or'4'. I gotta open 1 of em.'");
                    if (lucky.equals(luckMeter.getLuck())) {
                        hero.setEnergy(hero.getEnergy() + 150);
                        JOptionPane.showMessageDialog(null, "Nathan Drake: 'Yes, I have more energy now.'");
                        JOptionPane.showMessageDialog(null, "Hero energy: " + hero.getEnergy());
                    } else if (!(lucky.equals(luckMeter.getLuck())) && (lucky.equals("1") || lucky.equals("2") || lucky.equals("3") || lucky.equals("4"))) {
                        JOptionPane.showMessageDialog(null, "Nathan Drake: 'Nothing, great.'");

                    } else {

                        JOptionPane.showMessageDialog(null, "Nathan Drake: 'Can't do that one.'");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Nathan Drake: 'Oh no I missed.'");
                }

                try {
                    //myWriter = new FileWriter("C:\\Users\\shyam\\Adventure game\\Results.txt", true);
                    //bw = new BufferedWriter(myWriter);
                    //out = new PrintWriter(bw);

                    he.add(hero.getEnergy());
                    mh.add(mercenary.getHealth());

                    out.println("Hero energy after round " + (count + 1) + ": " + he.get(count + 1));
                    out.println("Mercenary health after round " + (count + 1) + ": " + mh.get(count + 1));
                    out.flush();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "error");
                }

                if ((hero.getEnergy() <= 0) && (mercenary.getHealth() <= 0) || (mercenary.getEnergy() <= 0) && (hero.getHealth() <= 0) || (mercenary.getEnergy() <= 0) && (hero.getEnergy() <= 0) || (mercenary.getHealth() <= 0) && (hero.getHealth() <= 0)) {
                    JOptionPane.showMessageDialog(null, "It was a tie!'");
                    JOptionPane.showMessageDialog(null, "GAME OVER");
                    //myWriter.print("");
                    fileInput();
                    //email();
                    out.close();
                    out.flush();
                    bw.close();
                    myWriter.close();

                    System.exit(0);
                }

                if ((hero.getEnergy() <= 0)) {
                    JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nate nooooo.'");
                    JOptionPane.showMessageDialog(null, "You have been defeated.");
                    JOptionPane.showMessageDialog(null, "You weren't able to get the treasure.");
                    JOptionPane.showMessageDialog(null, "GAME OVER");
                    fileInput();
                    //email();
                    out.close();
                    out.flush();
                    bw.close();
                    myWriter.close();

                    System.exit(0);
                }

                if ((mercenary.getHealth() <= 0)) {
                    dead.getDead();
                    JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nate you beat the Mercenary.'");
                    JOptionPane.showMessageDialog(null, "Nathan Drake: 'Yeah that guy was such a pain in the neck.'");
                    JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Let's get the treasure now and get outta here.'");
                    JOptionPane.showMessageDialog(null, "Congratulations you have won!!!");
                    fileInput();
                    //email();
                    out.close();
                    out.flush();
                    bw.close();
                    myWriter.close();

                    System.exit(0);
                }

            }


            JOptionPane.showMessageDialog(null, "Mercenary:'MY TURN NOW.'");
            int randomiser = (int) (Math.random() * (4 - 1)) + 1;
            if (randomiser == 1) {
                int val8 = mercenary.KickHealthM((Hero_Class) hero);
                JOptionPane.showMessageDialog(null, "Nathan Drake: 'That kick really hurt!'");
                JOptionPane.showMessageDialog(null, "Hero health: " + val8);
                int val9 = mercenary.KickEnergyM((Mercenary_Class) mercenary);
                JOptionPane.showMessageDialog(null, "Mercenary energy: " + val9);
            } else if (randomiser == 2) {
                int answer = ((int) (Math.random() * (4 - 1)) + 1);
                if (answer == 1) {
                    JOptionPane.showMessageDialog(null, "Weapon chosen: Pistol");
                    weaponChoice1b.WeaponHealthMercenary("Pistol", (Hero_Class) hero);
                    JOptionPane.showMessageDialog(null, "Hero health: " + hero.getHealth());
                    int val12 = mercenary.getEnergy() - 10;
                    JOptionPane.showMessageDialog(null, "Mercenary energy: " + val12);
                } else if (answer == 2) {
                    JOptionPane.showMessageDialog(null, "Weapon chosen: Machine Gun");
                    weaponChoice2b.WeaponHealthMercenary("Machine Gun", (Hero_Class) hero);
                    JOptionPane.showMessageDialog(null, "Hero health: " + hero.getHealth());
                    int val13 = mercenary.getEnergy() - 20;
                    JOptionPane.showMessageDialog(null, "Mercenary energy: " + val13);
                } else if (answer == 3) {
                    JOptionPane.showMessageDialog(null, "Weapon chosen: Grenade Launcher");
                    weaponChoice3b.WeaponHealthMercenary("Grenade Launcher", (Hero_Class) hero);
                    JOptionPane.showMessageDialog(null, "Hero health: " + hero.getHealth());
                    int val14 = mercenary.getEnergy() - 30;
                    JOptionPane.showMessageDialog(null, "Mercenary energy: " + val14);
                }
            } else if (randomiser == 3) {
                JOptionPane.showMessageDialog(null, "Nathan Drake: 'Woah he's glowing!'");
                JOptionPane.showMessageDialog(null, "Victor Sullivan: 'It looks like he's gaining more energy.'");
                int val11 = ((Mercenary_Class) mercenary).Boost((Mercenary_Class) mercenary);
                JOptionPane.showMessageDialog(null, "Mercenary energy: " + val11);
            }

            try {
                //myWriter = new FileWriter("C:\\Users\\shyam\\Adventure game\\Results.txt", true);
                //bw = new BufferedWriter(myWriter);
                //out = new PrintWriter(bw);

                hh.add(hero.getHealth());
                me.add(mercenary.getEnergy());

                out.println("Hero health after round " + (count + 1) + ": " + hh.get(count + 1));
                out.println("Mercenary energy after round " + (count + 1) + ": " + me.get(count + 1));
                out.flush();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error");
            }

            if ((hero.getEnergy() <= 0) && (mercenary.getHealth() <= 0) || (mercenary.getEnergy() <= 0) && (hero.getHealth() <= 0) || (mercenary.getEnergy() <= 0) && (hero.getEnergy() <= 0) || (mercenary.getHealth() <= 0) && (hero.getHealth() <= 0)) {
                JOptionPane.showMessageDialog(null, "It was a tie!'");
                JOptionPane.showMessageDialog(null, "GAME OVER");
                fileInput();
                //email();
                out.close();
                out.flush();
                bw.close();
                myWriter.close();

                System.exit(0);
            }

            if ((hero.getHealth() <= 0)) {
                JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nate nooooo.'");
                JOptionPane.showMessageDialog(null, "You have been defeated.");
                JOptionPane.showMessageDialog(null, "You weren't able to get the treasure.");
                JOptionPane.showMessageDialog(null, "GAME OVER");
                fileInput();
                //email();
                out.close();
                out.flush();
                bw.close();
                myWriter.close();

                System.exit(0);
            }

            if ((mercenary.getEnergy() <= 0)) {
                dead.getDead();
                JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nate you beat the Mercenary.'");
                JOptionPane.showMessageDialog(null, "Nathan Drake: 'Yeah that guy was such a pain in the neck.'");
                JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Let's get the treasure now and get outta here.'");
                JOptionPane.showMessageDialog(null, "Congratulations you have won!!!");
                fileInput();
                //email();
                out.close();
                out.flush();
                bw.close();
                myWriter.close();

                System.exit(0);
            }


            if (hero.getHealth() <= 150) {
                JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nate it looks like your health is running low. You could call for some backup you know.'");
            }
            if ((hero.getEnergy() <= 150)) {
                JOptionPane.showMessageDialog(null, "Victor Sullivan: 'Nate it looks like your energy is running low. Open one of those boxes next to you. There might be something inside there.'");
            }

            count = count + 1;
        }

    }
}
