import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ques8 {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread executed after 2 seconds");
            }
        },2, TimeUnit.SECONDS);
        executorService.shutdown();
        
//        executorService.scheduleAtFixedRate(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread executed using scheduleAtFixedRate");
//            }
//        },1,2,TimeUnit.SECONDS);
        
//        executorService.scheduleWithFixedDelay(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(3000L);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Thread executed using scheduleAtFixedDelay");
//
//            }
//        },1,2,TimeUnit.SECONDS);
    }
}
