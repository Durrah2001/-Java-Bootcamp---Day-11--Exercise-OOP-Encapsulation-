package org.example;

public class Account {

    private String id;
    private String name;
    private int balance = 0;
    private int amount;

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

    public void setBalance(int balance){
        if(balance > 0)
         this.balance = balance;
        else
            System.out.println("The balance can not be smaller the 0");
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    //Getters

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public int getAmount(){
        return amount;
    }



    //Constructors

    public Account(){


    }

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    //Additional methods:

    public int credit(int amount){
        if(amount > 0){
            balance = balance + amount;
        }

        return balance;
    }

    public int debit(int amount){

        if(amount > 0) {
            balance = balance - amount;
        }
        if(amount > balance) {
            System.out.println("The amount greater than current balance");

        }else{
            System.out.println("Amount must be greater than 0");
        }
      return balance;
    }

    public int transferTo(Account another, int amount){

        if(amount < balance) {
           this.balance = this.balance - amount;
           another.balance = another.balance + amount;
           return this.balance;
        }

        return 0;
    }

    public String toString(){

        return String.format("(Name: %s, ID: %s , Balance: %d)", name, id, balance);
    }

















}
