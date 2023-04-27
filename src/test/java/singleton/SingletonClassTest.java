package singleton;

import org.example.singleton.SingletonClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SingletonClassTest {

    @Test
    public void testGetInstance() {
        SingletonClass instance1 = SingletonClass.getInstance();

        SingletonClass instance2 = SingletonClass.getInstance();

        Assertions.assertSame(instance1, instance2);
    }

    @Test
    public void testMultiThreadGetInstance() {
        int noThreads = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(noThreads);

        IntStream.range(0, 1000).forEach(count -> executorService.submit(SingletonClass::getInstance));

    }
}
