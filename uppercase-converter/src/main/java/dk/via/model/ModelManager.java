package dk.via.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ModelManager implements Model{
        private final Converter converter;
        private final Logger logger;

        private final PropertyChangeSupport support;

        public ModelManager() {
            this.converter = new Converter();
            this.logger = new Logger();
            this.support = new PropertyChangeSupport(this);
        }

        @Override
        public String convert(String source) {
           String converted = converter.toUpperCase(source);
           return converted;
        }

    @Override
    public String[] getHistory() {
        return new String[0];
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
            this.support.removePropertyChangeListener(listener);
    }
}
