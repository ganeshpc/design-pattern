package org.example.factory_method.model;

public class PrimaryButton extends Button {
    @Override
    public void render() {
        System.out.println("Render round button");
    }

    @Override
    public void onClik() {
        System.out.println("Click round button");
    }
}
