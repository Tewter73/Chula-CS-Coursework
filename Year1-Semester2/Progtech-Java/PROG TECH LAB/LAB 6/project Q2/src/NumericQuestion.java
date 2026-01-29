public class NumericQuestion extends Question {
    public NumericQuestion(String text) {
        super(text);
    }

    @Override
    public boolean checkAnswer(String response) {
        try {
            double userAnswer = Double.parseDouble(response);
            double correctAnswer = Double.parseDouble(getAnswer());
            return Math.abs(userAnswer - correctAnswer) <= 0.01;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
