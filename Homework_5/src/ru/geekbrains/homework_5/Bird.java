package ru.geekbrains.homework_5;

public class Bird extends Animal {

    public Bird(int lengthMaxRun, double heightMaxJump) {
        super(lengthMaxRun, heightMaxJump);
    }

    public int run(int length) {
        this.length = length;
        return length;
    }
}
