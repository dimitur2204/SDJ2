package threads.counter;

public class CounterIncrementer implements Runnable {
    private Counter counter;
    public CounterIncrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0; i<1_000_000; i++) {
            counter.increment();
        }
        System.out.println(counter.getCount());
    }
}
