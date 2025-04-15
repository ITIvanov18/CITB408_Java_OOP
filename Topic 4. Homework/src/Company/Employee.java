package Company;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Employee {
    private String name;
    private int ID;
    private int workedHours;
    private ContractType contractType;
    private BigDecimal additionalSalary;

    public Employee(String name, int ID, int workedHours, ContractType contractType, BigDecimal additionalSalary) {
        this.name = name;
        this.ID = ID;
        this.workedHours = workedHours;
        this.contractType = contractType;
        this.additionalSalary = additionalSalary;
    }

    public Employee(String name, int workedHours, BigDecimal additionalSalary, ContractType contractType) {
        this.name = name;
        this.workedHours = workedHours;
        this.contractType = contractType;
        this.additionalSalary = additionalSalary;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public BigDecimal salary() {
        return BigDecimal.valueOf(contractType.getMinSalary())
                .multiply(BigDecimal.valueOf(workedHours))
                .add(additionalSalary.multiply(BigDecimal.valueOf(workedHours)));
    }

    void increaseSalary(BigDecimal increaseSalary) {
        additionalSalary = additionalSalary.add(additionalSalary
                .multiply(increaseSalary)
                .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP));
    }

}
