package org.example.decorator;

public class EmailService implements Communicator {
    public void send(String target, String message) {
        System.out.println("Sending email: " + message);
    }
}
