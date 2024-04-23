import java.util.Date;

// Adaptee
public class IPhoneMessage {

    private String message;
    private Date date;

    public IPhoneMessage(String msg){
        this.message = msg;
        this.date = new Date();
    }

    public String getMessage() {
        return message;
    }

    public Date getDate(){
        return date;
    }
}
