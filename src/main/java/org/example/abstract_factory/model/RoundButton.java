package org.example.abstract_factory.model;

public class RoundButton extends Button{
    @Override
    public void render() {
        System.out.println("Render round button");
    }

    @Override
    public void onClik() {
        System.out.println("Click round button");
    }
}
