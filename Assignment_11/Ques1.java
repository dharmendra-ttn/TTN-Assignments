class Dummy{
    static Dummy dummy;
    int value;
    private Dummy(){
        this.value = 1;
    }
    static Dummy getInstance(){
        if(dummy == null){
            dummy = new Dummy();
        }
        return dummy;
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Dummy d = Dummy.getInstance();
        System.out.println(d.value);
        Dummy d2 = Dummy.getInstance();
        System.out.println(d2.value);
        d.value = 123;
        System.out.println(d.value);
        System.out.println(d2.value);
    }
}
