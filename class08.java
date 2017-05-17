/**
 * Created by Rushu on 5/16/2017.
 * Method basic
 */
public class class08 {

    public  static  void main(String args []){

        calculateScore();

        System.out.println("Hello world");
        calculateScore(true,90,7,9);


    }

    public static void calculateScore(){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus =100;

        if (gameOver){

            int finalScore = score + (levelCompleted * bonus);
            System.out.println(finalScore);
            finalScore += 10 ;
            System.out.println(finalScore);
        }
    }

    public  static  void  calculateScore(boolean gameOver, int score , int levelCompleted ,int bonus){
        if (gameOver==false){
            System.out.println("you are done !");
        }else
            System.out.println("carry on !"+"\n"+score+"\n"+levelCompleted+"\n"+bonus);


    }
}
