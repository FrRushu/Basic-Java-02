/**
 * Created by Rushu on 5/26/2017.
 */
public class class14_fish extends class14_animal {
    private int gills;
    private int eyes;
    private int fins;

    public class14_fish(String name, int brain, int body, int size, double weight, int gills, int eyes, int fins) {
        super(name, brain, body, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private  void  reset(){

    }
    private void moveMuscles(){

    }
    private void moveBackFin(){

    }
    private void swim( int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
