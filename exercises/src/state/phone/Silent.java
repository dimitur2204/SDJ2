package state.phone;

public class Silent implements SpeakerState{
    @Override
    public void click(Phone phone) {
       phone.setSpeakerState(new Sound());
    }

    @Override
    public void alert(Phone phone, String message) {
        System.out.println("...");
        System.out.println(message);
    }

    @Override
    public void volumeUp(Phone phone) {
        phone.setSpeakerState(new Vibrate());
    }

    @Override
    public void volumeDown(Phone phone) throws IllegalStateException {
        throw new IllegalStateException("Speaker is already at a silent");
    }
}
