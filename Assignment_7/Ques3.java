public class Ques3 {
    public static void main(String[] args) {
        try {
            Class.forName("fake Class");
        
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        A a = new A();
    }
}

//class A{
//
//}
