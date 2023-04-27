package builder;

import org.example.builder.Database;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DatabaseTest {

    @Test
    public void testDatabaseObjectCreation() throws Exception {
        Database.DatabaseBuilder databaseBuilder = new Database.DatabaseBuilder();

        databaseBuilder.atPort(1234).withHost("http").withPassword("pass").withUsername("user");

        Database db = databaseBuilder.build();

        Assertions.assertNotNull(db);
    }

    @Test
    public void testDatabaseObjectCreationFail() throws Exception {
        assertThrows(Exception.class, () -> {
            Database.DatabaseBuilder databaseBuilder = new Database.DatabaseBuilder();

            databaseBuilder.atPort(1234).withHost("http").withUsername("user");

            Database db = databaseBuilder.build();
        });
    }
}
