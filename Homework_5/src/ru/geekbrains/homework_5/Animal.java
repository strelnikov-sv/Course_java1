package ru.geekbrains.homework_5;

public class Animal {

    int lengthMaxRun;
    double heightMaxJump;

    public Animal (int lengthMaxRun, double heightMaxJump) {
        this.lengthMaxRun = lengthMaxRun;
        this.heightMaxJump = heightMaxJump;
    }

    int length;
    int height;

    public int run(int length) {
        this.length = length;
        return length;
    }

    public void swim(int length) {
        this.length = length;
    }

    public void jump(int height) {
        this.height = height;
    }
}
