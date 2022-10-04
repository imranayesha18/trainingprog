public class MyThread  extends Thread {
    public void run() {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+currentThread().getName());
        }
        System.out.println("i am custom thread"+Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println("i am custom thread"+Thread.currentThread().getName());
        t1.setName("ownThread");

        t1.start();
        t1.join();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+currentThread().getName());
        }
    }
}

