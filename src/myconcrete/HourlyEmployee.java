package myconcrete;

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
    
    public double getGrossPay(){
        double grossPay;
        grossPay = hoursWorked * payRate;
        return grossPay;
    }

    @Override
    public String toString() {
        String str = super.toString();
        
        return "HourlyEmployee{" + str + "payRate=" + payRate + ", hoursWorked=" 
                + hoursWorked + '}';
    }
    
    
    
}
