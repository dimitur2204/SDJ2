package observer.soccer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class JurgenKlop implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
       if(evt.getPropertyName().equals("DreamTeamGoal")){
          System.out.println("Jurgen Klop: LET'S GO BOYS");
       } else if (evt.getPropertyName().equals("OldBoysGoal")) {
           System.out.println("Jurgen Klop: Where is the defence?!");
       }
    }
}
