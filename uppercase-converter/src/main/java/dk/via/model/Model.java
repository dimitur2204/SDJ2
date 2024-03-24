package dk.via.model;

public interface Model extends Subject{
    String convert(String source);
    String[] getHistory();
}
