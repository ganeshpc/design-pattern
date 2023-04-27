package org.example;

import org.example.singleton.SingletonClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SingletonClass singleton = SingletonClass.getInstance();

        System.out.println(singleton);
    }
}