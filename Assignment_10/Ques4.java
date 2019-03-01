@FunctionalInterface
interface GetInstanceInterface{
    Employee getInstanceCons(String name, int age, String city);
}

class Employee{
    String name;
    int age;
    String city;
    
    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
public class Ques4 {
    public static void main(String[] args) {
        GetInstanceInterface getInstanceInterface = Employee::new;
        Employee e = getInstanceInterface.getInstanceCons("Dharmendra",20,"Noida");
        System.out.println(e.toString());
    }
}
