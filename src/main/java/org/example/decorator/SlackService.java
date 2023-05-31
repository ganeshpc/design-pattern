package org.example.decorator;

public class SlackService extends CommunicatorDecorator {

    public SlackService(Communicator communicator) {
        super(communicator);
    }
    public void send(String user, String message) {
        this.communicator.send(user, message);

        System.out.println("Sending message thorogh slack: " + message);
    }
}
