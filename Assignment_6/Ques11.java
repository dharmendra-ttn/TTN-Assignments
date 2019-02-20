    class Bank{
    void getDetails(){
        System.out.println("Name : Default");
        System.out.println("Rate of Interest : 10");
    }
    }
    class SBI extends Bank{
    void getDetails(){
        System.out.println("Name : SBI");
        System.out.println("Rate of Interest : 12");
    }
    }
    class BOI extends Bank{
    void getDetails(){
        System.out.println("Name : BOI");
        System.out.println("Rate of Interest : 13");
    }
    }
    class ICICI extends Bank{
    void getDetails(){
        System.out.println("Name : ICICI");
        System.out.println("Rate of Interest : 14");
    }
    }
public class Ques11 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.getDetails();
        SBI s = new SBI();
        s.getDetails();
        BOI bi = new BOI();
        bi.getDetails();
        ICICI ic = new ICICI();
        ic.getDetails();
        
    }
}
