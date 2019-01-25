package com.geely.design.pattern.structural.composite.v2;

import java.util.ArrayList;
import java.util.List;

public abstract class LetterComposite {
    private List<LetterComposite> children = new ArrayList<LetterComposite>();
    public void add(LetterComposite letter) {
        children.add(letter);
    }
    public int count() {
        return children.size();
    }
    protected void printThisBefore() {}
    protected void printThisAfter() {}
    public void print() {
        printThisBefore();
        for (LetterComposite letter : children) {
            letter.print();
        }
        printThisAfter();
    }
}

