package core2.multithreading;

public class CounterThreadRunner {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Thread thread1 = new Thread(new CounterThread(counter));
        Thread thread2 = new Thread(new CounterThread(counter));
        Thread thread3 = new Thread(new CounterThread(counter));
        Thread thread4 = new Thread(new CounterThread(counter));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println(counter.getCount());
    }
}
