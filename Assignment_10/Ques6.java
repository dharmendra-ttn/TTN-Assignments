interface Example{
    static void staticMethod(){
        System.out.println("Static method");
    }
    default void defaultMethod(){
        System.out.println("Default Method");
    }
}
public class Ques6 implements Example{
    public static void main(String[] args) {
        Ques6 q = new Ques6();
        Example.staticMethod();
        q.defaultMethod();
        
    }
}
