//Бандероль
package de.telran.home20240125.post;

public class Parcel extends Mailing {
    public Parcel(String nameAddress, String senderAddress, String recipientAddress) {
        super(nameAddress, senderAddress, recipientAddress);
    }
    @Override
    public void deliver(){
        System.out.println("Address receiver for parcel: " + getRecipientAddress());
    }
    @Override
    public void send(){
        System.out.println("Address sender for parcel: " + getSenderAddress());
    }
}
