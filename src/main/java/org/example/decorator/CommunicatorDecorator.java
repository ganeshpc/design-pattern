package org.example.decorator;

public abstract class CommunicatorDecorator implements Communicator {

    public Communicator communicator;

    public CommunicatorDecorator(Communicator communicator) {
        this.communicator = communicator;
    }
}
