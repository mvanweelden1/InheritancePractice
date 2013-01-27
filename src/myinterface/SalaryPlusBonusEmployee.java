package myinterface;

/**
 *
 * @author Mark Van Weelden
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
    
    private double bonusPay;

    public SalaryPlusBonusEmployee(double bonusPay, String firstName, String lastName, int employeeNumber, double yearlySalary) {
        super(firstName, lastName, employeeNumber, yearlySalary);
        setBonusPay(bonusPay);
    }

    public final void setBonusPay(double bonusPay) {
        this.bonusPay = bonusPay;
    }

    public double getBonusPay() {
        return bonusPay;
    }
    
    
    
}
