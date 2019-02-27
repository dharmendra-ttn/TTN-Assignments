public class Ques6 {
    public static void main(String[] args) {
        int a;
        try{
            a=1/0;
        }catch(ArithmeticException ae){
        System.out.println("Arithmetic Exception Occured");
        }catch (Exception e){
            System.out.println("Never Executed");
        }
        finally {
            System.out.println("It will execute 100%");
        }
    }
}

