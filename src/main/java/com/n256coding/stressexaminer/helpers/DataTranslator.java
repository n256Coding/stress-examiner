package com.n256coding.stressexaminer.helpers;

import com.n256coding.stressexaminer.models.Question;

import java.util.ArrayList;
import java.util.List;

public class DataTranslator {
    public static String getPSVString(List<Question> questions) {
        List<String> sortedAnswers = new ArrayList<>(questions.size());

        for (Question question : questions) {
            sortedAnswers.add(Integer.parseInt(question.getQuestion_id()) - 1, question.getAnswer());
        }

        return String.join("|", sortedAnswers);
    }
}
