import java.util.*;

class Student{
    String name;
    Double Score;
    Double age;
    
    public Student(String name, Double score, Double age) {
        this.name = name;
        Score = score;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Score=" + Score +
                ", age=" + age +
                '}';
    }
}

public class Ques5 {
    public static void main(String[] args) {
        List<Student> lst = new ArrayList<>();
        lst.add(new Student("ABC",99.0,17.0));
        lst.add(new Student("XYZ",150.0,18.0));
        lst.add(new Student("ZXC",101.0,19.0));
        lst.add(new Student("LON",102.0,22.0));
        lst.add(new Student("POU",101.0,21.0));
    
        Collections.sort(lst, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.Score.equals(o2.Score)){
                    return o1.name.compareTo(o2.name);
                }else{
                    return o1.Score.compareTo(o2.Score);
                }
            }
        });
        System.out.println("Sorted : ");
        ListIterator listIterator = lst.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        
    }
}
