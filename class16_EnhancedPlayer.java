package Encapsulation;

/**
 * Created by Rushu on 5/27/2017.
 */
public class class16_EnhancedPlayer {

    private String name;
    private int hitpoints =100;
    private String weapon;

    public class16_EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;
        if (hitPoints >0 && hitPoints <=100){

            this.hitpoints = hitPoints;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage){
        this.hitpoints = this.hitpoints -damage;
        if (this.hitpoints <=0){
            System.out.println("Player  knocked out");
        }
    }

    public int getHealth() {
        return hitpoints;
    }

    public  int healthRemaining(){
        return this.hitpoints;
    }
}
