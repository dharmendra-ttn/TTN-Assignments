import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        while(!word.equals("done")){
            if(word.charAt(0) == word.charAt(word.length()-1)){
                System.out.println("First Character matches the Last Character");
            }else{
                System.out.println("First Character does not match with Last Character");
            }
            word = s.nextLine();
        }
        
//        do{
//            if(word.charAt(0) == word.charAt(word.length()-1)){
//                System.out.println("First Character matches the Last Character");
//            }else{
//                System.out.println("First Character does not match with Last Character");
//            }
//            word = s.nextLine();
//
//        }while (!word.equals("done"));
    }
}

