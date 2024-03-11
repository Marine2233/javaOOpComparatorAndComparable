import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class Program {
    public static void main(String[] args) {
        // 
        Freelancer[]freelancers = EmployeeFabric.generateFreelancer(10);
        Worker[]workerss = EmployeeFabric.generateEmployees(10);
        ArrayList<Employee>employees = new ArrayList<>();       

        // метод добавления в общий список работников
        for (Worker worker :workerss ) {
            for(Freelancer freelancer : freelancers){
                employees.add(worker);
                employees.add(freelancer);
            }
        
// это отдельный метод генерирующий сотрудников, который не удалось закрыть в отдельном классе GeneratWorkers
// пожалуйста прокомментируйте как надо было
        for (Employee employee : employees) {
            if(employee instanceof Worker){
                System.out.println(employee.toString());
                System.out.println("**************");

            }
            else if (employee instanceof Freelancer){
                System.out.println(employee.toString());
                System.out.println("**************");

            }
        
        }
        // Сортировка в рамках интерфейс - класса SalaryComparator
            // Arrays.sort(workerss,new SalaryComparator());
            // Arrays.sort(freelancers,new SalaryComparator());
            Arrays.sort(workerss,new AgeComparator());
            Arrays.sort(freelancers,new AgeComparator());

            // Сортировка в рамка интерфейса Comparable
            Arrays.sort(workerss);
            Arrays.sort(freelancers);

            for (Worker workers : workerss) {
                System.out.println(workers.toString()+ "*****");
            
            }
            for (Freelancer freelancer : freelancers) {
                System.out.println(freelancer.toString());
                
            }


            
        }

    }
}


