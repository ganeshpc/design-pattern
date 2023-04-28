package org.example.factory;

public class OracleDatabaseDriver implements DatabaseDriver {
    @Override
    public void connect() {
        System.out.println("Oracle connect");
    }

    @Override
    public void query() {
        System.out.println("Oracle  query");
    }

    @Override
    public void close() {
        System.out.println("Oracle   close");
    }
}
