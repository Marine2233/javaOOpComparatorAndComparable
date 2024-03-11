import java.util.Random;

public class Worker extends Employee {

    private double salary;

  public double calculateSalary(){
    Random random = new Random();
    salary = random.nextDouble(25000,180000);
    return salary;
  }

    public Worker(String sureName, String name, int age) {
        super(sureName, name, age);
        this.salary = calculateSalary();
    }


    @Override
    public String toString() {
        
        return "Рабочий;" + sureName + " " + name + ", возраст: " + age + ". Средняя заработная плата: " +  calculateSalary();
    }
    
}
