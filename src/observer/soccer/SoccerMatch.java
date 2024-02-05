package observer.soccer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Random;

public class SoccerMatch {

    private String team0 = "DreamTeam";
    private String team1 = "OldBoys";
    private final PropertyChangeSupport support;

    public SoccerMatch() {
        this.support = new PropertyChangeSupport(this);
    }

    public void startMatch() {
        System.out.println("Match starting \n\n");
        Random random = new Random();
        for(int i = 0; i < 90; i++) {

            int rand = random.nextInt(100);
            if(rand < 10 || rand > 90){
                birdSing();
            }
            int whichTeam = random.nextInt(2);

            if(rand < 8) {
                // score goal
                scoreGoal(whichTeam);
            } else if(rand < 12) {
                // penalty
                roughTackle(whichTeam);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }

        System.out.println("\n\nMatch ended");
    }

    private void roughTackle(int whichTeam) {
        if(whichTeam == 0) {
            System.out.println(team0 + " made a rough tackle!");
            support.firePropertyChange(team0 + "Tackle", null, null);
        } else {
            System.out.println(team1 + " made a rough tackle!");
            support.firePropertyChange(team1 + "Tackle", null, null);
        }
    }

    private void scoreGoal(int whichTeam) {
        if(whichTeam == 0) {
            System.out.println(team0 + " scored!");
            support.firePropertyChange(team0 + "Goal", null, null);
        } else {
            System.out.println(team1 + " scored!");
            support.firePropertyChange(team1 + "Goal", null, null);
        }
    }
    private void birdSing() {
            support.firePropertyChange("BirdSing", null, null);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        support.addPropertyChangeListener(propertyName, listener);
    }

    public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        support.removePropertyChangeListener(propertyName, listener);
    }
}
