package myinterface;

import java.text.DecimalFormat;

/**
 *
 * @author Mark Van Weelden
 */
public class SalariedEmployee implements Employee{
    
    private String firstName;
    private String lastName;
    private int employeeNumber;
    private double yearlySalary;

    public SalariedEmployee(String firstName, String lastName, int employeeNumber, double yearlySalary) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmployeeNumber(employeeNumber);
        setYearlySalary(yearlySalary);
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

    public final void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
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

    public double getYearlySalary() {
        return yearlySalary;
    }

    @Override
    public double getGrossWeeklyPay() {
        double grossPay;
        grossPay = yearlySalary/52;
        return grossPay;
    }

    @Override
    public String toString() {
       DecimalFormat formatter = new DecimalFormat("#0.00");
         
        return "SalariedEmployee[" + "First Name: " + firstName + ", Last Name: " 
                + lastName + ", Employee Number: " + employeeNumber + ", Yearly Salary: $" 
                + formatter.format(yearlySalary) + ", Gross Weekly Pay: $" 
                + formatter.format(getGrossWeeklyPay()) + ']';
    }
    
    
    
}
