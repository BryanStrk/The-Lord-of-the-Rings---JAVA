package lotr.races;

import lotr.model.Character;

public class Orc extends Character {
    private String aggressivenessLevel;

    public Orc() {
    }

    public Orc(String name, int age, String weapon, String kingdom, String aggressivenessLevel) {
        super(name, age, weapon, kingdom);
        this.aggressivenessLevel = aggressivenessLevel;
    }

    @Override
    public void showDetails() {
        System.out.println("Orc -> " + super.toString() +
                ", aggressivenessLevel='" + aggressivenessLevel + "'");
    }

    public String getAggressivenessLevel() {
        return aggressivenessLevel;
    }

    public void setAggressivenessLevel(String aggressivenessLevel) {
        this.aggressivenessLevel = aggressivenessLevel;
    }
}