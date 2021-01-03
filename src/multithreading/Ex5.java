package multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("мой поток");
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of myThread5 = " + myThread5.getName()
                + " Priority myThread5 = " + myThread5.getPriority());
        myThread5.start();
    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("Привет");
    }
}