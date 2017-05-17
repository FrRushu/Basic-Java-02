/**
 * Created by Rushu on 5/17/2017.
 * Method with return statement
 */
public class class09 {

    public  static  void main(String args []){

    int score = calculateScore();
    System.out.println("I am working bro "+score);

    System.out.println("Hello world");
    calculateScore(true,90,7,9);
    System.out.println(" next part ");

    //another part
        int position = calculateScorePosition(1500);
        displayScorePosition("Rushu",position);

        position = calculateScorePosition(900);
        displayScorePosition("Jhon",position);

        position = calculateScorePosition(400);
        displayScorePosition("Doe",position);

        position = calculateScorePosition(50);
        displayScorePosition("Karim",position);



}

    public static int calculateScore(){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus =100;

        if (gameOver){

            int finalScore = score + (levelCompleted * bonus);
            System.out.println(finalScore);
            finalScore += 10 ;
            return finalScore;
        }
        return 0;
    }

    public  static  void  calculateScore(boolean gameOver, int score , int levelCompleted ,int bonus){
        if (gameOver==false){
            System.out.println("you are done !");
        }else
            System.out.println("carry on !"+"\n"+score+"\n"+levelCompleted+"\n"+bonus);


    }

    public static  void  displayScorePosition(String name, int position){
        System.out.println(name + " manage to get into position " + position + " on the high score table" );
    }


    public static  int  calculateScorePosition(int score){
        if(score>1000){
            return 1;
        }
        else if(score>500 && score <1000){
            return 2;
        }
        else if(score>100 && score <500) {
            return 3;
        }
        else {
            return 5;
        }
    }


}
