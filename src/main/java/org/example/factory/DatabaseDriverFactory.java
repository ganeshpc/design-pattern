package org.example.factory;

public class DatabaseDriverFactory {
    public static DatabaseDriver getDatabaseDriver(DriverType driverType) {
        return switch (driverType) {
            case MY_SQL -> new MySqlDatabaseDriver();

            case ORACLE -> new OracleDatabaseDriver();

            default -> null;
        };
    }
}
