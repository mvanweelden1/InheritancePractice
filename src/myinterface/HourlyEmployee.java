package myinterface;

import java.text.DecimalFormat;

/**
 *
 * @author Mark Van Weelden
 */
public class HourlyEmployee implements Employee {
    
    private String firstName;
    private String lastName;
    private int employeeNumber;
    private double payRate;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, int employeeNumber, double payRate, int hoursWorked) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmployeeNumber(employeeNumber);
        setPayRate(payRate);
        setHoursWorked(hoursWorked);
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public final void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public final void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
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
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return "HourlyEmployee[" + "First Name: " + firstName + ", Last Name: " 
                + lastName + ", Employee Number: " + employeeNumber 
                + ", Pay Rate: " + formatter.format(payRate) + ", Hours Worked: " 
                + hoursWorked + ", Weekly Gross Pay: $" 
                + formatter.format(getGrossWeeklyPay()) + ']';
    }
    
    
    
    
}
