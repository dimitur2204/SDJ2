package state.phone;

public interface SpeakerState {
    void click(Phone phone);
    void alert(Phone phone, String message);
    void volumeUp(Phone phone);
    void volumeDown(Phone phone);
}
