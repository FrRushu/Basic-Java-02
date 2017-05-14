/**
 * Created by Rushu on 5/13/2017.
 * this content is created for tutorial purpose followed by the series ( Basic Java 01)
 */
public class class01 {

    public static void main(String [] args){
        /*
        *Class-01==>primitive  data type (byte, short, int, long ) & type casting
        * create 3 variable (byte, short, int) and set  any valid number for those type.
        *create a long variable and make it equal to  56789 + 43210 times (the sum of the byte & the sum of short and int)
        */

        int intValue = 500; //32 bit
        short shortValue = 23;//16 bit
        byte byteValue = 127; // 8 bit

        long longValue = (56789L + 43210L)*(intValue+byteValue+shortValue);

        System.out.println(longValue);


        //casting
        byteValue = (byte) (shortValue/2);

        System.out.println(byteValue);


    }
}
