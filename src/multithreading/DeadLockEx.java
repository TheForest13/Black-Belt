package multithreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    public void run() {
        System.out.println("Thread10: попытка захватить монитор lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread10: Монитор lock1 захвачен");
            System.out.println("Thread10: попытка захватить монитор lock2");

            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread10: Мониторы lock1 и lock2 захвачены");

            }
        }
    }
}

class Thread20 extends Thread {
    public void run() {
        System.out.println("Thread20: попытка захватить монитор lock2");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread20: Монитор lock2 захвачен");
            System.out.println("Thread20: попытка захватить монитор lock1");

            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread20: Мониторы lock1 и lock2 захвачены");

            }
        }
    }
}