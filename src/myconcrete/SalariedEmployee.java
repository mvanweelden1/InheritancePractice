package myconcrete;

import java.text.DecimalFormat;

/**
 *
 * @author Mark Van Weelden
 */
public class SalariedEmployee extends Employee{
   
    private double yearlySalary;

    public SalariedEmployee(double yearlySalary, String firstName, String lastName, int employeeNumber) {
        super(firstName, lastName, employeeNumber);
        setYearlySalary(yearlySalary);
        
    }
    
    public final void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public double getWeeklyPay(){
        
        double weeklyPay;
        weeklyPay = yearlySalary/52;
        return weeklyPay;
    }

    @Override
    public String toString() {
        String str = super.toString();
        DecimalFormat formatter = new DecimalFormat("#0.00");
         
        return "SalariedEmployee[" + str + "Yearly Salary: $" 
                + formatter.format(yearlySalary) + ", Weekly Pay: $" 
                + formatter.format(getWeeklyPay()) + ']';
    }
    
    
    
}
