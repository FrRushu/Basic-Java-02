/**
 * Created by Rushu on 5/26/2017.
 */
public class class15_motherboard {

    private String model;
    private String manufacturer;
    private String ramSlots;
    private String cardSlots;
    private String bios;

    public class15_motherboard(String model, String manufacturer, String ramSlots, String cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + "is loading ...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getRamSlots() {
        return ramSlots;
    }

    public String getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }


}
