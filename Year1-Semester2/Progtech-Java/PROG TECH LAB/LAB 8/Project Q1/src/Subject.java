public class Subject implements Evaluation {
    private final String subjName;
    private final int[] score;

    public Subject(String subjName, int[] score) {
        this.subjName = subjName;
        this.score = score;
    }

    @Override
    public double evaluate() {
        int totalScore = 0;
        for (int s : score) {
            totalScore += s;
        }
        return (double) totalScore / score.length;
    }

    @Override
    public char grade(double avgScore) {
        if (avgScore >= 70) {
            return 'P';
        } else {
            return 'F';
        }
    }

    @Override
    public String toString() {
        return subjName;
    }
}
