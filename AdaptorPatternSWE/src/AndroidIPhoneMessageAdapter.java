import java.time.Instant;

//Adapter
public class AndroidIPhoneMessageAdapter extends AndroidText {
    private IPhoneMessage msg;
    public AndroidIPhoneMessageAdapter(IPhoneMessage msg) {
        super(msg.getMessage());
        this.msg = msg;
    }

    @Override
    public String getText() {
        return msg.getMessage();
    }

    @Override
    public Instant getTimestamp() {
        return msg.getDate().toInstant();
    }
}
