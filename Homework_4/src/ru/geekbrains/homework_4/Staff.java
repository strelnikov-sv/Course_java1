package ru.geekbrains.homework_4;

public class Staff {
    private String name;
    private String position;
    private int salary;
    private int age;

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Staff(String name, String position, int salary, int age) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.age = age;
    }

    public Staff(String name) {
        this.name = name;
        this.position = "ERROR";
        this.salary = 1000000;
        this.age = 99;
    }
}
