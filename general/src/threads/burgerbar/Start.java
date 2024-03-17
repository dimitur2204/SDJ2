package threads.burgerbar;

public class Start {
    public static void main(String[] args) {
        Burgerbar bar = new Burgerbar(5);
        BurgerbarEmployee e1 = new BurgerbarEmployee("Ivan", bar);
        BurgerbarEmployee e2 = new BurgerbarEmployee("Plamen", bar);
        BurgerBarCustomer c1 = new BurgerBarCustomer("Sasho", 2, bar);
        BurgerBarCustomer c2 = new BurgerBarCustomer("Ivana", 2, bar);
        BurgerBarCustomer c3 = new BurgerBarCustomer("Diana", 2, bar);
        BurgerBarCustomer c4 = new BurgerBarCustomer("Nino", 2, bar);
        BurgerBarCustomer c5 = new BurgerBarCustomer("Mario", 2, bar);
        Thread t1 = new Thread(e1);
        t1.start();
        Thread t2 = new Thread(e2);
        t2.start();
        Thread t3 = new Thread(c1);
        t3.start();
        Thread t4 = new Thread(c2);
        t4.start();
        Thread t5 = new Thread(c3);
        t5.start();
        Thread t6 = new Thread(c4);
        t6.start();
        Thread t7 = new Thread(c5);
        t7.start();
    }
}
