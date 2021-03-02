package HRApp;


public class HRApp {

    public static void main(String[] args) throws Exception {
        System.out.println("Application start");

        Department department = new Department("Software House");
        System.out.println(department.toString());
//        department.addEmployee(new Employee(1, "Ben", 3000));
//        department.addEmployee(new Employee(2, "Adam", 16000));
//        department.addEmployee(new Employee(3, "Jerzy", 10000));
//        department.addEmployee(new Employee(4, "Edward", 5000));
//        department.addEmployee(new Employee(5, "Kamil", 9000));

        for (Employee employee :
                department.getEmployees()) {
            System.out.println(employee.toString());
        }
        System.out.println("Total salary = " + department.totalSalaryOfAllEmployees());
        System.out.println("Average salary = " + department.averageSalaryOfSalary());

        //System.out.println(department.getEmployee(6));
    }
}