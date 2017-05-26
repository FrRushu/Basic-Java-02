/**
 * Created by Rushu on 5/26/2017.
 */
public class class13_bankAccount {

    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private long phoneNumber;

    public class13_bankAccount(){
        //calling overloaded  constructor from the default one
        this("R-2-A-13409",5000,"Rushu","rabbi@gmail.com",010101101234L);
        System.out.println("Default is called.");
    }
    //constructor overloading
    public class13_bankAccount(String accountNumber,double balance,String name, String email, long phoneNumber){
        this.accountNumber = accountNumber;
        //can be used for validation
        setBalance(balance);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

        System.out.println("Account constructor is called ");
    }

    public class13_bankAccount(String name, String email, long phoneNumber) {
//        this.accountNumber="E-999";
//        this.balance =00L;
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
        this("E-999" ,00L ,name, email, phoneNumber);
    }




    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+depositAmount+" made. New balance is "+this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if(balance-withdrawalAmount<=0){
            System.out.println("Sorry! Available balance is "+this.balance);
        }else {
            balance-=withdrawalAmount;
            System.out.println("Withdrawal amount is "+withdrawalAmount+"\n"+"Balance is "+this.balance);
        }

    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }





}
