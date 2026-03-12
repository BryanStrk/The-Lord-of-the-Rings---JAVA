package lotr.races;

import lotr.model.Character;

public class Dwarf extends Character {
    private String beardLength;

    public Dwarf() {
    }

    public Dwarf(String name, int age, String weapon, String kingdom, String beardLength) {
        super(name, age, weapon, kingdom);
        this.beardLength = beardLength;
    }

    @Override
    public void showDetails() {
        System.out.println("Dwarf -> " + super.toString() +
                ", beardLength='" + beardLength + "'");
    }

    public String getBeardLength() {
        return beardLength;
    }

    public void setBeardLength(String beardLength) {
        this.beardLength = beardLength;
    }
}