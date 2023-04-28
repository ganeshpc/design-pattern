package prototype;

import org.example.prototype.User;
import org.example.prototype.UserRegistryImpl;
import org.example.prototype.UserRole;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistryImplTest {

    @Test
    public void testUserRegistry() {
        User user = new User("john", "doe@gamil.com", "23456543", UserRole.STUDENT);
        User teacher = new User("joe", "atkin@gamil.com", "09876", UserRole.TEACHER);

        UserRegistryImpl userRegistry = new UserRegistryImpl();
        userRegistry.addPrototype(UserRole.STUDENT, user);
        userRegistry.addPrototype(UserRole.TEACHER, teacher);

        User teacherClone = userRegistry.getPrototype(UserRole.TEACHER);
        User studentClone = userRegistry.getPrototype(UserRole.STUDENT);

        Assertions.assertNotSame(user, studentClone);
        Assertions.assertNotSame(teacher, teacherClone);
    }
}
