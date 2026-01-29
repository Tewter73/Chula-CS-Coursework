public class Secretary extends Employee implements Evaluation {
    private final int typingSpeed;
    private final int[] score;

    public Secretary(String name,int salary, int[] score, int typingSpeed) {
        super(name,salary);
        this.score = score;
        this.typingSpeed = typingSpeed;
    }

    @Override
    public double evaluate() {
        int totalScore = 0;
        for (int s : score) {
            totalScore += s;
        }
        return totalScore;
    }

    @Override
    public char grade(double score) {
        if (score >= 90) {
            setSalary(18000);
            return 'P';
        } else {
            return 'F';
        }
    }
}
