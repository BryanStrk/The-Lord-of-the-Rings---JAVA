package lotr.races;

import lotr.model.Character;

public class Human extends Character {
    private String role;

    public Human() {
    }

    public Human(String name, int age, String weapon, String kingdom, String role) {
        super(name, age, weapon, kingdom);
        this.role = role;
    }

    @Override
    public void showDetails() {
        System.out.println("Human -> " + super.toString() +
                ", role='" + role + "'");
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}