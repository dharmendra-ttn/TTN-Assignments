import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executing Thread 1");
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executing Thread 2");
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executing Thread 3");
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executing Thread 4");
                }
            });
        }finally {
            executorService.shutdown();
        }
        
    }
}
