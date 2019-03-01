@FunctionalInterface
interface Demo2{
    int return_int(int a, int b);
}
public class Ques2 {
    public static void main(String[] args) {
        Demo2 d = (x,y)-> x+y;
    
        System.out.println(d.return_int(1,2));
    }
}
