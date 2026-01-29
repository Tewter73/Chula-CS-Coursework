public abstract class Taylor {
    private final int k;
    private final double x;

    public Taylor(int k, double x) {
        this.k = k;
        this.x = x;
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public int getIteration() {
        return k;
    }

    public double getValue() {
        return x;
    }

    public abstract void printValue();

    public abstract double getApprox();
}
