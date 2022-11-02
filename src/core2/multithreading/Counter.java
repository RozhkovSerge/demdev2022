package core2.multithreading;

public class Counter {

    private int count;

    public synchronized void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}
