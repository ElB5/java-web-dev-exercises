package org.launchcode.java.StudioInheritance;

public class MultipleChoice extends Question {
//fields
    private String multipleChoiceQuestion = "Which city is located in Illinois?";



    //constructor
    public MultipleChoice(String multipleChoiceQuestion) {
        this.multipleChoiceQuestion = multipleChoiceQuestion;
    }

    //getters
    public String getMultipleChoiceQuestion() {
        return multipleChoiceQuestion;
    }


    //methods

}
