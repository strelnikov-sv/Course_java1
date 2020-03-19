package ru.geekbrains.homework_5;

public class Horse extends Animal {

    int lengthMaxSwim;

    public Horse (int lengthMaxRun, double heightMaxJump, int lengthMaxSwim) {
        super(lengthMaxRun, heightMaxJump);
        this.lengthMaxSwim =lengthMaxSwim;
    }
}
