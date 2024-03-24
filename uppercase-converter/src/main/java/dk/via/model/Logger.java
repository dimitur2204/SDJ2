package dk.via.model;

public class Logger {
    private final String[] history = new String[10];
    private int index = 0;

    public void log(String message) {
        history[index] = message;
        index = (index + 1) % history.length;
    }

    public String[] getHistory() {
        String[] result = new String[history.length];
        for (int i = 0; i < history.length; i++) {
            result[i] = history[(index + i) % history.length];
        }
        return result;
    }
}
