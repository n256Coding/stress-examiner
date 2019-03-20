package com.n256coding.stressexaminer.controllers;

import com.n256coding.stressexaminer.helpers.DataTranslator;
import com.n256coding.stressexaminer.models.Question;
import com.n256coding.stressexaminer.services.StressIdentifier;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stress")
public class MainController {
    @Autowired
    StressIdentifier stressIdentifier;

    @GetMapping("/questions")
    public Pair<String, String> getQuestions(List<Question> questions) {
        String prediction = stressIdentifier.getPrediction(DataTranslator.getArray(questions));
        return new Pair<>("stress", prediction);
    }
}
