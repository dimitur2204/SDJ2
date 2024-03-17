package threads.burgerbar;

public class BurgerbarEmployee implements Runnable{
    private String name;
    private Burgerbar burgerbar;
    public BurgerbarEmployee(String name, Burgerbar bar){
        this.name = name;
        this.burgerbar = bar;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        while(true){
            try {
                this.burgerbar.makeBurger(this.name);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
