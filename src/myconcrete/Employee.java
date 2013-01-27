package myconcrete;

/**
 *
 * @author Mark Van Weelden
 */
public class Employee {
    
    private String firstName;
    private String lastName;
    private int employeeNumber;

    public Employee(String firstName, String lastName, int employeeNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmployeeNumber(employeeNumber);
        
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", lastName=" +
                lastName + ", employeeNumber=" + employeeNumber + '}';
    }
    
    
    
}
