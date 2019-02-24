public class Ques2{
    
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Executing Thread : " + Thread.currentThread().getName());
        
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Executing Thread : "+ Thread.currentThread().getName());
        
            }
        });
        
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread");
    }
}
