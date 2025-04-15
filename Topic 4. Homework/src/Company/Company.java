package Company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    private final int maxNumberOfEmployees;
    private List<Employee> employees;

    public Company(String companyName, int maxNumberOfEmployees, List<Employee> employees) {
        this.companyName = companyName;
        this.maxNumberOfEmployees = maxNumberOfEmployees;
        this.employees = employees;
    }

    public Company(String companyName, int maxNumberOfEmployees) {
        this.companyName = companyName;
        this.maxNumberOfEmployees = maxNumberOfEmployees;
        this.employees = new ArrayList<Employee>(maxNumberOfEmployees);
    }

    boolean isEmployeeHired(Employee employee) {
        for (Employee emp : employees) {
            if (emp.getID() == employee.getID()) {
                return true;
            }
        }
        return false;
    }

    public void hireEmployee(Employee employee) {
        if (employees.size() < maxNumberOfEmployees && !employees.contains(employee)) {
            employees.add(employee);
        }
    }

    void fireEmployee(Employee employee) {
        employees.remove(employee);
    }

    public BigDecimal averageSalary() {
        BigDecimal totalSalary = BigDecimal.ZERO;
        if (employees.isEmpty()) {
            return BigDecimal.ZERO;
        }
        for (Employee emp : employees) {
            totalSalary = totalSalary.add(emp.salary());
        }
        totalSalary = totalSalary.divide(BigDecimal.valueOf(employees.size()), 2, RoundingMode.HALF_UP);
        return totalSalary;
    }

    public void increaseSalaries(BigDecimal increasePercentage) {
        if (increasePercentage.compareTo(BigDecimal.ZERO) < 0) {
            increasePercentage = BigDecimal.ZERO;
        }
        for (Employee emp : employees) {
            emp.increaseSalary(increasePercentage);
        }
    }

    public BigDecimal averageSalaryPerContractType(ContractType contractType) {
        int counter = 0;
        if (employees.isEmpty()) {
            return BigDecimal.ZERO;
        }
        BigDecimal totalSalary = BigDecimal.ZERO;
        for (Employee emp : employees) {
            if (emp.getContractType() == contractType) {
                totalSalary = totalSalary.add(emp.salary());
                counter++;
            }
        }
        if (counter==0)
        {
            return BigDecimal.ZERO;
        }
        totalSalary = totalSalary.divide(BigDecimal.valueOf(counter), 2, RoundingMode.HALF_UP);
        return totalSalary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
