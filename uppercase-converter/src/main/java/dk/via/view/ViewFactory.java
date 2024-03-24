package dk.via.view;

import dk.via.UppercaseApplication;
import dk.via.viewmodel.ViewModelFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Region;

import javax.swing.text.View;
import java.io.IOError;
import java.io.IOException;

public class ViewFactory {
    public static final String CONVERT = "convert";
    public static final String LOG = "log";

    private final ViewHandler viewHandler;
    private final ViewModelFactory viewModelFactory;
    private ConvertViewController convertViewController;
    private LogViewController logViewController;

    public ViewFactory(ViewHandler viewHandler, ViewModelFactory viewModelFactory) {
        this.viewHandler = viewHandler;
        this.viewModelFactory = viewModelFactory;
        this.convertViewController = null;
        this.logViewController = null;
    }

    public Region loadConvertView() {
        if (this.convertViewController == null) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ConvertView.fxml"));
            try {
                Region root = loader.load();
                this.convertViewController = loader.getController();
                this.convertViewController.init(viewHandler, viewModelFactory.getConvertViewModel(), root);
            } catch (IOException e) {
                throw new IOError(e);
            }
        }
        this.convertViewController.reset();
        return this.convertViewController.getRoot();
    }
    public Region loadLogView() {
        if (this.logViewController == null) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("LogView.fxml"));
            try {
                Region root = loader.load();
                this.logViewController = loader.getController();
                this.logViewController.init(viewHandler, viewModelFactory.getLogViewModel(), root);
            } catch (IOException e) {
                throw new IOError(e);
            }
        }
        return this.logViewController.getRoot();
    }

    public Region loadView(String id) {
        return switch (id) {
            case CONVERT -> loadConvertView();
            case LOG -> loadLogView();
            default -> throw new IllegalArgumentException("Unknown view: " + id);
        };
    }
}
