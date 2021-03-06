package com.n256coding.stressexaminer.controllers;

import com.n256coding.stressexaminer.helpers.DataTranslator;
import com.n256coding.stressexaminer.models.Question;
import com.n256coding.stressexaminer.services.StressIdentifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/stress")
public class MainController {
    @Autowired
    StressIdentifier stressIdentifier;

    @PostMapping("/questions")
    public List<Map<String, String>> getQuestions(@RequestBody List<Question> questions) {
        String prediction = stressIdentifier.getPrediction(DataTranslator.getPSVString(questions));
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("stress", prediction);

        List<Map<String, String>> array = new ArrayList<>(1);
        array.add(map);
        return array;
    }
}
