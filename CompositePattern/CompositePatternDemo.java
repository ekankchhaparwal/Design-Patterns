package CompositePattern;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("Ekank","Finance",75);
        Employee employee1 = new Employee("nmodu","IT",30);
        Employee employee2 = new Employee("mody","IT",30);
        employee.addEmployeee(employee1);
        employee.addEmployeee(employee2);

        Employee employee3 = new Employee("Intern","IT",10);
        employee1.addEmployeee(employee3);
    }
}
