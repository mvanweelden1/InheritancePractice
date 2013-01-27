package myconcrete;

/**
 *
 * @author Mark Van Weelden
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    
    private double bonusPay;

    public SalaryPlusBonusEmployee(double yearlySalary, String firstName, String lastName, int employeeNumber) {
        super(yearlySalary, firstName, lastName, employeeNumber);
    }

    public void setBonusPay(double bonusPay) {
        this.bonusPay = bonusPay;
    }

    @Override
    public double getWeeklyPay() {
        
        double weeklyPay;
        weeklyPay = getWeeklyPay() + bonusPay;
        return weeklyPay;
    }
    
    
    
}
