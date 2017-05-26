/**
 * Created by Rushu on 5/26/2017.
 */
public class class15_monitor {
    private String model;
    private String manufacturer;
    private  int size ;
    //class15_resolution is a "Composition" . Monitor is not a resolution but monitor has resolution.
    private class15_resolution monitorResolution;

    public class15_monitor(String model, String manufacturer, int size, class15_resolution monitorResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.monitorResolution = monitorResolution;
    }

    public  void drawPixelAt(int x, int y, String color){
        System.out.println("Draw pixel at "+x+" , "+y +"in " + color +" color."  );
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public class15_resolution getMonitorResolution() {
        return monitorResolution;
    }
}
