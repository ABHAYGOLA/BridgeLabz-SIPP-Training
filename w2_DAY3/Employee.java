package w2_DAY3;
import java.util.ArrayList;
import java.util.List;
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String deptName;
    List<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}

class Company {
    String companyName;
    List<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }
}
