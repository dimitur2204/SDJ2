package dk.via.viewmodel;

import dk.via.model.Model;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.ObservableList;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class LogViewModel implements PropertyChangeListener {
    private SimpleListProperty<String> log;
    private Model model;

    public LogViewModel(Model model) {
        this.model = model;
        log = new SimpleListProperty<>();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        log.setAll(model.getHistory());
    }
}
