package multithreading;

import java.lang.reflect.Field;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work ");
        countDownLatch.countDown();
        System.out.println("countDownLatch " + countDownLatch.getCount());
    }

    private static void everyThisIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Every this is ready, so let's open market ");
        countDownLatch.countDown();
        System.out.println("countDownLatch " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market os opened ");
        countDownLatch.countDown();
        System.out.println("countDownLatch " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Zaur", countDownLatch);
        new Friend("Oleg", countDownLatch);
        new Friend("Elena", countDownLatch);
        new Friend("Viktor", countDownLatch);
        new Friend("Marina", countDownLatch);

        marketStaffIsOnPlace();
        everyThisIsReady();
        openMarket();
    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    public void run(){
        try {
            countDownLatch.await();
            System.out.println(name + " приступил(а) к закупкам");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}