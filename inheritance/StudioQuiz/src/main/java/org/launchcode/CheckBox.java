package org.launchcode;
import java.util.ArrayList;
public class CheckBox extends Questions{
    private final ArrayList<String> answers;

    public CheckBox(String questionText, int pointValue, ArrayList<String> answers) {
        super(questionText, pointValue);
        this.answers = answers;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        return getQuestionText() + "/n" + answers;
    }
}
