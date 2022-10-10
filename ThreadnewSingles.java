import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
    public void run(){
        System.out.println("MyThread18  "+Thread.currentThread().getName());
    }
}
class NewTh {
    public static void main(String[] args) {
        //ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        ExecutorService service = Executors.newSingleThreadExecutor();
        //System.out.println(Runtime.getRuntime().availableProcessors());
        for (int i = 0; i <=100; i++) {
            service.execute(new Task());
           // Task t1 = new Task();
            //t1.start();
        }
    }
}

