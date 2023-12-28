package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private List<Employee> subordinates;
    private String name;
    private String dept;
    private int salary;

    public Employee(String name, String dept, int salary) {
        this.dept = dept;
        this.name = name;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void addEmployeee(Employee e) {
        subordinates.add(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "subordinates=" + subordinates +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
