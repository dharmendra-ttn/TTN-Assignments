import java.util.Arrays;
import java.util.List;

public class Ques11 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(arr);
        double avg = list.stream().mapToInt(i->i*2).average().getAsDouble();
        System.out.println("Average : " + avg);
    }
}
