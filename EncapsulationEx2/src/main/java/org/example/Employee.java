package org.example;

public class Employee {

    private String id;
    private String name;
    private int salary;


    //Setters

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        if(!name.isEmpty())
            this.name = name;
        else
            System.out.println("The name must be entered");
    }

    public void setSalary(int salary){
        if(salary > 0)
            this.salary = salary;
        else
            System.out.println("The salary can not be smaller the 0");
    }

    //Getters

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    //Constructors

    public Employee() {

    }

    public Employee(String id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //Additional methods

    public int getAnnualSalary(){

        int annualDSalary = this.salary * 12;

        return annualDSalary;
    }

    public int raisedSalary(int percent){

        if (percent != 0) {
            int raisedAmmount = (percent * this.salary) / 100;
            this.salary = this.salary + raisedAmmount;
        }

        return salary;
    }

    public String toString(){

        return String.format("(ID: %s, Name: %s , Salary: %d)", id, name, salary);
    }






}
