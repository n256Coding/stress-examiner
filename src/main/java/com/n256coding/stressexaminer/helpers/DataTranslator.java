package com.n256coding.stressexaminer.helpers;

import com.n256coding.stressexaminer.models.Question;

import java.util.ArrayList;
import java.util.List;

public class DataTranslator {
    public static String[] getArray(List<Question> questions) {
        List<String> strings = new ArrayList<>();
        for (Question question : questions) {
            strings.add(question.getQuestionId());
            strings.add(String.valueOf(question.getYesOrNo()));
        }

        return strings.toArray(new String[strings.size()]);
    }
}
