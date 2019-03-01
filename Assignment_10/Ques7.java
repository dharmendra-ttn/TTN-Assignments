interface Example2 {
    default void printMe(){
        System.out.println("Default-Interface");
    }
}
public class Ques7 implements Example2{
    @Override
    public void printMe() {
        System.out.println("Default-Class");
    }
    
    public static void main(String[] args) {
        Ques7 ques7 = new Ques7();
        ques7.printMe();
    }
}
