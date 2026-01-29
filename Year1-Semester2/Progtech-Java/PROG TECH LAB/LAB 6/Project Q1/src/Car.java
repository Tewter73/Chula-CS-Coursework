public class Car {
    private double gas;
    private final double efficiency;

    public Car(double gas, double efficiency) {
        this.gas = gas;
        this.efficiency = efficiency;
    }

    public void drive(double distance) {
        double gasUsed = distance / efficiency;
        if (gasUsed > gas) {
            System.out.println("You cannot drive too far, please add gas");
        } else {
            gas -= gasUsed;
        }
    }

    public void setGas(double amount) {
        gas = amount;
    }

    public double getGas() {
        return gas;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void addGas(double amount) {
        gas += amount;
    }
}