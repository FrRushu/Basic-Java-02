/**
 * Created by Rushu on 5/26/2017.
 * Inheritance in java
 */
public class class14_dog extends class14_animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public class14_dog(String name, int brain, int body, int size, double weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, brain, body, size, weight);
        this.eyes    = eyes;
        this.legs    = legs;
        this.tail    = tail;
        this.teeth   = teeth;
        this.coat    = coat;


    }
    public  void  dew (){
        System.out.println("class14_dog.dew() is called ");
    }

    @Override
    public void eat() {
        System.out.println("class14_dog.eat() is called");
        dew();
        super.eat();
    }

    public void walk(){
        System.out.println("class14_dog.walk() is called");
        super.move(5);
    }
    public void run(){
        System.out.println("class14_dog.run() is called ");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("class14_dog.moveLegs() is called ");
    }

    @Override
    public void move(int speed) {
        System.out.println("class14_dog.move() is called ");
        super.move(speed);
    }
}
