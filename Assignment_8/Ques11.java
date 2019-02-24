public class Ques11 {
    
    int count;
    
    void increment(){
        synchronized (this) {
            count++;
        }
    }
    public void task1(){
        for (int i=0;i<1000;i++){
            increment();
        }
    }
    public void task2(){
        for (int i=0;i<1000;i++){
            increment();
        }
    }
    public static void main (String[] args) throws InterruptedException {
        Ques11 q = new Ques11();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                q.task1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                q.task2();
            }
        });
        
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        
        System.out.println(q.count);
    }
}
