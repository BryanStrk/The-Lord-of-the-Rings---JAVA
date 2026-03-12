package lotr.model;

public class Character {
    private String name;
    private int age;
    private String weapon;
    private String kingdom;

    public Character() {
    }

    public Character(String name, int age, String weapon, String kingdom) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.kingdom = kingdom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", weapon='" + weapon + '\'' +
                ", kingdom='" + kingdom + '\'';
    }

    public void showDetails() {
        System.out.println("Name: " + name +
                ", Age: " + age +
                ", Weapon: " + weapon +
                ", Kingdom: " + kingdom);
    }
}
