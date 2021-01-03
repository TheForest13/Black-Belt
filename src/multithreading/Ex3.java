package multithreading;

public class Ex3 implements Runnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Ex3());
        thread1.start();

        for (int i=1000; i >0; i--){
            System.out.println(i);
        }
    }

    @Override
    public void run() {
        for (int i=1; i <= 1000; i++){
            System.out.println(i);
        }
    }
}

//class MyThread3 implements Runnable {
//    @Override
//    public void run() {
//        for (int i=1; i <= 1000; i++){
//            System.out.println(i);
//        }
//    }
//}
//class MyThread4 implements Runnable {
//    @Override
//    public void run() {
//        for (int i=1000; i >0; i--){
//            System.out.println(i);
//        }
//    }
//}