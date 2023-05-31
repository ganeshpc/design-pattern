package org.example.decorator;

public class PhoneService extends CommunicatorDecorator {

    public PhoneService(Communicator communicator) {
        super(communicator);
    }

    public void send(String phone, String message) {

        // give call to the original communicator (communicator could be emailCommunicator)
        this.communicator.send(phone, message);

        System.out.println("Sending message through phone: " + message);
    }
}
