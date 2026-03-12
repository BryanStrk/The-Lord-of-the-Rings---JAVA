package lotr.races;

import lotr.model.Character;

public class Hobbit extends Character {
    private String favoriteFood;

    public Hobbit() {
    }

    public Hobbit(String name, int age, String weapon, String kingdom, String favoriteFood) {
        super(name, age, weapon, kingdom);
        this.favoriteFood = favoriteFood;
    }

    @Override
    public void showDetails() {
        System.out.println("Hobbit -> " + super.toString() +
                ", favoriteFood='" + favoriteFood + "'");
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}