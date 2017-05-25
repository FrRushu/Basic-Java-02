/**
 * Created by Rushu on 5/25/2017.
 * classes in java
 */
public class class12 {

    public static void main(String args []){
        class12_car porsche = new class12_car();
        class12_car audi = new class12_car();
        porsche.setModel("Porsche 911 Carrera");
        System.out.println("Model is "+ porsche.getModel());
        porsche.setColour("Mat Black");
        System.out.println("Colour is "+ porsche.getColour());
        audi.setEngine("v4");
        System.out.println(audi.getEngine());

    }
} 
