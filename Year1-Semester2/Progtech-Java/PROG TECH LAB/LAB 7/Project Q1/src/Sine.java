public class Sine extends Taylor {

    public Sine(int k, double x) {
        super(k, x);
    }

    @Override
    public void printValue() {
        System.out.println("Value from Math.sin() is " + Math.sin(getValue()) + ".");
        System.out.println("Approximated value is " + getApprox() + ".");
    }

    @Override
    public double getApprox() {
        double sum = 0;
        for (int n = 0; n <= getIteration(); n++) {
            sum += Math.pow(-1, n) * Math.pow(getValue(), 2 * n + 1) / factorial(2 * n + 1);
        }
        return sum;
    }
}