@FunctionalInterface
interface Demo12{
    void printMe(int a, int b);
}
public class Ques3 {
    void add(int a, int b){
        System.out.println("Add is "+ (a+b));
    }
    void substract(int a, int b){
        System.out.println("Substract is "+ (a-b));
    }
    static void multiply(int a, int b){
        System.out.println("Multiply is "+ (a*b));
    }
    public static void main(String[] args) {
        
        Demo12 demo12 = new Ques3()::add;
        demo12.printMe(1,2);
        Demo12 demo = new Ques3()::substract;
        demo.printMe(12,2);
        Demo12 demo1 = Ques3::multiply;
        demo1.printMe(4,2);
        
    }
}
