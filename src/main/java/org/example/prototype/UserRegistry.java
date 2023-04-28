package org.example.prototype;

public interface UserRegistry {
    User getPrototype(UserRole role);
    void addPrototype(UserRole role, User user);
}
