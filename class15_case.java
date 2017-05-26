/**
 * Created by Rushu on 5/26/2017.
 */
public class class15_case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    //class15_dimension is a Composition.
    private class15_dimension dimension;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public class15_dimension getDimension() {
        return dimension;
    }



    public class15_case(String model, String manufacturer, String powerSupply, class15_dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public  void pressPowerButton(){
        System.out.println("Power is on");
    }
}
