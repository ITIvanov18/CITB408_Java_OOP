package Company;

public enum ContractType {
    PERMANENT, PART_TIME, TRAINEE;

    private double minSalary;

    public double getMinSalary() {
        return minSalary;
    }

    // Setter to update the minSalary at runtime
    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }
}
