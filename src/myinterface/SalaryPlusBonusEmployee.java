package myinterface;

import java.text.DecimalFormat;

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

    @Override
    public double getGrossWeeklyPay() {
        double weeklyPay;
        weeklyPay = super.getGrossWeeklyPay() + bonusPay;
        return weeklyPay;
    }
    
    
    
    @Override
    public String toString() {
        String str = super.toString();
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return "SalaryPlusBonusEmployee[" + str + "Bonus Pay: $" 
                + formatter.format(bonusPay) + ']';
    }
    
}
