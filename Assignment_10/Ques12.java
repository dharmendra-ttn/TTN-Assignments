import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Ques12 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,5,6,7,9};
        List<Integer> list = Arrays.asList(arr);
        try{
            int a = list.stream().filter(i->i>3 && i%2==0).findFirst().get();
            System.out.println(a);
        }catch(NoSuchElementException e){
            System.out.println("Element Not Found");
        }
    }
}
