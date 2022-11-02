package core2.multithreading;

public class SimpleThread extends Thread{

    @Override
    public void run() {
        System.out.println(getName());
    }
}
