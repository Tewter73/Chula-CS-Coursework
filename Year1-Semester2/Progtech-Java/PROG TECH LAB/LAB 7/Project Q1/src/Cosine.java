public class Cosine extends Taylor {

    public Cosine(int k, double x) {
        super(k, x);
    }

    @Override
    public void printValue() {
        System.out.println("Value from Math.cos() is " + Math.cos(getValue()) + ".");
        System.out.println("Approximated value is " + getApprox() + ".");
    }

    @Override
    public double getApprox() {
        double sum = 1;
        for (int n = 1; n <= getIteration(); n++) {
            sum += Math.pow(-1, n) * Math.pow(getValue(), 2 * n) / factorial(2 * n);
        }
        return sum;
    }
}