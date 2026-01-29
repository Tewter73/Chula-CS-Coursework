import java.util.ArrayList;

public class BusTester {
    public static void main(String[] args) {
        ArrayList<Bus> arr = new ArrayList<>();
        Hybrid hybridBus = new Hybrid(45,1.2,Electric.HIGH_VOLTAGE,150,1);
        arr.add(hybridBus);
        CNGBus cngbus = new CNGBus(50,1.0,200,2);
        arr.add(cngbus);
        for (Bus i : arr) {
            System.out.println("ID: " + i.getID());
            LiquidFuel h  = (LiquidFuel) i;
            System.out.println("Emission Tier: " + h.getEmissionTier());
            System.out.println("Accel: " + i.getAccel());
        }
    }
}
