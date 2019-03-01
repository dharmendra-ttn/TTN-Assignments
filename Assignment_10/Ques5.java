import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ques5 {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("ABC");
    
        Supplier<String> supplier = () -> "Supplier Interface";
        System.out.println(supplier.get());
    
        System.out.println("Check whether number is greater than or equal to 18");
        Predicate<Integer> predicate = i -> i>=18 ? true : false;
        System.out.println(predicate.test(17));
    
        System.out.println("Check whether input is 0 or not");
        Function<Integer, Boolean> function = (t) -> t!=0 ? true : false;
        System.out.println(function.apply(45));
    }
}
