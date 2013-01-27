package myinterface;

/**
 *
 * @author Mark Van Weelden
 */
public class Startup {
    
    public static void main (String[] args){
        
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane", "Smith", 2464, 19.75, 40);
        
        System.out.println(hourlyEmployee);
        
        SalariedEmployee salariedEmployee = new SalariedEmployee("Bob", "Anderson", 2363, 50000);
        
        System.out.println(salariedEmployee);
        
        SalaryPlusBonusEmployee bonusEmployee = new SalaryPlusBonusEmployee(100, "Mary", "Anderson", 2262, 50000);
        
        System.out.println(bonusEmployee);
        
    }
    
}
