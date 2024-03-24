package dk.via.view;

import dk.via.viewmodel.ConvertViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;

public class ConvertViewController {
    private ViewHandler viewHandler;
    private ConvertViewModel viewModel;
    private Region root;
    @FXML
    private TextField requestField;
    @FXML
    private TextField replyField;
    @FXML
    private Label errorLabel;

    public void init(ViewHandler viewHandler, ConvertViewModel convertViewModel, Region root) {
        this.viewHandler = viewHandler;
        this.viewModel = convertViewModel;
        this.root = root;
        this.viewModel.bindRequest(this.requestField.textProperty());
        this.viewModel.bindReply(this.replyField.textProperty());
        this.viewModel.bindError(this.errorLabel.textProperty());
    }

    public Region getRoot() {
        return root;
    }

    public void reset() {
    }

    @FXML private void onSubmit() {
        this.viewModel.convert();
    }

    @FXML private void onShowLog() {
        this.viewHandler.openView(ViewFactory.LOG);
    }

    @FXML private void onEnter() {
        this.viewModel.convert();
    }
}
