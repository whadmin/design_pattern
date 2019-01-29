package com.geely.design.pattern.behavioral.command.v1;

public enum Visibility {

    VISIBLE("visible"), INVISIBLE("invisible");

    private String title;

    Visibility(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
