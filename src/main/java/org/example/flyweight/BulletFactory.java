package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletFactory {
    public static final Map<BulletType, BaseBullet> bullets = new HashMap<>();

    public  FlyingBullet getFlyingBullet() {
        return new FlyingBullet();
    }
}
