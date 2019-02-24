class A extends Thread{
    @Override
    public void run() {
        System.out.println("Thread By Extending Thread Class");
    }
}
class B implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread by Runnable Interface");
    }
}
public class Ques1 {
    public static void main(String[] args) {
        
        A a = new A();
        a.start();
        
        new Thread(new B()).start();
        
    }
}
