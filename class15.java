import javax.management.monitor.Monitor;

/**
 * Created by Rushu on 5/26/2017.
 * Composition in java
 */
public class class15 {

    public static void main(String args[]){
        class15_dimension dimension = new class15_dimension(20,20,5);
        // public class15_case(String model, String manufacturer, String powerSupply, class15_dimension dimension) {
        class15_case theCase = new class15_case("R7-265","Sappahre","420",dimension);


        //   public class15_monitor(String model, String manufacturer, int size, class15_resolution monitorResolution)
        class15_monitor monitor = new class15_monitor("Dell-2240L","Dell",27,new class15_resolution(1920,1080));

        //public class15_motherboard(String model, String manufacturer, String ramSlots, String cardSlots, String bios)
        class15_motherboard motherboard  = new class15_motherboard("R-97-Gaming","MSI","4","3","v3.86");

        class15_pc myPc = new class15_pc(theCase,monitor,motherboard);

        myPc.getMonitor().drawPixelAt(1200,700,"blue");

        myPc.getMotherboard().loadProgram("Windows 10");

        myPc.getTheCase().pressPowerButton();


    }
}
