interface Demo1{
    default void printMe(){
        System.out.println("In Demo 1");
    }
    
}
interface Demo3{
    default void print(){
        System.out.println("In Demo 3");
    }
    
}
interface Demo4 extends Demo1,Demo3{

}
public class Ques8 implements Demo4{
    
    public static void main(String[] args) {
        Ques8 q = new Ques8();
        q.printMe();
        q.print();
    }
}
