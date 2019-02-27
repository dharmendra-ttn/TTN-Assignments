class Check implements Cloneable{
    int a;
    Check(int a){
    this.a = a;
    }
//    Copy Constructor
    Check(Check c){
        this.a = c.a;
    }
    
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class Ques5 {
    public static void main(String[] args) {
        try{
            Check c1 = new Check(2);
            Check c2 = (Check) c1.clone();
            Check c3 = new Check(c1);
            System.out.println("Value in C1 " + c1.a);
            System.out.println("Value in C2 " + c2.a);
            System.out.println("Value in C3 "+ c3.a);
        }catch(CloneNotSupportedException e){
        e.printStackTrace();
        }
        
    }
}
