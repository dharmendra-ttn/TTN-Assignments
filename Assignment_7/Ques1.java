abstract class Library{
    String lib_name;
    String lib_address;
    
    abstract void library_details();
    Library(){
        lib_name = "Example Library";
        lib_address="Noida";
    }
}

interface library_util{
    int seat_cap = 500;
    void issuebook();
    void returnbook();
}
public class Ques1 extends Library implements library_util{
    
    
    @Override
    void library_details() {
    
    }
    
    @Override
    public void issuebook() {
    
    }
    
    @Override
    public void returnbook() {
    
    }
    
    public void getMemberDetails(){
    
    }
    
    public static void main(String[] args) {
        Ques1 q = new Ques1();
        q.library_details();
        q.issuebook();
        q.returnbook();
        q.getMemberDetails();
    }
}
