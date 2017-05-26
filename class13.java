/**
 * Created by Rushu on 5/26/2017.
 * Constructor , getter setter in java
 */
public class class13 {

    public static void main(String args []){


//        //getter & setter in java
//        class13_bankAccount ddAccount = new class13_bankAccount();
//        ddAccount.setAccountNumber("A-234589");
//        ddAccount.setBalance(1000000);
//        ddAccount.withdrawal(500.00);
//        ddAccount.deposit(1000.00);
//        ddAccount.setEmail("droiddigger@gmail.com");
//        ddAccount.setName("Rushu");
//        System.out.println(ddAccount.getName());


        //constructor
        class13_bankAccount rushu = new class13_bankAccount("R-2-A-13409",5000,"Rushu","rushu@gmail.com",12213444551L);
        System.out.println(rushu.getEmail());

        rushu.withdrawal(10000);
        rushu.deposit(100);
        rushu.withdrawal(200);

        //calling overloaded  constructor from the default one
        class13_bankAccount ddAccount = new class13_bankAccount();
        ddAccount.setAccountNumber("A-234589");
        ddAccount.setBalance(1000000);
        ddAccount.withdrawal(500.00);

    }
}
