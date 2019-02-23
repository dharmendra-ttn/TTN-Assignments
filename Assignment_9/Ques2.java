import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ques2 {
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        Set<Character> set = new HashSet();
        for(Character c :  str.toCharArray()){
            set.add(c);
        }
        System.out.println("Number of Unique Characters: "+ set.size());
    }
}
