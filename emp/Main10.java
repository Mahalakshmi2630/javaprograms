package test2;

public class Main10 {
 public static void main(String[] args) {
     Employeee emp = new Employeee(40000);
     HR mgr = new HR(70000);
     emp.work();
     System.out.println("Employee salary: " + emp.getSalary());
     mgr.work();
     System.out.println("Manager salary: " + mgr.getSalary());
     mgr.addEmployee();
 }
}
