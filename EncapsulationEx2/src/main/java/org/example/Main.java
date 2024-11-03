package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("1122", "Nasser", 5000);

        e1.setId("1231");
        e1.setName("Fatima");
        e1.setSalary(7000);

        System.out.println("Employee 1 information: ");
        System.out.println(e1.toString() + "\n");
        System.out.println("Annual salary for " + e1.getName() + ": " + e1.getAnnualSalary()+"SR");
        System.out.println(e1.getName() + " salary after raised by 20% : " + e1.raisedSalary(20) + "SR");

        System.out.println("-------------------------------");

        System.out.println("Employee 2 information: ");
        System.out.println(e2.toString()+ "\n");
        System.out.println("Annual salary for " + e2.getName() + ": " + e2.getAnnualSalary() +"SR");
        System.out.println(e2.getName() + " salary after raised by 12% : " + e2.raisedSalary(12) + "SR");

        System.out.println("-------------------------------");



    }
}