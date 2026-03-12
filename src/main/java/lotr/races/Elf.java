package lotr.races;

import lotr.model.Character;

public class Elf extends Character {
    private String magicType;

    public Elf() {
    }

    public Elf(String name, int age, String weapon, String kingdom, String magicType) {
        super(name, age, weapon, kingdom);
        this.magicType = magicType;
    }

    @Override
    public void showDetails() {
        System.out.println("Elf -> " + super.toString() +
                ", magicType='" + magicType + "'");
    }

    public String getMagicType() {
        return magicType;
    }

    public void setMagicType(String magicType) {
        this.magicType = magicType;
    }
}