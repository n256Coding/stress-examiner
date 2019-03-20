package com.n256coding.stressexaminer.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
public class Question {
    @Getter @Setter
    private String questionId;

    @Getter @Setter
    private String yesOrNo;
}
