package observer.soccer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BlindBirdWatcher implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
if(evt.getPropertyName().equals("BirdSing")){
   System.out.println("Oh what a bird!");
}
    }
}
