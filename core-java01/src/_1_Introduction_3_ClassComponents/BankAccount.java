package _1_Introduction_3_ClassComponents;

public class BankAccount {
      int customerId;
     int accountNumber;
    String accountHolderName;
    double balance;
    // static variable
   private static  String bankName ="SBI";

    void deposit (double amount){
        //double amount --> local primitive variable
        balance +=amount;
    }
    void withdraw(double amount){
        //double amount -->local primitive variable
        balance -=amount;
    }

BankAccount(){
    }
public BankAccount(int customerId,int accountNumber,String accountHolderName,double balance){
   this.customerId = customerId;
   this.accountNumber=accountNumber;
   this.accountHolderName=accountHolderName;
   this.balance=balance;
    }
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static instance block");
    }
    class A{

    }
    static class B{

    }
}