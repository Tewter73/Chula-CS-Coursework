public class CNGBus extends Bus implements LiquidFuel {
    private final double range;

    private final int emissionTier;

    public CNGBus (int capacity, double cost, double range, int emissionTier) {
        super(capacity, cost);
        this.range = range;
        this.emissionTier = emissionTier;
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
    public double getAccel() {
        return 3.0;
    }
}
