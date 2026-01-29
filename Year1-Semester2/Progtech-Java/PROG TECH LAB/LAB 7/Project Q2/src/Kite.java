public class Kite extends Quadrilateral {
    public Kite(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    @Override
    public double area() {
        double[] kite = super.getSortedDist();
        for (int i = 0; i < 5; i++) {
            if (kite[i] == kite[i+1]) {
                kite[i] = -1;
                kite[i+1] = -1;
            }
        }
        double sum = 0.5;
        for (int i  = 0 ; i <6 ; i++) {
            if (kite[i] > 0) {
                sum *= kite[i];
            }
        }
        return sum;
    }
}