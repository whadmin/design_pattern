package com.geely.design.pattern.structural.composite.v2;

import java.util.List;

public class Word extends LetterComposite {
    public Word(List<Letter> letters) {
        for (Letter l : letters) {
            this.add(l);
        }
    }
    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}
