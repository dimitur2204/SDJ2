package observer.soccer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Referee implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
       if(evt.getPropertyName().equals("OldBoysTackle")){
          System.out.println("Old Boys recieve a yellow card");
       } else if (evt.getPropertyName().equals("DreamTeamTackle")){
          System.out.println("Dream Team recieve a yellow card");
       }
    }
}
