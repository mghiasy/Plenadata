package com.example.Plenadata;

public class Result {
    private char firstNotRepLetter;
    private String orderedLetter;

    public char getFirstNotRepLetter() {
        return firstNotRepLetter;
    }

    public void setFirstNotRepLetter(char firstNotRepLetter) {
        this.firstNotRepLetter = firstNotRepLetter;
    }

    public String getOrderedLetter() {
        return orderedLetter;
    }

    public void setOrderedLetter(String orderedLetter) {
        this.orderedLetter = orderedLetter;
    }

    public Result(char firstNotRepLetter, String orderedLetter) {
        this.firstNotRepLetter = firstNotRepLetter;
        this.orderedLetter = orderedLetter;
    }
}
