import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagement employeeManagement = new EmployeeManagement();

        while (true) {
            System.out.println("Employee Management System:");
            System.out.println("1: Add Employee");
            System.out.println("2: View Employees");
            System.out.println("3: Update Employee");
            System.out.println("4: Delete Employee");
            System.out.println("5: Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Employee ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Employee Name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter Employee Position:");
                    String position = scanner.nextLine();
                    System.out.println("Enter Employee Salary:");
                    double salary = scanner.nextDouble();
                    employeeManagement.addEmployee(new Employee(id, name, position, salary));
                    break;

                case 2:
                    employeeManagement.viewEmployees();
                    break;

                case 3:
                    System.out.println("Enter Employee ID to Update:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter New Employee Name:");
                    name = scanner.nextLine();
                    System.out.println("Enter New Employee Position:");
                    position = scanner.nextLine();
                    System.out.println("Enter New Employee Salary:");
                    salary = scanner.nextDouble();
                    employeeManagement.updateEmployee(id, name, position, salary);
                    break;

                case 4:
                    System.out.println("Enter Employee ID to Delete:");
                    id = scanner.nextInt();
                    employeeManagement.deleteEmployee(id);
                    break;

                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");

            }
        }

    }
}