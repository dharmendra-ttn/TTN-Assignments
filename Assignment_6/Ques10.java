public class Ques10 {
    
    public static void main(String[] args) {
    
        System.out.println("Adding Int :" + adding(1,2));
        System.out.println("Adding Double :" + adding(2.1 , 2.2));
        System.out.println("Multiplying Float :" + multiply(1.2f,1.5f));
        System.out.println("Multiplying Int :" + multiply(4,5));
        System.out.println("Adding two String :" + concate_str("abc","cde"));
        System.out.println("Adding three String :" + concate_str("abc","def", "ghi"));
        
    }
    static int adding(int a, int b){
        return a+b;
    }
    static double adding(double a, double b){
        return a+b;
    }
    static int multiply(int a, int b){
        return a*b;
    }
    static float multiply(float a, float b){
        return a*b;
    }
    static String concate_str(String a, String b){
        return a+b;
    }
    static String concate_str(String a, String b, String c){
        return a+b+c;
    }
    
    
}
