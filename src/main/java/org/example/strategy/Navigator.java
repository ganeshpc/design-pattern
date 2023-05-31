package org.example.strategy;

public class Navigator {
    private final NavigationStrategy navigationStrategy;

    public Navigator(NavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }

    public void navigate(Point from, Point to) {
        navigationStrategy.navigate(from, to);
    }
}
