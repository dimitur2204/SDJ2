package observer.soccer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Medic implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().contains("Tackle")){
           System.out.println("Medic out! Someone needs medical attention 🚑");
        }
    }
}
