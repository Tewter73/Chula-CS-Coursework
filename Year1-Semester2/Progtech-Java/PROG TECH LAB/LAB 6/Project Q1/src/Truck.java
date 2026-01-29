public class Truck extends Car {
    private final double M_weight;
    private final double weight;

    public Truck(double gas, double efficiency, double M_weight, double weight) {
        super(gas, efficiency);
        this.M_weight = M_weight;
        this.weight = Math.min(M_weight, weight);
    }

    @Override
    public void drive(double distance) {
        double gasUsed = distance / getEfficiency();

        if (weight > 20) {
            gasUsed *= 1.3;
        } else if (weight > 10) {
            gasUsed *= 1.2;
        } else if (weight >= 1) {
            gasUsed *= 1.1;
        }

        if (gasUsed > getGas()) {
            System.out.println("You cannot drive too far, please add gas");
        } else {
            setGas(getGas() - gasUsed);
        }
    }
}