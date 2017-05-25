/**
 * Created by Rushu on 5/25/2017.
 */
public class class12_car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
    public void setEngine(String engine){
        if(engine.equals("v4")|| engine.equals("tarbo")) {
            this.engine = engine;
        }
    }
    public String getEngine(){
        return this.engine;
    }
    public void setColour(String colour){
        String s = colour.toLowerCase();
        if(s.contains("black")){
            this.colour = colour;
        };
        //if ()

    }
    public String getColour(){
        return this.colour;
    }

}
