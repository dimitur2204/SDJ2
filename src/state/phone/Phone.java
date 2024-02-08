package state.phone;

public class Phone {
    private int volume;
    private SpeakerState speakerState;
    public Phone()
    {
       volume = 10;
       speakerState = new Sound();
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void onClick() {
       this.speakerState.click(this);
    }

    public void onVolumeUp() {
       this.speakerState.volumeUp(this);
    }

    public void onVolumeDown() {
       this.speakerState.volumeDown(this);
    }

    public void onMessage(String message){
         this.speakerState.alert(this, message);
    }
}
