import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Ques7 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        List<Callable<Integer>> lstCallable = new ArrayList<>();
    
    
        lstCallable.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
        
        lstCallable.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
        });
    
        lstCallable.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 4;
            }
        });
    
        lstCallable.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 5;
            }
        });
    
        List<Future<Integer>> lstFuture = executorService.invokeAll(lstCallable);
        for (Future i : lstFuture){
            if(i.isDone()){
                try {
                    System.out.println(i.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
        
    }
}
