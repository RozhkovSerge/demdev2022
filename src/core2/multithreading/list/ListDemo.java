package core2.multithreading.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        Thread thread1 = new Thread(new ListThread(list));
        Thread thread2 = new Thread(new ListThread(list));
        Thread thread3 = new Thread(new ListThread(list));
        Thread thread4 = new Thread(new ListThread(list));
        Thread thread5 = new Thread(new ListThread(list));
        Thread thread6 = new Thread(new ListThread(list));
        Thread thread7 = new Thread(new ListThread(list));
        Thread thread8 = new Thread(new ListThread(list));
        Thread thread9 = new Thread(new ListThread(list));
        Thread thread10 = new Thread(new ListThread(list));
        Thread thread11 = new Thread(new ListThread(list));
        Thread thread12 = new Thread(new ListThread(list));


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
        thread11.start();
        thread12.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        thread6.join();
        thread7.join();

//        System.out.println(list);
//        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
    }
}
