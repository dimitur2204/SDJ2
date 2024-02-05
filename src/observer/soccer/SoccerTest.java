package observer.soccer;

public class SoccerTest {
    public static void main(String[] args) {
        SoccerMatch match = new SoccerMatch();
        DreamTeamFan dtfan = new DreamTeamFan();
        OldBoysFan obfan = new OldBoysFan();
        Referee ref = new Referee();
        JurgenKlop klop = new JurgenKlop();
        ScoreBoard score = new ScoreBoard();
        Medic medic = new Medic();
        BlindBirdWatcher birdWatcher = new BlindBirdWatcher();
        match.addPropertyChangeListener(dtfan);
        match.addPropertyChangeListener(obfan);
        match.addPropertyChangeListener(ref);
        match.addPropertyChangeListener(klop);
        match.addPropertyChangeListener(score);
        match.addPropertyChangeListener(medic);
        match.addPropertyChangeListener(birdWatcher);
        match.startMatch();
    }
}
