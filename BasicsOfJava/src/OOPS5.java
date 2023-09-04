import java.util.Scanner;

class Employee {
    String name;
    int yoj;
    int salary;
    String address;
}
public class OOPS5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Employee emp1 = new Employee();
        emp1.name = "John";
        emp1.yoj = 2000;
        emp1.salary = 5000;
        emp1.address = "Delhi";
        Employee emp2 = new Employee();
        emp2.name = "Sam";
        emp2.yoj = 2000;
        emp2.address = "Mumbai";
        Employee emp3 = new Employee();
        emp3.name = "Robert";
        emp3.yoj = 1999;
        emp3.address = "Bengaluru";
        System.out.println(emp1.name+" "+emp1.yoj+" "+emp1.address);
        System.out.println(emp2.name+" "+emp2.yoj+" "+emp2.address);
        System.out.println(emp3.name+" "+emp3.yoj+" "+emp3.address);
    }
}
