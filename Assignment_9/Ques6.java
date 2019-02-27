import java.util.*;
import java.util.List;

public class Ques6 {
    public static void main(String[] args) {
        Integer[] arr = {1, 1, 1, 1, 3, 3, 4, 4, 4, 4, 4, 5, 5, 9, 8, 8, 8, 0};
    
        List<Integer> lst = new ArrayList(Arrays.asList(arr));
        Map<Integer,Integer> map = new LinkedHashMap<>();
        
        ListIterator<Integer> listIterator = lst.listIterator();
        
        while(listIterator.hasNext()){
            int t1 = listIterator.next();
            map.put(t1,Collections.frequency(lst,t1));
        }
        
        List<Map.Entry<Integer,Integer>> listSort = new ArrayList<>(map.entrySet());
        Collections.sort(listSort, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return -o1.getValue().compareTo(o2.getValue());
            }
        });
        
        Map<Integer,Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> entry : listSort){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
    
        System.out.println("Sorted Elements: ");
        for(Integer i : sortedMap.keySet()){
            System.out.println("Element : " +i + " Frequency : "+ sortedMap.get(i));
        }
        }
    }

