package core2.multithreading.queue;

import java.util.List;
import java.util.Queue;

public class BuyerThread implements Runnable {

    private Queue<Cashbox> cashboxes;

    public BuyerThread(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (!cashboxes.isEmpty()) {
                    Cashbox cashbox = cashboxes.remove();
                    System.out.println(Thread.currentThread().getName() + " работает с " + cashbox);
                    Thread.sleep(5);
                    System.out.println(Thread.currentThread().getName() + " освобождает " + cashbox);
                    cashboxes.add(cashbox);
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + " ждет");
                    Thread.sleep(5);
                    Thread.currentThread().getState();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
