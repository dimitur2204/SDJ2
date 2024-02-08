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

    public SpeakerState getSpeakerState() {
        return speakerState;
    }

    public void setSpeakerState(SpeakerState speakerState) {
        this.speakerState = speakerState;
    }
}
