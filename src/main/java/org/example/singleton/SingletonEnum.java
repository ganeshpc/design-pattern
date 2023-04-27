package org.example.singleton;

public enum SingletonEnum {
    INSTANCE("Initial class");

    private String info;

    private SingletonEnum(String info) {
        this.info = info;
    }

    public SingletonEnum getInstance() {
        return INSTANCE;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
