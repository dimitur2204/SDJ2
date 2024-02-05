package observer.soccer;

public class SoccerTest {
    public static void main(String[] args) {
        SoccerMatch match = new SoccerMatch();
        DreamTeamFan dtfan = new DreamTeamFan();
        OldBoysFan obfan = new OldBoysFan();
        Referee ref = new Referee();
        JurgenKlop klop = new JurgenKlop();
        ScoreBoard score = new ScoreBoard();
        match.addPropertyChangeListener(dtfan);
        match.addPropertyChangeListener(obfan);
        match.addPropertyChangeListener(ref);
        match.addPropertyChangeListener(klop);
        match.addPropertyChangeListener(score);
        match.startMatch();
    }
}
