class Employee {
    void work(){
        System.out.println("Employee is working");
    }
    
}
class Manager extends Employee{
    void attendmeeting(){
        System.out.println("Manager is attending  a meeting");
    }
}
public class main{
    public static void Main(String[] args) {
    Manager m= new Manager();
    m.work();
    m.attendmeeting();
    }
}

