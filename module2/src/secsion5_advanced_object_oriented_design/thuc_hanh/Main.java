package secsion5_advanced_object_oriented_design.thuc_hanh;

import secsion5_advanced_object_oriented_design.thuc_hanh.edile.Edible;
import secsion5_advanced_object_oriented_design.thuc_hanh.fruit.Apple;
import secsion5_advanced_object_oriented_design.thuc_hanh.fruit.Orange;

public class Main {
    public static void main(String[] args) {
//        Edible edible= new Edible(){
//
//            @Override
//            public String howToEat() {
//                return "aaaaaa";
//            }
//        };
//        System.out.println(edible.howToEat());

        Animal[] animals=new Animal[2];
        animals[0]=new Chicken();
        animals[1]=new Tiger();
        for (Animal a:animals){
            System.out.println(a.makeSound());
        }
        Edible[] edibles=new Edible[3];
        edibles[0]=new Chicken();
        edibles[1]=new Apple();
        edibles[2]=new Orange();

        for (Edible a:edibles){
            if(a instanceof Chicken){
                Chicken a1=(Chicken) a;
                System.out.println(a1.howToEat());
                System.out.println(a1.makeSound());
            }
        }
        for (Edible a:edibles){
            System.out.println(a.howToEat());
        }

    }
}
