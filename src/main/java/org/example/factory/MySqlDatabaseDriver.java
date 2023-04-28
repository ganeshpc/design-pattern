package org.example.factory;

public class MySqlDatabaseDriver implements DatabaseDriver {

    @Override
    public void connect() {
        System.out.println("mysql connect");
    }

    @Override
    public void query() {
        System.out.println("mysql query");
    }

    @Override
    public void close() {
        System.out.println("mysql close");
    }
}
