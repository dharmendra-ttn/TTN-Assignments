import java.util.*;

class Employee{
    Double age;
    Double salary;
    String name;
    
    public Employee(Double age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Ques4 {
    public static void main(String[] args) {
        List<Employee> lst = new ArrayList<>();
        lst.add(new Employee(19.0,4000.0,"ABC"));
        lst.add(new Employee(20.0,2000.0,"DEF"));
        lst.add(new Employee(21.0,3000.0,"GHI"));
        lst.add(new Employee(22.0,1000.0,"JKL"));
    
        Collections.sort(lst, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.salary.compareTo(o2.salary);
            }
        });
    
        ListIterator listIterator = lst.listIterator();
        System.out.println("Sorted List: ");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next().toString());
        }
    }

}
