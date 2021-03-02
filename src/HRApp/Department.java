package HRApp;

import java.util.LinkedList;

public class Department {
    private String name;
    private LinkedList<Employee> employees = new LinkedList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }

    //TODO remove exception
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
        return totalSalaryOfAllEmployees() != 0.0 ? totalSalaryOfAllEmployees() / getNumberOfEmployees() : 0.0;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}
