package dk.via.view;

import dk.via.viewmodel.LogViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Region;

public class LogViewController {
    private ViewHandler viewHandler;
    private LogViewModel viewModel;
    private Region root;
    @FXML
    private ListView logArea;

    @FXML
    public void init(ViewHandler viewHandler, LogViewModel logViewModel, Region root) {
        this.viewHandler = viewHandler;
        this.viewModel = logViewModel;
        this.root = root;
    }

    public Region getRoot() {
        return root;
    }

    @FXML private void onBack() {
        this.viewHandler.openView(ViewFactory.CONVERT);
    }

}
