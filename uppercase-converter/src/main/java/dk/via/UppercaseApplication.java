package dk.via;

import dk.via.model.Model;
import dk.via.model.ModelManager;
import dk.via.view.ViewHandler;
import dk.via.viewmodel.ViewModelFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class UppercaseApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        ModelManager model = new ModelManager();
        ViewModelFactory viewModelFactory = new ViewModelFactory(model);
        ViewHandler viewHandler = new ViewHandler(viewModelFactory);
        viewHandler.start(primaryStage);
    }

    public static void main(String[] args) {
        launch();
    }
}