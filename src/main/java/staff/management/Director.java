package staff.management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String nationalInsuranceNumber, double salary, String deptName, double budget) {
        super(name, nationalInsuranceNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus() {
        return this.getSalary() * 0.02;
    }
}
