package core2.multithreading;

public class App {
    public static void main(String[] args) throws InterruptedException {

        Thread simpleThread = new SimpleThread();
        simpleThread.start();

        var hello_from_runnable = new Thread(() -> System.out.println("Hello from runnable"));
        System.out.println(hello_from_runnable.getName() + ":" + hello_from_runnable.getState());

        hello_from_runnable.start();
        System.out.println(hello_from_runnable.getName() + ":" + hello_from_runnable.getState());
        hello_from_runnable.join();
        System.out.println(hello_from_runnable.getName() + ":" + hello_from_runnable.getState());
        simpleThread.join();

        System.out.println(Thread.currentThread().getName());
    }
}
