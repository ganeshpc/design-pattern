package org.example.abstract_factory;

import org.example.abstract_factory.model.Button;
import org.example.abstract_factory.model.RoundButton;

public class RoundButtonFactory extends ButtonFactory{
    @Override
    public Button createButton() {
        return new RoundButton();
    }
}
