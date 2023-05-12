package org.example.strategy;

public class RoadNavigation implements NavigationStrategy {

    public void navigate(Point from, Point to) {
        System.out.println("Navigation using Road");
    }
}
