class Singleton {
    int a;
    private static Singleton s1 = null;
    
    private Singleton() {
    
    }
    
    public static Singleton getInstance() {
        if (null == s1) {
            s1 = new Singleton();
        }
        return s1;
    }
}
public class Ques4 {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
        
        x.a = 10;
    
        System.out.println("Value of a by x : " + x.a);
        System.out.println("Value of a by y : " + y.a);
        System.out.println("Value of a by z : " + z.a);
    }
}
