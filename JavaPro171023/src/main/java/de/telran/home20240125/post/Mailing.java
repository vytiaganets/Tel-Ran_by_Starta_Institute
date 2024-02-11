package de.telran.home20240125.post;

public abstract class Mailing {
    private String nameAddress;
    private String senderAddress;
    private String recipientAddress;

    public Mailing(String nameAddress, String senderAddress, String recipientAddress) {
        this.nameAddress = nameAddress;
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
    }

    public abstract void deliver();

    public abstract void send();

    public String getNameAddress() {
        return nameAddress;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }
}
