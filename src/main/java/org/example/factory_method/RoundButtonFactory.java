package org.example.factory_method;

import org.example.factory_method.model.Button;
import org.example.factory_method.model.RoundButton;

public class RoundButtonFactory extends ButtonFactory{
    @Override
    public Button createButton() {
        return new RoundButton();
    }
}
