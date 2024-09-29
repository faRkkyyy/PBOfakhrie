// Employee.java
public class Employee extends Sortable {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Implementasi metode compare
    @Override
    public int compare(Sortable other) {
        Employee otherEmployee = (Employee) other;
        if (this.salary < otherEmployee.salary) return -1;
        if (this.salary > otherEmployee.salary) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return name + " (Salary: " + salary + ")";
    }
}
