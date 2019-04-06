package com.n256coding.stressexaminer.services;


import machine.learning.decisiontrees.DecisionTree;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class StressIdentifier {

    public String getPrediction(String questions) {
        DecisionTree tree = new DecisionTree();
        // Train Decision Tree
        tree.train(new File("./vertebrate.psv"));

        // Classify new data
        return tree.classify(questions);
    }

}
