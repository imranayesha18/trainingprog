class MyThread11 extends Thread {

    public void run() {
        System.out.println("Name of the thread "+Thread.currentThread().getName());

    }
}
class ThreadAvailProcc {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService service=Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for(int i=0;i<100;i++) {
            MyThread t1 = new MyThread();
            service.execute(t1);
        }
        service.shutdown();
    }

}

