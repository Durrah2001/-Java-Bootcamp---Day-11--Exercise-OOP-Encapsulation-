package org.example;
public class Main {
    public static void main(String[] args) {

        Account a1 = new Account();
        Account a2 = new Account("1133", "Noura");
        Account a3 = new Account("1122", "Ahmed", 1500);
        Account another = new Account();


        a1.setName("Nada");
        a1.setId("1144");
        a1.setBalance(4000);

        another.setName("Danah");
        another.setId("1187");
        another.setBalance(8900);


        System.out.println("Account 1 information:");
        System.out.println(a1.toString());


        System.out.println("---------------------");


        System.out.println("Account 2 information:");
        System.out.println(a3.toString());

        System.out.println("---------------------");

        System.out.println("Account 3 information:");
        System.out.println(another.toString());

        System.out.println("---------------------");


        System.out.println("Credit 20SR to account 2 balance:- ");

        System.out.println("Balance before credit: " + a3.getBalance());
        System.out.println("Balance after credit: " + a3.credit(20));

        System.out.println("---------------------");

        System.out.println("Debit 100SR from account 1 balance:- ");

        System.out.println("Balance before debit: " + a1.getBalance());
        System.out.println("Balance after debit: " + a1.debit(20));

        System.out.println("---------------------");

        System.out.println("Transfer 100SR to account 3 from account 1:- \n");

        System.out.println("Balance before transfer:-- ");
        System.out.println("Account 1: " + a1.getBalance());
        System.out.println("Account 3: " + another.getBalance());

        System.out.println("*******************");

        System.out.println("Balance after transfer:-- ");
        a1.transferTo(another, 100);
        System.out.println("Account 1: " + a1.getBalance());
        System.out.println("Account 3: " + another.getBalance());














    }
}