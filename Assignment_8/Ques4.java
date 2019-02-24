import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques4 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executing Thread : 1");
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executing Thread : 2");
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executing Thread : 3");
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(4000L);
                        System.out.println("Executing Thread 4");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }finally {
//            Thread.sleep(5000L);
//            executorService.shutdown();
            executorService.shutdownNow();
        }
        System.out.println("Main Thread Executed");
    }
}
