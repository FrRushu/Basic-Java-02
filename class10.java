/**
 * Created by Rushu on 5/17/2017.
 * if /else if / switch statement
 */
public class class10 {

    //if is bit more flixable

    public static void main(String args []){
        int value =3;
        if (value == 1){
            System.out.println("value is 1");
        } else if (value == 2){
            System.out.println("value is 2");
        } else {
            System.out.println("None of them ");
        }

        int switchValue = 5 ;

        //switch work for 5 primitive data types. These are (byte, short , int , char ,(String value) )
        switch (switchValue){
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3:case 4:case 5:
                System.out.println("test for case 3-5");
                System.out.println("the actual value is "+ switchValue);
                break;

            default:
                System.out.println("None of them");
                break;
        }

        //switch for char

        char charValue = 'C';

        switch (charValue){
            case 'A':
                System.out.println("value is A");
                break;
            case 'B':
                System.out.println("value is B");
                break;
            case 'C':case 'D':case 'E':
                System.out.println("test for case C-E");
                System.out.println("the actual value is "+ charValue);
                break;

            default:
                System.out.println("Could not find any character");
                break;
        }


        //switch for String work for jdk>=7

        String stringValue = "Ruhsu";

        switch (stringValue){
            case "bucky":
                System.out.println("value is Bucky");
                break;
            case "doe":
                System.out.println("value is DOE");
                break;
            case "Rushu":
                System.out.println("test for case Fazle-Rushu");
                System.out.println("the actual value is "+ stringValue);
                break;

            default:
                System.out.println("None of those String");
                break;
        }


    }
}
