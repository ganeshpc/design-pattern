package singleton;

import org.example.singleton.SingletonEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonEnumTest {
    @Test
    public  void testGetInstance() {
        SingletonEnum enumSingleton1 = SingletonEnum.INSTANCE.getInstance();

        System.out.println(enumSingleton1.getInfo()); //Initial enum info

        SingletonEnum enumSingleton2 = SingletonEnum.INSTANCE.getInstance();
        enumSingleton2.setInfo("New enum info");

        System.out.println(enumSingleton1.getInfo()); // New enum info
        System.out.println(enumSingleton2.getInfo()); // New enum info

        Assertions.assertSame(enumSingleton1, enumSingleton2);
    }

}
