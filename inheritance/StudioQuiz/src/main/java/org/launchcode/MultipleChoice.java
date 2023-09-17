package org.launchcode;

public class MultipleChoice extends Questions {
    private String questionAnswers;

    public MultipleChoice(String questionText, int pointValue, String questionAnswers) {
        super(questionText, pointValue);
        this.questionAnswers = questionAnswers;
    }

    public String getQuestionAnswers() {
        return questionAnswers;
    }

    @Override
    public String toString() {
        return null;
    }
}
