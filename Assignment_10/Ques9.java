import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques9 {
    public static void main(String[] args){
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = Arrays.asList(arr);
        List<Integer> result = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
