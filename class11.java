import java.util.Scanner;

/**
 * Created by Rushu on 5/25/2017.
 * for statement
 */
public class class11 {

    public static void main(String args[]){
//
//        System.out.println(calculateInterest(10000.0,2.0));
//        System.out.println(calculateInterest(10000.0,3.0));
//        System.out.println(calculateInterest(10000.0,4.0));
//        System.out.println(calculateInterest(10000.0,5.0));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount :");
        for (int i=1;i<=7;i++){
            //print in 0.00 format
            System.out.println(String.format("%.2f",calculateInterest(10000,i)));
        }
        System.out.println("Reverse");
        for (int i=7;i>=1;i--){
            //print in 0.00 format
            System.out.println(String.format("%.2f",calculateInterest(10000,i)));
        }

        //while loop
        int count = 0;
        while (count !=5){
            System.out.println("count value is "+ count);
            count++;
        }

        //another representation of while loop
        count =0 ;
        while (true){
            if (count==5){
                break;
            }
            System.out.println("the count value is "+count);
            count++;
        }


        //do while loop
        count =0;
        do {
            System.out.println("doCount value is "+count);
        }while (count!=6);


    }

    public  static  double calculateInterest(double amount , double rate){
        return (amount * (rate/100));

    }
}
