package Encapsulation;

/**
 * Created by Rushu on 5/26/2017.
 */
public class class16_player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health-damage;
        if (this.health <=0){
            System.out.println("Player  knocked out");
        }
    }

    public  int healthRemaining(){
        return this.health;
    }
}
