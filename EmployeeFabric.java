import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();


    public static Worker generatWorker(){
        String[]name = {"Александр", "Владимир", "Альбина", "Иван", "Анатолий", "Егор", "Анастасия", "Елена", "Максим", "Сергей", "Юлия", "Маринэ","Антанас","Виктор"};
        String[]surName = {"Лобас", "Марцинкус", "Любчич", "Кучма", "Борода", "Боцман", "Хара", "Бойко", "Пономаренко", "Овечко", "Пахоменко", "Слава", "Журбенко", "Эксузян", "Давыденко", "Каменских"};
        int age = random.nextInt(25,58);
        return new Worker(surName[random.nextInt(surName.length)],name[random.nextInt(name.length)],age);
    }

    public static Freelancer generatFreelancers(){
        String[]name = {"Александр", "Владимир", "Альбина", "Иван", "Анатолий", "Егор", "Анастасия", "Елена", "Максим", "Сергей", "Юлия", "Маринэ","Антанас","Виктор"};
        String[]surName = {"Лобас", "Марцинкус", "Любчич", "Кучма", "Борода", "Боцман", "Хара", "Бойко", "Пономаренко", "Овечко", "Пахоменко", "Слава", "Журбенко", "Эксузян", "Давыденко", "Каменских"};
        int age = random.nextInt(25,58);
        
        return new Freelancer(surName[random.nextInt(surName.length)],name[random.nextInt(name.length)],age);
    }

    public static Freelancer[]generateFreelancer(int count){
        Freelancer[]freelancers = new Freelancer[count];
        for (int i = 0; i < count; i++) {
            freelancers[i] = generatFreelancers();
        }
        return freelancers;
    }

    public static Worker[]generateEmployees(int count){

        Worker[]workers = new Worker[count];
        for (int i = 0; i < count; i++) {
            workers[i] = generatWorker();
        }
        return workers;
    }
    
}
