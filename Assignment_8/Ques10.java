public class Ques10 {
    
    int count;
    
    synchronized void increment(){
        count++;
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
        Ques10 q = new Ques10();
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
