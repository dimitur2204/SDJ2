package state.phone;

public interface SpeakerState {
    void click(Phone phone);
    void alert(Phone phone, String message);
    void volumeUp(Phone phone) throws IllegalStateException;
    void volumeDown(Phone phone) throws IllegalStateException;
}
