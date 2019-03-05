class Student{
    private String name;
    private Integer admission_no;
    private Integer roll_no;
    private boolean optedForHostel;
    private boolean optedForBus;
    private Integer fees;
    
    public Student(StudentBuilder studentBuilder){
        name = studentBuilder.getName();
        admission_no = studentBuilder.getAdmission_no();
        roll_no = studentBuilder.getRoll_no();
        optedForHostel = studentBuilder.isOptedForHostel();
        optedForBus = studentBuilder.isOptedForBus();
        fees = studentBuilder.getFees();
    }
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getAdmission_no() {
        return admission_no;
    }
    
    public void setAdmission_no(Integer admission_no) {
        this.admission_no = admission_no;
    }
    
    public Integer getRoll_no() {
        return roll_no;
    }
    
    public void setRoll_no(Integer roll_no) {
        this.roll_no = roll_no;
    }
    
    public boolean isOptedForHostel() {
        return optedForHostel;
    }
    
    public void setOptedForHostel(boolean optedForHostel) {
        this.optedForHostel = optedForHostel;
    }
    
    public boolean isOptedForBus() {
        return optedForBus;
    }
    
    public void setOptedForBus(boolean optedForBus) {
        this.optedForBus = optedForBus;
    }
    
    public Integer getFees() {
        return fees;
    }
    
    public void setFees(Integer fees) {
        this.fees = fees;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", admission_no=" + admission_no +
                ", roll_no=" + roll_no +
                ", optedForHostel=" + optedForHostel +
                ", optedForBus=" + optedForBus +
                ", fees=" + fees +
                '}';
    }
}

class StudentBuilder{
    private String name;
    private Integer admission_no;
    private Integer roll_no;
    private boolean optedForHostel;
    private boolean optedForBus;
    private Integer fees;
    
    public StudentBuilder(String name, Integer admission_no){
        this.name = name;
        this.admission_no = admission_no;
    }
    
    public String getName() {
        return name;
    }
    
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    public Integer getAdmission_no() {
        return admission_no;
    }
    
    public StudentBuilder setAdmission_no(Integer admission_no) {
        this.admission_no = admission_no;
        return this;
    
    }
    
    public Integer getRoll_no() {
        return roll_no;
    }
    
    public StudentBuilder setRoll_no(Integer roll_no) {
        this.roll_no = roll_no;
        return this;
    
    }
    
    public boolean isOptedForHostel() {
        return optedForHostel;
    }
    
    public StudentBuilder setOptedForHostel(boolean optedForHostel) {
        this.optedForHostel = optedForHostel;
        return this;
    
    }
    
    public boolean isOptedForBus() {
        return optedForBus;
    }
    
    public StudentBuilder setOptedForBus(boolean optedForBus) {
        this.optedForBus = optedForBus;
        return this;
    
    }
    
    public Integer getFees() {
        return fees;
    }
    
    public StudentBuilder setFees(Integer fees) {
        this.fees = fees;
        return this;
    }
    
    public Student build(){
        return new Student(this);
    }
}

public class Ques4{
    public static void main(String[] args) {
        Student student = new StudentBuilder("ABC",123).setRoll_no(19999).setOptedForBus(true).setOptedForHostel(false).setFees(2000).build();
        System.out.println(student);
    }
}