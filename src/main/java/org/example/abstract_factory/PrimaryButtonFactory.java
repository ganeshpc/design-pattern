package org.example.abstract_factory;

import org.example.abstract_factory.model.Button;
import org.example.abstract_factory.model.PrimaryButton;

public class PrimaryButtonFactory extends ButtonFactory{
    @Override
    public Button createButton() {
        return new PrimaryButton();
    }
}
