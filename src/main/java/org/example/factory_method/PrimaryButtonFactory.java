package org.example.factory_method;

import org.example.factory_method.model.Button;
import org.example.factory_method.model.PrimaryButton;

public class PrimaryButtonFactory extends ButtonFactory{
    @Override
    public Button createButton() {
        return new PrimaryButton();
    }
}
