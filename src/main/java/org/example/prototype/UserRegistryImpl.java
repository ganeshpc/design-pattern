package org.example.prototype;

import java.util.HashMap;
import java.util.Map;

public class UserRegistryImpl implements UserRegistry {
    private Map<UserRole, User> registry = new HashMap<>();

    @Override
    public User getPrototype(UserRole role) {
        return registry.get(role).clone();
    }

    @Override
    public void addPrototype(UserRole role, User user) {
        registry.put(role, user);
    }
}
