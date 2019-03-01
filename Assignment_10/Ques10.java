import java.util.Arrays;
import java.util.List;

public class Ques10{
    public static void main(String[] args) {
        Integer[] arr = {1,4,6,3,88,9,0,1,22,3,4};
        List<Integer> list = Arrays.asList(arr);
        int result = list.stream().filter(i->i>5).reduce(0,(a,b)->a+b);
        System.out.println("Sum is "+ result);
    }
}
