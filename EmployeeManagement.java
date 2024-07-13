import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    private List<Employee> employees;

    public EmployeeManagement() {
        this.employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void viewEmployees() {
        for (Employee employee : employees) {
            employee.displayEmployeeDetails();
            System.out.println("---------------");
        }
    }
    public Employee getEmployee(int id) {
        for(Employee employee : employees){
            if (employee.getId() == id){
                return employee;
            }
        }
        return null;
    }
    public void updateEmployee(int id, String name, String position, double salary) {
        Employee employee = getEmployee(id);
        if(employee != null) {
            employee.setName(name);
            employee.setPosition(position);
            employee.setSalary(salary);
            System.out.println("Employee details updated succesfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
    public void deleteEmployee(int id) {
        Employee employee = getEmployee(id);
        if (employee != null){
            employees.remove(employee);
            System.out.println("Employee deleted succesfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}
