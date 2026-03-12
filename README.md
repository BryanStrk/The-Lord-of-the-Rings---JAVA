# The Lord of the Rings - Java

## Description
This project is a Java console application developed to practice:

- Object-Oriented Programming (OOP)
- Encapsulation
- Inheritance
- Polymorphism

The program represents characters from The Lord of the Rings using 5 different races and one superclass with common attributes.

## Project Structure

```text
src/main/java
└── lotr
    ├── Main.java
    ├── model
    │   └── Character.java
    └── races
        ├── Elf.java
        ├── Dwarf.java
        ├── Human.java
        ├── Hobbit.java
        └── Orc.java

**Superclass**

The project contains one superclass:

Character

This class stores the common attributes for all characters:

name - age - weapon - kingdom

It also contains the method:

showDetails() - Races Included

The project includes 5 different races:

Elf - Dwarf - Human - Hobbit - Orc

Each race has 3 characters created in the Main class.

The method showDetails() is defined in the superclass Character and overridden in each subclass.
This allows the program to print the details of each race using polymorphism.

**Example Output**

=== LORD OF THE RINGS CHARACTERS ===

Elf -> name='Legolas', age=2931, weapon='Bow', kingdom='Woodland Realm', magicType='Nature Magic'

Dwarf -> name='Gimli', age=139, weapon='Axe', kingdom='Lonely Mountain', beardLength='Long'

Human -> name='Aragorn', age=87, weapon='Sword', kingdom='Gondor', role='King'

Hobbit -> name='Frodo', age=50, weapon='Sting', kingdom='Shire', favoriteFood='Mushrooms'

Orc -> name='Azog', age=200, weapon='Mace', kingdom='Mordor', aggressivenessLevel='High'

**How to Run**

Open the project in IntelliJ IDEA.
Run the Main class.
