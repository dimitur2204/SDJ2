package threads.burgerbar;

public class BurgerBarCustomer implements Runnable{
    private int burgersToEat;
    private String name;
    private final Burgerbar burgerbar;
    public BurgerBarCustomer(String name, int burgersToEat, Burgerbar bar){
        this.name = name;
        this.burgerbar = bar;
        this.burgersToEat = burgersToEat;
    }

    @Override
    public void run() {
        for (int i = 0; i < burgersToEat; i++) {
            try {
                this.burgerbar.eatBurger(this.name);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
