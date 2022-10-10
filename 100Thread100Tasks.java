class Task1 extends Thread {
    public void run(){
        System.out.println("MyThread18");
    }
}
class NewThread {
    public static void main(String[] args) {
        for (int i = 0; i <=100; i++) {
            Task t1 = new Task();
            t1.start();
        }
    }
}
