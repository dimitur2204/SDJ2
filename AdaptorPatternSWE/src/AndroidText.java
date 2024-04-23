import java.time.Instant;

//Client
public class AndroidText {

    private String text;
    private Instant timestamp;

    public AndroidText(String text) {
        this.text = text;
        this.timestamp = Instant.now();
    }

    public String getText() {
        return text;
    }

    public Instant getTimestamp(){
        // return current time using a UTC timestamp using the date classes
        return timestamp;
    }
}

