import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ques1 {
    public static void main(String[] args) {
        List<Float> lst = new ArrayList<>();
        lst.add(1.2f);
        lst.add(1.3f);
        lst.add(1.4f);
        lst.add(1.5f);
        lst.add(1.6f);
        
        ListIterator listIterator = lst.listIterator();
        
        float sum = 0 ;
        
        while(listIterator.hasNext()){
            sum = sum + (float)listIterator.next();
        }
        System.out.println("Sum of Values: "+ sum);
    }
}
