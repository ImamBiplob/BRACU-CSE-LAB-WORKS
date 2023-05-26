public class task1 {
    public static void main( String[] args) {
        MyThreads mt1 = new MyThreads("thread1");
        MyThreads mt2 = new MyThreads("thread2");
        mt1.start=1;
        mt1.end=10;
        mt1.start();
        try {
            mt1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mt2.start=11;
        mt2.end=20;
        mt2.start();
        try {
            mt2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mt1=new MyThreads("thread1");
        mt1.start=21;
        mt1.end=30;
        mt1.start();
    }
}
class MyThreads extends Thread {
    public int start=0,end=0;
    MyThreads(String name){
     super(name);
    }
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i+" from "+Thread.currentThread().getName());
        }
    }
}