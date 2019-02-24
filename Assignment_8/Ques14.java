public class Ques14 {
    
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
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            System.out.println("Task 2 END");
        }
    }
    public void task3(){
        synchronized (this) {
            System.out.println("Task 3 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            System.out.println("Task 3 END");
        }
    }
    
    public void task4(){
        synchronized (this) {
            System.out.println("Task 4 Started");
            System.out.println("Task 4 END");
            notifyAll();
        }
    }
    public static void main (String[] args) throws InterruptedException {
        Ques14 q = new Ques14();
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
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                q.task3();
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                q.task4();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
}

