package dk.via.viewmodel;

import dk.via.model.Model;
import dk.via.model.ModelManager;
import dk.via.model.Subject;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ConvertViewModel{
    private SimpleStringProperty request;
    private SimpleStringProperty reply;
    private SimpleStringProperty error;
    private ModelManager model;

    public ConvertViewModel(ModelManager model) {
        this.model = model;
        request = new SimpleStringProperty();
        reply = new SimpleStringProperty();
        error = new SimpleStringProperty();
    }

    public void convert() {
        try {
            String converted = this.model.convert(request.get());
            reply.set(converted);
            error.set("");
        } catch (Exception e) {
            error.set(e.getMessage());
        }
    }
    public void bindRequest(StringProperty property) {
        this.request.bindBidirectional(property);
    }

    public void bindReply(StringProperty property) {
        this.reply.bindBidirectional(property);
    }

    public void bindError(StringProperty property) {
        this.error.bindBidirectional(property);
    }
}
