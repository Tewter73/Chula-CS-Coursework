public class Hybrid extends Bus implements Electric, LiquidFuel {
    private final double range;
    private final int emissionTier;
    private final double voltage;

    public Hybrid(int capacity, double cost, double voltage, double range, int emissionTier) {
        super(capacity, cost);
        this.voltage = Math.min(Math.max(voltage, LOW_VOLTAGE), HIGH_VOLTAGE);
        this.range = range;
        this.emissionTier = emissionTier;
    }

    @Override
    public double getAccel() {
        return 4.0;
    }

    public double getRange() {
        return range;
    }

    public int getEmissionTier() {
        return emissionTier;
    }

    public double getVoltage() {
        return voltage;
    }
}