import java.util.*;

public class Ques3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<Character,Integer> map = new HashMap<>();
        System.out.println("Enter String: ");
        String str =  s.nextLine();
        for(Character c : str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for (Character c : map.keySet()){
            System.out.println("Character "+ c + " occured "+ map.get(c) + " times");
        }
    }
}
