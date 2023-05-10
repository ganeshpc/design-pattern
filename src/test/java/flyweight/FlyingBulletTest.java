package flyweight;

import org.example.flyweight.BulletFactory;
import org.example.flyweight.FlyingBullet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlyingBulletTest {
    @Test
    public void testFlyingBullet() {
        BulletFactory bulletFactory = new BulletFactory();

        FlyingBullet f = bulletFactory.getFlyingBullet();
        Assertions.assertInstanceOf(FlyingBullet.class, f);
    }
}
