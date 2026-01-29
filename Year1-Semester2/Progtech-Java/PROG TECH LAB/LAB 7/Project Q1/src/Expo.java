public class Expo extends Taylor {

    public Expo(int k, double x) {
        super(k, x);
    }

    @Override
    public void printValue() {
        System.out.println("Value from Math.exp() is " + Math.exp(getValue()) + ".");
        System.out.println("Approximated value is " + getApprox() + ".");
    }

    @Override
    public double getApprox() {
        double sum = 1;
        for (int n = 1; n <= getIteration(); n++) {
            sum += Math.pow(getValue(), n) / factorial(n);
        }
        return sum;
    }
}