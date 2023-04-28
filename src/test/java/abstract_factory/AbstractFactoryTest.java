package abstract_factory;

import org.example.abstract_factory.ButtonFactory;
import org.example.abstract_factory.PrimaryButtonFactory;
import org.example.abstract_factory.RoundButtonFactory;
import org.example.abstract_factory.model.Button;
import org.example.abstract_factory.model.PrimaryButton;
import org.example.abstract_factory.model.RoundButton;
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
