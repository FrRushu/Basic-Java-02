package Encapsulation;

/**
 * Created by Rushu on 5/26/2017.
 * Encapsulation in java 
 */
public class class16 {

    public static void main(String args []){

        //bad approach
//        class16_player p1 = new class16_player();
//        p1.fullName   = "Ruhsu";
//        p1.health = 20;
//        p1.weapon = "Gun";
//
//
//        int damage =11;
//        p1.loseHealth(damage);
//        System.out.println("Remaining health is "+ p1.healthRemaining());
//
//
//
//        damage =17;
//        p1.health =90;
//        p1.loseHealth(damage);
//        System.out.println("Remaining health is "+ p1.healthRemaining());

        class16_EnhancedPlayer player = new class16_EnhancedPlayer("Rushu",96,"Gun");
        player.getHealth();






    }
}
