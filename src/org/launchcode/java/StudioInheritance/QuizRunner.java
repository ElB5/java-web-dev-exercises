package org.launchcode.java.StudioInheritance;

import java.util.ArrayList;

public abstract class QuizRunner {


    //constructor
    public QuizRunner() {
    }

    public static void main (String[] args) {

        ArrayList<String> multipleChoiceSelection= new ArrayList<>();
        multipleChoiceSelection.add("Chicago");
        multipleChoiceSelection.add("Kansas City");
        multipleChoiceSelection.add("Philadelphia");
        multipleChoiceSelection.add("Santa Fe");

        ArrayList<String> checkBoxSelection= new ArrayList<>();
        checkBoxSelection.add("plants");
        checkBoxSelection.add("humans");
        checkBoxSelection.add("animals");
        checkBoxSelection.add("cell phones");



//        System.out.println(multipleChoiceSelection);

    }
}
