package org.example.strategy;

public class BikeNavigation implements NavigationStrategy {

    @Override
    public void navigate(Point from, Point to) {
        System.out.println("Naviagation by Bike");
    }
}
