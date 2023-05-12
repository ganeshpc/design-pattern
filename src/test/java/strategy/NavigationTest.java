package strategy;

import org.example.strategy.*;
import org.junit.jupiter.api.Test;

public class NavigationTest {

    @Test
    public void testBikeNavigationStrategy() {
        NavigationStrategy navigationStrategy = new BikeNavigation();

        Navigator navigator = new Navigator(navigationStrategy);

        navigator.navigate(new Point(1, 2), new Point(3, 4));
    }

    @Test
    public void testRodNavigationStrategy() {
        NavigationStrategy navigationStrategy = new RoadNavigation();

        Navigator navigator = new Navigator(navigationStrategy);

        navigator.navigate(new Point(1, 2), new Point(3, 4));
    }
}
