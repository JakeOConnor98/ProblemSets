import javax.swing.*;

public class Message {

    private String recipient;
    private String sender;
    private String text;

    //mutator methods

    public void setRecipient(String recipient){
        this.recipient = recipient;
    }

    public void setSender(String sender){
        this.sender = sender;
    }

    public void setText(String text){
        this.text = text;
    }

    //accessor methods


    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }

    public String getText(){
        return text;
    }

    public Message(){
        this("Unknown", "Unknown","Unknown");
    }

    public Message(String recipient, String sender, String text){
       setRecipient(recipient);
       setSender(sender);
       setText(text);
    }
}
