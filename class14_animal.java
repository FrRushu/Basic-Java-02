/**
 * Created by Rushu on 5/26/2017.
 */
public class class14_animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private double weight;

    public class14_animal(String name, int brain, int body, int size, double weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void  eat(){
        System.out.println("class14_animal.eat() is called");

    }

    public void move(int speed){
        System.out.println("class14_animal.move() is called. Animal is moving at " + speed +" /km-hr");

    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }
}
