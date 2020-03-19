package ru.geekbrains.homework_5;

public class Animal {

    int lengthMaxRun;
    double heightMaxJump;

    public Animal(int lengthMaxRun, double heightMaxJump) {
        this.lengthMaxRun = lengthMaxRun;
        this.heightMaxJump = heightMaxJump;
    }

    int length;
    double height;

    public void run(int length) {
        this.length = length;
    }


    public void jump(double height) {
        this.height = height;
    }
}
