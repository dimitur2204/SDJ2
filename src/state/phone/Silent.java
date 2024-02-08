package state.phone;

public class Silent implements SpeakerState{
    @Override
    public void click(Phone phone) {
       phone.setSpeakerState(new Silent());
    }

    @Override
    public void alert(Phone phone) {
        System.out.println("...");
    }

    @Override
    public void volumeUp(Phone phone) {
        phone.setSpeakerState(new Vibrate());
    }

    @Override
    public void volumeDown(Phone phone) {
        throw new IllegalStateException("Speaker is already at a silent");
    }
}
