package observer.soccer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ScoreBoard implements PropertyChangeListener {

private int team0Goals;
    private int team1Goals;

    public ScoreBoard() {
        team0Goals = 0;
        team1Goals = 0;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals("OldBoysGoal")) {
            team1Goals++;
           this.printScore();
        } else if(evt.getPropertyName().equals("DreamTeamGoal")){
           team0Goals++;
           this.printScore();
        }
    }

    public void printScore() {
        System.out.println("Current Score: " + team0Goals + " -- " + team1Goals);
    }
}
