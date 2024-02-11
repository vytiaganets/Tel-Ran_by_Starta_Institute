//Посылка
package de.telran.home20240125.post;

public class Package extends Mailing {
    public Package(String nameAddress, String senderAddress, String recipientAddress) {
        super(nameAddress, senderAddress, recipientAddress);
    }
    @Override
    public void deliver(){
        System.out.println("Address receiver for package: " + getRecipientAddress());
    }
    @Override
    public void send(){
        System.out.println("Address sender for package: " + getSenderAddress());
    }
}
