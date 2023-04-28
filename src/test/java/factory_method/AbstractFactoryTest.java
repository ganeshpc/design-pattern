package factory_method;

import org.example.factory_method.ButtonFactory;
import org.example.factory_method.PrimaryButtonFactory;
import org.example.factory_method.RoundButtonFactory;
import org.example.factory_method.model.Button;
import org.example.factory_method.model.PrimaryButton;
import org.example.factory_method.model.RoundButton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {
    @Test
    public void testButtonFactory() {
        ButtonFactory buttonFactory = new RoundButtonFactory();
        Button roundButton = buttonFactory.createButton();

        Assertions.assertInstanceOf(RoundButton.class, roundButton);

        ButtonFactory primaryButtonFactory = new PrimaryButtonFactory();
        Button primaryButton = primaryButtonFactory.createButton();

        Assertions.assertInstanceOf(PrimaryButton.class, primaryButton);
    }
}
