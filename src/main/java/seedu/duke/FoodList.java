package seedu.duke;

import java.util.ArrayList;
import java.util.Random;

public class FoodList {
    private ArrayList<Food> foods;

    public FoodList() {
        this.foods = new ArrayList<>();
    }

    public FoodList(ArrayList<Food> foods) {
        this.foods = foods;
    }

    public Food getRandomFood() {
        Random random = new Random();
        int foodIndex = random.nextInt(9);
        return foods.get(foodIndex);
    }
}

