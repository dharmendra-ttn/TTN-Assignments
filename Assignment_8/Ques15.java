import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ques15 {
    
    Lock lock = new ReentrantLock(true);
    Condition condition = lock.newCondition();
    
    public void task1(){
            lock.lock();
            System.out.println("Task 1 Started");
        try {
            condition.await();
            System.out.println("Task 1 END");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        }
//    public void task2(){
//        lock.lock();
//        System.out.println("Task 2 Started");
//        try {
//            condition.await();
//            System.out.println("Task 2 END");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }finally {
//            lock.unlock();
//        }
//    }
    
    public void task3(){
        try {
            lock.lock();
            System.out.println("Task 3 Started");
            System.out.println("Task 3 END");
            condition.signal();
//            condition.signalAll();
        }finally {
            lock.unlock();
        }
       
    }
    public static void main (String[] args) throws InterruptedException {
        Ques15 q = new Ques15();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                q.task1();
            }
        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                q.task2();
//            }
//        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                q.task3();
            }
        });
        
        t1.start();
//        t2.start();
        t3.start();
        
    }
}

