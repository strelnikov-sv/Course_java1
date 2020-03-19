package ru.geekbrains.homework_5;

public class Swim_Animal extends Animal {

    int lengthMaxSwim;

    public Swim_Animal(int lengthMaxRun, double heightMaxJump, int lengthMaxSwim) {
        super(lengthMaxRun, heightMaxJump);
        this.lengthMaxSwim = lengthMaxSwim;
    }

    public void swim(int length) {
        this.length = length;
    }
}
