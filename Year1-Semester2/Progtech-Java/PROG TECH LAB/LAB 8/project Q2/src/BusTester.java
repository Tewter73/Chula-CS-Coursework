import java.util.ArrayList;

public class BusTester {
    public static void main(String[] args) {
        ArrayList<Bus> arr = new ArrayList<>();
        Hybrid hybrid = new Hybrid(45, 1.2, Electric.HIGH_VOLTAGE, 150,1);
        arr.add(hybrid);
        CNGBus cngBus = new CNGBus(50,1.0,200,2);
        arr.add(cngBus);
        for (Bus bus: arr) {
            System.out.println("ID: " + bus.getID());
            System.out.println("Emission Tier: " + ((LiquidFuel)bus).getEmissionTier());
            System.out.println("Accel: " + bus.getAccel());
        }
    }
}