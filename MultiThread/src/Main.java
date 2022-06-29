public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread thread  = new MyThread();

        // another way to create a thread
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

//        thread.setDaemon(true);
//        thread2.setDaemon(true);

        thread.start();
//        thread.join(3000); // main thread gotta wait when thread1 finish
        thread2.start();

//        System.out.println(1/0);

    }
}