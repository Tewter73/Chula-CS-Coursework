public class Hybrid extends Bus implements LiquidFuel,Electric {
    private final double voltage;
    private final double range;
    private final int emissionTier;

    public Hybrid(int capacity, double cost, double voltage, double range, int emissionTier) {
        super(capacity, cost);
        if (voltage < LOW_VOLTAGE) {
            this.voltage = LOW_VOLTAGE;
        } else if (voltage > HIGH_VOLTAGE) {
            this.voltage = HIGH_VOLTAGE;
        } else {
            this.voltage = voltage;
        }
        this.range = range;
        this.emissionTier =emissionTier;
    }

    @Override
    public double getRange() {
        return range;
    }

    @Override
    public int getEmissionTier() {
        return emissionTier;
    }

    @Override
    public double getVoltage() {
        return voltage;
    }

    @Override
    public double getAccel() {
        return 4.0;
    }
}
