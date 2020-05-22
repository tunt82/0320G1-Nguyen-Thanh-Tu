package secsion5_advanced_object_oriented_design.thuc_hanh.comparator;


import secsion4_Inheritance.thuc_hanh.SystemGeometricObjects.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
