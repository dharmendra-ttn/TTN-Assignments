import java.util.concurrent.*;

public class Ques6 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
        executorService.shutdown();
        if(future.isDone()){
            try {
                
                System.out.println("Value: "+future.get());
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        if(future.isCancelled()){
            System.out.println("Your Task has been cancelled");
        }
    }
}
