package org.example.prototype;

public class User implements Prototype {
    private String name;
    private String email;
    private String phone;

    private UserRole role;

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public User(String name, String email, String phone, UserRole role) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public UserRole getRole() {
        return role;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public User clone() {
        return new User(this.name+Math.random(), email, phone);
    }
}
