package decorator;

import org.example.decorator.Communicator;
import org.example.decorator.EmailService;
import org.example.decorator.PhoneService;
import org.example.decorator.SlackService;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    public void testDecorator() {
        Communicator emailCommunicator = new EmailService();
        Communicator phoneAndEmailCommunicator = new PhoneService(emailCommunicator);
        Communicator slackAndEmailCommunicator = new SlackService(emailCommunicator);

        Communicator slackPhoneEmailCommunicator = new SlackService(phoneAndEmailCommunicator);

        slackPhoneEmailCommunicator.send("userName", "Hello there");
    }
}
