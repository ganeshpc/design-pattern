package factory;

import org.example.factory.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseDriverTest {
    @Test
    public void testDatabaseDriver() {
        DatabaseDriver oracleDB = DatabaseDriverFactory.getDatabaseDriver(DriverType.ORACLE);
        DatabaseDriver mysqlDB = DatabaseDriverFactory.getDatabaseDriver(DriverType.MY_SQL);

        Assertions.assertInstanceOf(OracleDatabaseDriver.class, oracleDB);
        Assertions.assertInstanceOf(MySqlDatabaseDriver.class, mysqlDB);
    }
}
