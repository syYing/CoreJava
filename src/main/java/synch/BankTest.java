
package synch;

public class BankTest {

    private static final int NUM = 100;
    private static final double INITIAL_BALANCE = 1000;
    private static final double MAX_AMOUNT = 1000;
    private static final int DELAY = 10;
    
    public static void main(String[] args) {
        Bank bank = new Bank(NUM, INITIAL_BALANCE);
        for (int i = 0; i < NUM; i++) {
            int from = i;
            Runnable r = () -> {
                try {
                    while(true) {
                        int to = (int) (bank.getSize() * Math.random());
                        double amount = MAX_AMOUNT * Math.random();
                        bank.transfer(from, to, amount);
                        Thread.sleep((int) (DELAY * Math.random()));
                    }
                } catch(InterruptedException e) {}
            };
            Thread t = new Thread(r);
            t.start();
        }
    }
}
