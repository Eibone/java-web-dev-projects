package org.launchcode;

public abstract class Questions {
    private String questionText;
    private int pointValue;

    public Questions(String questionText, int pointValue) {
        this.questionText = questionText;
        this.pointValue = pointValue;
    }

    public void displayQuestion() {
        System.out.println(questionText);
    }
    public String getQuestionText() {
        return questionText;
    }

    public double getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
    @Override
    public abstract String toString();
}
