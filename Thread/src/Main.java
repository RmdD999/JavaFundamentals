public class Main {
    public static void main(String[] args) throws InterruptedException {

//        System.out.println(Thread.activeCount());

        Thread.currentThread().setName("MAINNN");
//        System.out.println(Thread.currentThread().getName()); //return main thread name

        //CHECK PRIORITY &change priority
        Thread.currentThread().setPriority(10); //highest
//        System.out.println(Thread.currentThread().getPriority());

        // check is alive
//        System.out.println(Thread.currentThread().isAlive());

//        for (int i = 3;i>0;i--){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("You are done!");

        //create second thread
        MyThread thread2 = new MyThread();
        thread2.setDaemon(true);

        thread2.start();
        System.out.println(thread2.isDaemon());
        //System.out.println(thread2.isAlive());
        thread2.setName("Second thread");
        thread2.setPriority(2);
//        System.out.println(thread2.getName());
//        System.out.println(thread2.getPriority());
//
//        System.out.println(Thread.activeCount());
    }
}