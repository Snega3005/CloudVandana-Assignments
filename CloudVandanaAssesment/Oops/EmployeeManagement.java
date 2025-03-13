// Design a simple Java class Employee with the following attributes:
// • id (integer)
// • name (string)
// • salary (double)
// Create a method displayDetails() to print employee details. Write a main method to:
// 1. Create at least 3 Employee objects.
// 2. Store them in a list.
// 3. Display their details.



import java.util.ArrayList;
import java.util.List;

class Employee {
     int id;
     String name;
     double salary;

    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee(101, "Alice Johnson", 55000);
        Employee emp2 = new Employee(102, "Bob Smith", 62000);
        Employee emp3 = new Employee(103, "Charlie Brown", 48000);

       
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
