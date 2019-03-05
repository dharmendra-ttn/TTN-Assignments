import java.util.ArrayList;
import java.util.List;

interface Directory {
    void showDirectoryDetails();
}

class Employee implements Directory {
    
    private String name;
    private String department;
    
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
    
    @Override
    public void showDirectoryDetails() {
        System.out.println("Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}');
    }
}

class Manager implements Directory {
    private String name;
    private String department1;
    
    public Manager(String name, String type) {
        this.name = name;
        this.department1 = type;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDepartment1() {
        return department1;
    }
    
    public void setDepartment1(String department1) {
        this.department1 = department1;
    }
    
    @Override
    public void showDirectoryDetails() {
        System.out.println("Manager{" +
                "name='" + name + '\'' +
                ", department='" + department1 + '\'' +
                '}');
    }
    
    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", department='" + department1 + '\'' +
                '}';
    }
}

class ManagerDirectory implements Directory {
    
    List<Directory> managerDirectory = new ArrayList<>();
    
    @Override
    public void showDirectoryDetails() {
        System.out.println("Manager Directory");
        managerDirectory.forEach(e -> e.showDirectoryDetails());
    }
}

class EmployeeDirectory implements Directory {
    
    List<Directory> employeeDirectory = new ArrayList<>();
    
    @Override
    public void showDirectoryDetails() {
        System.out.println("Employee Directory");
        employeeDirectory.forEach(e -> e.showDirectoryDetails());
    }
}

class CompanyDirectory implements Directory {
    
    List<Directory> companyDirectory = new ArrayList<>();
    
    @Override
    public void showDirectoryDetails() {
        companyDirectory.forEach(e -> e.showDirectoryDetails());
    }
}

public class Ques7 {
    public static void main(String[] args) {
        
        Employee developer1 = new Employee("Vishal", "Production");
        Employee developer2 = new Employee("Dharmendra", "Production");
        
        Manager manager1 = new Manager("Lalit", "HR");
        Manager manager2 = new Manager("Sheetal", "Sales");
        
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.employeeDirectory.add(developer1);
        employeeDirectory.employeeDirectory.add(developer2);
        
        ManagerDirectory manageDirectory = new ManagerDirectory();
        manageDirectory.managerDirectory.add(manager1);
        manageDirectory.managerDirectory.add(manager2);
        
        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.companyDirectory.add(manageDirectory);
        companyDirectory.companyDirectory.add(employeeDirectory);
        
        companyDirectory.showDirectoryDetails();
    }
}