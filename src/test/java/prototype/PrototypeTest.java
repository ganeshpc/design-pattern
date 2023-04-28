package prototype;

import org.example.prototype.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrototypeTest {

    @Test
    public void testUserPrototype() {
        User user = new User("John", "john@gmail.com", "1234567");

        User user1 = user.clone();

        Assertions.assertNotNull(user1);
        Assertions.assertNotSame(user1, user);
        Assertions.assertEquals(user1.getEmail(), user.getEmail());
        Assertions.assertNotEquals(user.getName(), user1.getName());
    }
}
