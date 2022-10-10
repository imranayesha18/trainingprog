class Task extends Thread {
    public void run(){
        System.out.println("MyThread18");
    }
}
class NewTh {
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {
            Task t1 = new Task();
            t1.start();
        }
    }
}
