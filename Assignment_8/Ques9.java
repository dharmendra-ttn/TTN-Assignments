import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Test implements Runnable{
    int id;
    
    Test(int id) {
        this.id = id;
    }
    
    @Override
    public void run() {
        System.out.println("Thread name::"+Thread.currentThread().getName()+" Start :"+id);
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Thread name::"+Thread.currentThread().getName()+" End :"+id);
    }
}

public class Ques9 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i=0;i<=10;i++){
            executorService.submit(new Test(i));
        }
    }
}
