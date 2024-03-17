package observer.soccer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Objects;

public class OldBoysFan implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(Objects.equals(evt.getPropertyName(), "OldBoysGoal")){
            System.out.println("OldBoysFan: YEAHH!");
        } else if (Objects.equals(evt.getPropertyName(), "DreamTeamGoal")) {
            System.out.println("OldBoysFan: Piss off clown!");
        }
    }
}
