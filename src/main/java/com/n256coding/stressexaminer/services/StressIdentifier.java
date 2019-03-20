package com.n256coding.stressexaminer.services;


import com.google.common.collect.Sets;
import org.springframework.stereotype.Service;
import quickdt.data.Attributes;
import quickdt.data.HashMapAttributes;
import quickdt.data.Instance;
import quickdt.predictiveModels.decisionTree.Tree;
import quickdt.predictiveModels.decisionTree.TreeBuilder;

import java.util.Set;

@Service
public class StressIdentifier {
    private final Set<Instance> instances = Sets.newHashSet();

    public StressIdentifier() {
        instances.add(HashMapAttributes.create("1", "yes",
                "2", "no",
                "3", "no",
                "4", "no",
                "5", "no",
                "6", "no",
                "7", "no",
                "8", "no",
                "9", "no",
                "10", "no").classification("sad"));
        instances.add(HashMapAttributes.create("1", "yes",
                "2", "yes",
                "3", "no",
                "4", "no",
                "5", "no",
                "6", "no",
                "7", "no",
                "8", "no",
                "9", "no",
                "10", "no").classification("no sad"));
        instances.add(HashMapAttributes.create("1", "yes",
                "2", "yes",
                "3", "yes",
                "4", "yes",
                "5", "no",
                "6", "no",
                "7", "no",
                "8", "no",
                "9", "no",
                "10", "no").classification("happy"));
        instances.add(HashMapAttributes.create("1", "yes",
                "2", "no",
                "3", "no",
                "4", "no",
                "5", "yes",
                "6", "no",
                "7", "no",
                "8", "yes",
                "9", "yes",
                "10", "no").classification("extremely happy"));
    }

    public String getPrediction(String[] questions) {
        TreeBuilder treeBuilder = new TreeBuilder();
        Tree tree = treeBuilder.buildPredictiveModel(instances);
        Attributes attributes = HashMapAttributes.create(questions);
        return tree.getClassificationByMaxProb(attributes).toString();
    }

}
