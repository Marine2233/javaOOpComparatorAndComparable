import java.util.ArrayList;
import java.util.List;

public class GeneratWorkers {

    public static Employee generatWorkers(){
        
        ArrayList<Employee>workers = new ArrayList<>();

        for(Employee e : workers){
            if(e instanceof Worker){
                System.out.println(e.toString());
            }
            if (e instanceof Freelancer) {
             System.out.println(e.toString());
            
            }
            else return "error";
        }
    }
}
