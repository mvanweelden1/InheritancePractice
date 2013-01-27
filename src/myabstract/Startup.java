package myabstract;

/**
 *
 * @author Mark Van Weelden
 */
public class Startup {
    
    public static void main (String[] args){
        
        HourlyEmployee hourlyEmployee = new  HourlyEmployee(19.75, 40, "Jane", "Smith", 2464);
        
        System.out.println(hourlyEmployee);
        
        SalariedEmployee salariedEmployee = new SalariedEmployee(50000,"Bob", "Anderson", 2363);
        
        System.out.println(salariedEmployee);
        
        SalaryPlusBonusEmployee bonusEmployee = new SalaryPlusBonusEmployee(100, 50000, "Mary", "Anderson", 2262);
        
        System.out.println(bonusEmployee);
    }
    
}
