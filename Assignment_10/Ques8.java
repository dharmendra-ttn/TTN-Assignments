interface Demo1{
    default void printMe(){
        System.out.println("In Demo 1");
    }
    
}
interface Demo3{
    default void printMe(){
        System.out.println("In Demo 3");
    }
    
}
public class Ques8 implements Demo1,Demo3{
    void printMe(){
	Demo1.super.printMe();
	}
    public static void main(String[] args) {
        Ques8 q = new Ques8();
        q.printMe();
        q.print();
    }
}
