package lotr;

import lotr.model.Character;
import lotr.races.Dwarf;
import lotr.races.Elf;
import lotr.races.Hobbit;
import lotr.races.Human;
import lotr.races.Orc;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Elf elf1 = new Elf("Legolas", 2931, "Bow", "Woodland Realm", "Nature Magic");
        Elf elf2 = new Elf("Elrond", 6000, "Sword", "Rivendell", "Healing Magic");
        Elf elf3 = new Elf("Arwen", 2901, "Dagger", "Rivendell", "Light Magic");

        Dwarf dwarf1 = new Dwarf("Gimli", 139, "Axe", "Lonely Mountain", "Long");
        Dwarf dwarf2 = new Dwarf("Thorin", 195, "Sword", "Erebor", "Very Long");
        Dwarf dwarf3 = new Dwarf("Dwalin", 169, "Hammer", "Erebor", "Medium");

        Human human1 = new Human("Aragorn", 87, "Sword", "Gondor", "King");
        Human human2 = new Human("Boromir", 41, "Sword", "Gondor", "Warrior");
        Human human3 = new Human("Faramir", 36, "Bow", "Gondor", "Captain");

        Hobbit hobbit1 = new Hobbit("Frodo", 50, "Sting", "Shire", "Mushrooms");
        Hobbit hobbit2 = new Hobbit("Sam", 38, "Pan", "Shire", "Potatoes");
        Hobbit hobbit3 = new Hobbit("Merry", 36, "Dagger", "Shire", "Bread");

        Orc orc1 = new Orc("Azog", 200, "Mace", "Mordor", "High");
        Orc orc2 = new Orc("Bolg", 150, "Axe", "Mount Gundabad", "Very High");
        Orc orc3 = new Orc("Gorbag", 90, "Sword", "Mordor", "Medium");

        List<Character> characters = new ArrayList<>();

        characters.add(elf1);
        characters.add(elf2);
        characters.add(elf3);

        characters.add(dwarf1);
        characters.add(dwarf2);
        characters.add(dwarf3);

        characters.add(human1);
        characters.add(human2);
        characters.add(human3);

        characters.add(hobbit1);
        characters.add(hobbit2);
        characters.add(hobbit3);

        characters.add(orc1);
        characters.add(orc2);
        characters.add(orc3);

        System.out.println("=== LORD OF THE RINGS CHARACTERS ===");
        for (Character character : characters) {
            character.showDetails();
        }
    }
}