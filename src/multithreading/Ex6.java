package multithreading;

public class Ex6 implements Runnable {

    @Override
    public void run() {
        System.out.println("method run. Thread name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex6());
        thread.start();
        System.out.println("method main. Thread name = " + Thread.currentThread().getName());

    }
}
