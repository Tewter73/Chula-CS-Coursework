public class Secretary extends Employee implements Evaluation {
    private int typingSpeed;
    private int[] score;

    public Secretary(String name, int salary, int[] score, int typingSpeed) {
        super(name, salary);
        this.score = score;
        this.typingSpeed = typingSpeed;
    }

    @Override
    public double evaluate() {
        int total = 0;
        for (int s : score) {
            total += s;
        }
        return total;
    }

    @Override
    public char grade(double x) {
        if (x >= 90) {
            setSalary(18000);
            return 'P';
        } else {
            return 'F';
        }
    }
}
