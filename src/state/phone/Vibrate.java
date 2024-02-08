package state.phone;

public class Vibrate implements SpeakerState{
    @Override
    public void click(Phone phone) {
        phone.setSpeakerState(new Silent());
    }

    @Override
    public void alert(Phone phone, String message) {
        System.out.println("Brrr Brrr Brrr");
        System.out.println(message);
    }

    @Override
    public void volumeUp(Phone phone) {
        phone.setVolume(1);
        phone.setSpeakerState(new Sound());
    }

    @Override
    public void volumeDown(Phone phone) {
        phone.setSpeakerState(new Silent());
    }
}
