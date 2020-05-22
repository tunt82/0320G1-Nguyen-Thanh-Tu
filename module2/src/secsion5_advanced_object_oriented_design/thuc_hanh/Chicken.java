package secsion5_advanced_object_oriented_design.thuc_hanh;

import secsion5_advanced_object_oriented_design.thuc_hanh.edile.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Cục ta Cục tác";
    }

    @Override
    public String howToEat() {
        return "Rán lên ăn";
    }
}
