import java.util.ArrayList;

public class IPhone {
    private ArrayList<IPhoneMessage> messages;
    public IPhone(){
        this.messages = new ArrayList<IPhoneMessage>();
    }
    public IPhoneMessage receiveMessage(IPhoneMessage msg) {
        messages.add(msg);
        return msg;
    }
}
