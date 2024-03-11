public abstract class Employee implements Comparable<Employee> {

    // public int compareTo(Employee employee){
    //     int res = employee.age.compareTo(age);
    //     return res;
    // }

    protected String sureName;
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String sureName, String name, int age) {
        this.sureName = sureName;
        this.name = name;
        this.age = age;
    }

    public String getSureName() {
        return sureName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double calculateSalary(){
        return salary;

    };

    @Override
    public int compareTo(Employee o) {
        int res = sureName.compareTo(o.sureName);
        if(res == 0){
        return name.compareTo(o.name);
        }
        return res;
    }
    
     
}