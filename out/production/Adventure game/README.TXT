Student name: Mohan Shyam Murugan
Student number: 200377911

Now complete the statements below for each level you wish to be marked. Replace all text in square brackets.

LEVEL ONE

My code demonstrates inheritance in the following way...

I have a superclass called [Teammate_Class]

This superclass is extended into at least two subclasses called [Teammate1, Teammate2 and Teammate3]

For each of the named subclasses complete the following...

Subclass 1.

Subclass [Teammate1] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [comboTakedown and elenaBoost]

These/this new properties/property are used by the subclass in the following way: [The property comboTakedown doubles the damage given when the health of the enemy is above 800 when doing the combo move. The second proprty calculates a random number between 1 and 10 for this character and adds it to the existing powerUp value.  It can be found declared in lines 18 and 19 and used by the methods in that class.]

Subclass [Teammate1] extends the superclass by overriding the following methods (there must be at least one): [PunchHealthH, KickHealthH and Combo. It can be found in lines 42,51,60 respectively.]

These overridden methods are used in the working code in the following places: [It is used in the Test_Class. The line numbers are 149,156,163 ]

Subclass 2.

Subclass [Teammate2] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [rage and samBoost]

These/this new properties/property are used by the subclass in the following way: [When the property is used the enemy gets 1.5x the damage if the teammate decides to kick or punch. samBooost gives a additonal boost to the health powerUp given. It can be found declared in lines 11 and 12 and used by the methods in that class.].

Subclass [Teammate2] extends the superclass by overriding the following methods (there must be at least one): [PunchHealthH, KickHealthH and Combo. It can be found in lines 41,56,71 respectively.]

These overridden methods are used in the working code in the following places: [It is used in the Test_Class. The line numbers are 177,184,191 respectively.]

Subclass 3.

Subclass [Teammate3] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [extraDamage and chloeBoost]

These/this new properties/property are used by the subclass in the following way: [The property extraDamage causes the enemy to lose 1*2 more health than normal when the enemy's energy is below 200 for this character for all the moves. chloeBoost gives the hero an extra health boost betwen 1 and 30 on top of the 50 health given. It can be found declared in lines 19 and 20 and is used by the methods in that class.]

Subclass [Teammate3] extends the superclass by overriding the following methods (there must be at least one): [PunchHealthH, KickHealthH and Combo. It can be found in lines 42,56 and 71 repectively.]

These overridden methods are used in the working code in the following places: [It is used in the Test_Class. The line numbers are 205,212 and 219]



LEVEL TWO

Polymorphism consists of the use of the Substitution principle and Late Dynamic binding.

In my code, polymorphism is implemented in at least two places…

Example 1.

The substitution principle can be seen in use in [It can be seen in the Test_Class. The line numbers are where the substitution principle used is are 75,76 and 86]. The name of the superclass used this example is [Character_Class] and the subclasses used are [Hero_Class,Teammate_Class, Mercenary_Class].

Late dynamic binding can be seen in [It can be seen in the Test_Class. The line numbers are where dynamic binding is used is are 107,110,113,116,258,261].

[The polymorphism I've used here is necessary as the different character types all have different stats and attributes. To access the returned value from a specific subclass(Hero_Class,Teammate_Class, Mercenary_Class) method polymorphism is required.]

Example 2.

The substitution principle can be seen in use in [It can be seen in the Test_Class. The line numbers are where the substitution principle used is are 87,88,89]. The name of the superclass used this example is [Teammate_Class] and the subclasses used are [teammate1 or teammate2 or teammate3].

Late dynamic binding can be seen in [It can be seen in the Test_Class. The line numbers are where dynamic binding is used are 149,156,163,177,184,191,205,212,219].

[The polymorphism I've used here is necessary as the different teammate types all have different stats and attributes. To access the returned value from a specific subclass(teammate1 or teammate2 or teammate3) method polymorphism is required.]
