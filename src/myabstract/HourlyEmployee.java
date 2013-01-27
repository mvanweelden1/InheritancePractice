package myabstract;

import java.text.DecimalFormat;

/**
 *
 * @author Mark Van Weelden
 */
public class HourlyEmployee extends Employee {
    
    private double payRate;
    private int hoursWorked;

    public HourlyEmployee(double payRate, int hoursWorked, String firstName, String lastName, int employeeNumber) {
        super(firstName, lastName, employeeNumber);
        setPayRate(payRate);
        setHoursWorked(hoursWorked);
    }

    public final void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public final void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double getGrossWeeklyPay() {
        double grossPay;
        grossPay = hoursWorked * payRate;
        return grossPay;
    }

    @Override
    public String toString() {
       String str = super.toString();
        DecimalFormat formatter = new DecimalFormat("#0.00");
        
        return "HourlyEmployee[" + str + "Pay Rate: " + formatter.format(payRate) 
                + ", Hours Worked: " + hoursWorked + ", Gross Pay: $" 
                + formatter.format(getGrossWeeklyPay()) + ']';
    }
    
    
    
}
