import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques5 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executing Thread :1");
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executing Thread :2");
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executing Thread :3");
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
//                    try {
//                        Thread.sleep(4000L);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println("Executing Thread :4");
                }
            });
        }finally {
            executorService.shutdown();
        }
        System.out.println("isshutdown(): "+executorService.isShutdown());
        System.out.println("isterminated(): "+executorService.isTerminated());
        
    }
}
