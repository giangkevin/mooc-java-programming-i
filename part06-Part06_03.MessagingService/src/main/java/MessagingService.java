import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> list;

    public MessagingService() {
        this.list = new ArrayList<>();
    }

    public void add(Message message){
        if (message.getContent().length() < 281){
            this.list.add(message);
        }
        
    }

    public ArrayList<Message> getMessages(){
        return this.list;
    }
    
}   
