package threads.burgerbar;

public class Burgerbar {
    private int numberOfBurgers;
    private int maxNumberOfBurgers;
    public Burgerbar(int maxNumberOfBurgers){
        this.numberOfBurgers = 0;
        this.maxNumberOfBurgers = maxNumberOfBurgers;
    }
    public synchronized void makeBurger(String who) throws InterruptedException {
        while(this.numberOfBurgers >= maxNumberOfBurgers){
            this.wait();
        }
        System.out.println(who + " made a burger");
        this.numberOfBurgers++;
        this.notifyAll();
        System.out.println("Number of burgers: " + this.numberOfBurgers);
    }
    public synchronized void eatBurger(String who) throws InterruptedException {
        while(this.numberOfBurgers <= 0){
            System.out.println(who + " is waiting for a burger");
            this.wait();
        }
        System.out.println(who + " ate a burger");
        this.numberOfBurgers--;
        this.notifyAll();
        System.out.println("Number of burgers: " + this.numberOfBurgers);
    }
    public int getNumberOfBurgers() {
       return this.numberOfBurgers;
    }
}
