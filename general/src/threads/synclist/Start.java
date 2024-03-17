package threads.synclist;

public class Start {
    public static void main(String[] args) {
       ListContainer list = new ListContainer();
       ListRunner r1 = new ListRunner(list);
       ListRunner r2 = new ListRunner(list);
        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
