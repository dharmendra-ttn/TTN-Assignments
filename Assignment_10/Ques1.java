@FunctionalInterface
interface Calc{
    int multiply(int a,int b);
}
@FunctionalInterface
interface Greater{
    boolean isGreater(int x,int y);
}
@FunctionalInterface
interface Increment{
    int increment(int a);
}
@FunctionalInterface
interface StrConc{
    String conc(String str1, String str2);
}
@FunctionalInterface
interface StrUpp{
    String upp(String s1);
}


public class Ques1 {
    public static void main(String[] args) {
        Calc c = (a,b)-> a*b;
        System.out.println(c.multiply(2,6));
        Greater g = ( x, y)->{
            if(x<y)
                return false;
            else
                return true;
        };
        System.out.println(g.isGreater(1,2));
        
        Increment i = a -> ++a;
        System.out.println(i.increment(1));
        
        StrConc s = (str1,str2)-> str1.concat(str2);
        System.out.println(s.conc("ABC","CDE"));
        
        StrUpp sp = s1 -> s1.toUpperCase();
        System.out.println(sp.upp("abc"));
    }
}
