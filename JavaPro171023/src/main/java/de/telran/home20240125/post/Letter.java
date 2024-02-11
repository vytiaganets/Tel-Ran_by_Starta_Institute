//Письмо
package de.telran.home20240125.post;

public class Letter extends Mailing {
    public Letter(String nameAddress, String senderAddress, String recipientAddress) {
        super(nameAddress, senderAddress, recipientAddress);
    }

    @Override
    public void deliver(){
        System.out.println("Address receiver for letter: " + getRecipientAddress());
    }
    @Override
    public void send(){
        System.out.println("Address sender for letter: " + getSenderAddress());
    }
}
