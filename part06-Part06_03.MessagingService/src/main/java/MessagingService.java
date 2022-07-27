import java.util.ArrayList;

public class MessagingService {
    
    // instance variable list
    private ArrayList<Message> messages;

    // parameterless constructor
    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    // add messages under 280 characters
    public void add(Message message) {
        String charCount = message.getContent();
        if ( charCount.length() <= 280) {
            this.messages.add(message);
        }
    }

    // returns messages in messaging service.
    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
