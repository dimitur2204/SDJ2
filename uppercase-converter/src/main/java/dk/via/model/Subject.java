package dk.via.model;

import java.beans.PropertyChangeListener;

public interface Subject {
    void addPropertyChangeListener(PropertyChangeListener listener);
    void removePropertyChangeListener(PropertyChangeListener listener);
}
