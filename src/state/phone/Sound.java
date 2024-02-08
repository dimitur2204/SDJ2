package state.phone;

public class Sound implements SpeakerState {
     public Sound(){

     }

    @Override
    public void click(Phone phone) {
        phone.setSpeakerState(new Sound());
    }

    @Override
    public void alert(Phone phone) {
        System.out.println("Beep");
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
        if(phone.getVolume() > 0){
            phone.setVolume(phone.getVolume() - 1);
            return;
        }
        phone.setSpeakerState(new Vibrate());
    }
}
