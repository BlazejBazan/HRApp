package HRApp;

import java.util.LinkedList;

public class Department {
    private String name;
    private LinkedList<Employee> employees = new LinkedList<>();


    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }

    public Employee getEmployee(int id) throws Exception {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        throw new Exception("Employee not exist");
    }

    public double totalSalaryOfAllEmployees() {
        double total = 0.0;
        for (Employee employee :
                employees) {
            total += employee.getSalary();
        }
        return total;
    }

    public double averageSalaryOfSalary() {
        return totalSalaryOfAllEmployees() / getNumberOfEmployees();
    }
}
