package dk.via.viewmodel;

import dk.via.model.ModelManager;

public class ViewModelFactory {
    private final ConvertViewModel convertViewModel;
    private final LogViewModel logViewModel;

    public ViewModelFactory(ModelManager model) {
        this.convertViewModel = new ConvertViewModel(model);
        this.logViewModel = new LogViewModel(model);
    }

    public ConvertViewModel getConvertViewModel() {
        return convertViewModel;
    }

    public LogViewModel getLogViewModel() {
        return logViewModel;
    }
}
