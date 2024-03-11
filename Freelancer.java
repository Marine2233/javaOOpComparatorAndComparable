import java.util.Random;

public class Freelancer extends Employee {

    Random random = new Random();

    public double calculateSalary(){
        hours = random.nextDouble(1,12);
        salary = hours * payment;
        return salary;
    }

    @Override
    public String toString() {
        
        return "Фрилансер; " + sureName + " " + name + ", возраст: " + age + ". Средняя заработная плата: " +  calculateSalary();
    }

    private double salary;
    private double hours;
    private double payment;

    public void setHours(double hours) {
        this.hours = hours;
    }

    public Freelancer(String sureName, String name, int age) {
        super(sureName, name, age);
        this.salary = calculateSalary();
        this.hours = hours;
        this.payment = 188;

    }


    public double getSalary() {
        return salary;
    }

    public double getPayment() {
        return payment;
    }

}
