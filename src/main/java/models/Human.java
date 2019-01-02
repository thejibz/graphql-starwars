package models;

import java.util.List;

public class Human extends Character {
    private float height;
    private List<Starship> starships;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public List<Starship> getStarships() {
        return starships;
    }

    public void setStarships(List<Starship> starships) {
        this.starships = starships;
    }
}
