import java.util.ArrayList;

public class ChoiceQuestion extends Question {
    private final ArrayList<String> choices = new ArrayList<>();

    public ChoiceQuestion(String text) {
        super(text);
    }

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct) {
            setAnswer(choice);
        }
    }

    @Override
    public void display() {
        super.display();
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ": " + choices.get(i));
        }
    }

    @Override
    public boolean checkAnswer(String response) {
        int choiceNumber = Integer.parseInt(response);
        return choices.get(choiceNumber-1).equals(getAnswer());
    }
}
