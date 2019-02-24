import java.util.concurrent.atomic.AtomicInteger;

public class Ques12 {
    
    AtomicInteger count = new AtomicInteger();
    
    public void task1(){
        for (int i=0;i<1000;i++){
            count.incrementAndGet();
        }
    }
    public void task2(){
        for (int i=0;i<1000;i++){
            count.incrementAndGet();
        }
    }
    public static void main (String[] args) throws InterruptedException {
        Ques12 q = new Ques12();
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
