import java.util.Scanner;
public class FillInQuestion extends Question {
    public FillInQuestion() {
        super();

    }
    public void constructQuestionAndAnswer(String questionText) {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        StringBuilder question = new StringBuilder(parser.next());
        String answer = parser.next();
        parser.close();
        question.append(" ");
        question.append("_ ".repeat(answer.length()));
        this.setText(question.toString());
        this.setAnswer(answer);
    }
}
