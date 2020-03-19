package ru.geekbrains.homework_5;

public class Dog extends Animal {

    int lengthMaxSwim;
    public Dog (int lengthMaxRun, double heightMaxJump, int lengthMaxSwim) {
        super(lengthMaxRun, heightMaxJump);
        this.lengthMaxSwim =lengthMaxSwim;
    }
}
