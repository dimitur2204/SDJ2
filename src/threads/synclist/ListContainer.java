package threads.synclist;

import java.util.ArrayList;
import java.util.List;

public class ListContainer {
    private List<Integer> list;
    public ListContainer() {
        this.list = new ArrayList<>();
    }
    public synchronized void add(int value) {
        list.add(value);
    }
    public int getLength() {
        return list.size();
    }
}
