//Контейнер
package de.telran.home20240125.post;

public class Container extends Mailing {
    public Container(String nameAddress, String senderAddress, String recipientAddress) {
        super(nameAddress, senderAddress, recipientAddress);
    }
    @Override
    public void deliver(){
        System.out.println("Address receiver for container: " + getRecipientAddress());
    }
    @Override
    public void send(){
        System.out.println("Address sender for container: " + getSenderAddress());
    }
}
