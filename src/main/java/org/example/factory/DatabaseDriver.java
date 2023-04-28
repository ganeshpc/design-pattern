package org.example.factory;

public interface DatabaseDriver {
    void connect();
    void query();
    void close();
}
