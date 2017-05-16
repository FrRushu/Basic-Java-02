/**
 * Created by Rushu on 5/16/2017.
 * if else control statement
 */
public class class07 {

    public static void main(String args []){

        boolean tamimOut = true;
        int score = 100;
        int day =2;
        int extra = 8;

        if (score == 100) {

            System.out.println("your score is " + score);
        }

        if(day<3){
            System.out.println("this is day "+day);
        }else
            System.out.println("wrong date");


        if (score <=100 && day <=3){
            System.out.println("Safe zone");
        }

    }
}
