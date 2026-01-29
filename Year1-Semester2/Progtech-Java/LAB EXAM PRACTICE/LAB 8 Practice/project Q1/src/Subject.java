public class Subject implements Evaluation {
    private final String subjName;
    private final int[] score;

    public Subject(String subjName, int[] score) {
        this.subjName = subjName;
        this.score = score;
    }

    @Override
    public double evaluate() {
        double total = 0;
        for (double i : score) {
            total += i;
        }
        return  total / score.length;
    }

    @Override
    public char grade(double x) {
        if (x >= 70) {
            return 'P';
        } else {
            return 'F';
        }
    }

    public String toString() {
        return subjName;
    }
}
