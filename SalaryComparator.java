import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        return Double.compare(o1.calculateSalary(),o2.calculateSalary());
        
        // if(o1.calculatSalary() > o2.calculatSalary()){
        //     return 1;
        // }
        // else if(o1.calculatSalary() == o2.calculatSalary()){
        //     return 0;
        // }
        // else return -1;
    }
    
}
