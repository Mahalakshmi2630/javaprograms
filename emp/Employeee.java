package test2;

public class Employeee {

    private int salary;
    public Employeee(int salary) {
        this.salary = salary;
    }
    public void work() {
        System.out.println("working as an employee!");
    }
    public int getSalary() {
        return salary;
    }
}
