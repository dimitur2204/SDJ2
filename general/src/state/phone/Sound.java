package state.phone;

public class Sound implements SpeakerState {
     public Sound(){

     }

    @Override
    public void click(Phone phone) {
        phone.setSpeakerState(new Vibrate());
    }

    @Override
    public void alert(Phone phone, String message) {
        System.out.println("Beep");
        System.out.println(message);
    }

    @Override
    public void volumeUp(Phone phone) throws  IllegalStateException {
        if(phone.getVolume() < 10){
            phone.setVolume(phone.getVolume() + 1);
            return;
        }
        throw new IllegalStateException("Speaker is already at max");
    }

    @Override
    public void volumeDown(Phone phone) {
        if(phone.getVolume() != 1){
            phone.setVolume(phone.getVolume() - 1);
            return;
        }
        phone.setVolume(0);
        phone.setSpeakerState(new Vibrate());
    }
}
