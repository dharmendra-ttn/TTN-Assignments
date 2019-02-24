public class Ques13 {
    
    public void task1(){
        synchronized (this) {
            System.out.println("Task 1 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    
            System.out.println("Task 1 END");
        }
    }
    public void task2(){
        synchronized (this) {
            System.out.println("Task 2 Started");
            System.out.println("Task 2 END");
            notify();
        }
    }
    public static void main (String[] args) throws InterruptedException {
        Ques13 q = new Ques13();
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
        
    }
}

