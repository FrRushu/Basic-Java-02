/**
 * Created by Rushu on 5/26/2017.
 */
public class class15_pc {

    private class15_case theCase;
    private class15_monitor monitor;
    private class15_motherboard motherboard;

    public class15_pc(class15_case theCase, class15_monitor monitor, class15_motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public class15_case getTheCase() {
        return theCase;
    }

    public class15_monitor getMonitor() {
        return monitor;
    }

    public class15_motherboard getMotherboard() {
        return motherboard;
    }
}
