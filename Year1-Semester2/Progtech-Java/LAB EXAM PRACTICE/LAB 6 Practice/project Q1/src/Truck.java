public class Truck extends Car {
    private double M_weight;
    private double weight;

    public Truck(double gas, double efficiency, double M_weight, double weight) {
        super(gas, efficiency);
        this.M_weight = M_weight;
        this.weight = Math.min(M_weight, weight);
    }

    @Override
    public void drive(double distance) {
        double gasUsed = distance / getEfficiency();
        if (weight > 20) {
            gasUsed = gasUsed * 1.30;
        } else if (weight > 10) {
            gasUsed = gasUsed * 1.20;
        } else if (weight >= 1) {
            gasUsed = gasUsed * 1.10;
        } else if (weight < 1) {
            gasUsed = gasUsed * 1;
        }

        if (gasUsed > getGas()) {
            System.out.println("You cannot drive too far, pleas add gas");
        } else {
            setGas(getGas() - gasUsed);
        }
    }
}
