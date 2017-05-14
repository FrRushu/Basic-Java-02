import java.util.Scanner;

/**
 * Created by Rushu on 5/13/2017.
 */
public class class02 {

    public static void main(String [] args){
        /*
        *Class-02==>primitive  data type (Float & Double)
        * convert a given number of pound to kilogram (1 pound = 0.45359237)
        */
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of pound");
        int numOfPound = sc.nextInt();
        //width of int is = 32 (4 bytes)
        int intValue =5;
        //width of int is = 32 (4 bytes)
        float floatValue = 5.67f;   //float has 7 digit after the decimal
        //width of int is = 64 (8 bytes)
        double poundValue = 0.45359237d; // double has 16 digit after the decimal
        double kilogramValue = poundValue*numOfPound ;

        System.out.println(kilogramValue);
    }
}
