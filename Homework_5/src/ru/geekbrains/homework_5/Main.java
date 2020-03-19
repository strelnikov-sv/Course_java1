package ru.geekbrains.homework_5;

/*      Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.

        Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
        В качестве параметра каждому методу передается величина, означающая или длину
        препятствия (для бега и плавания), или высоту (для прыжков).

        У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.,
        Лошадь 1500 м., Птица 5 м.,; прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м.;
        плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).

        При попытке животного выполнить одно из этих действий, оно должно сообщить результат.
        (Например, dog1.run(150); -> результат: 'Пёсик пробежал!').*/

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat(200, 2);
        Dog d = new Dog(500, 0.5, 10);
        Bird b = new Bird(20, 0.2);
        Horse h = new Horse(1500, 3, 100);

        c.run(300); // не пробежал
        d.run(300); // пробежал
        b.run(300); // не пробежал
        h.run(300); // пробежал
        c.jump(1); // прыгнул
        d.jump(1); // не прыгнул
        b.jump(0.1); // прыгнул
        h.jump(1); // прыгнул
        d.swim(15); // не проплавал
        h.swim(15); // проплавал

        Animal[] zoo = {c, d, b, h};
        for (int i = 0; i < zoo.length; i++) {
            if (zoo[i].length < zoo[i].lengthMaxRun) {
                System.out.println(zoo[i].getClass().getName() + " пробежал");
            } else System.out.println(zoo[i].getClass().getName() + " НЕ пробежал");
            if (zoo[i].height < zoo[i].heightMaxJump) {
                System.out.println(zoo[i].getClass().getName() + " прыгнул");
            } else System.out.println(zoo[i].getClass().getName() + " НЕ прыгнул");
            if (zoo[i] instanceof Swim_Animal) {
                if (zoo[i].length < ((Swim_Animal) zoo[i]).lengthMaxSwim) {
                    System.out.println(zoo[i].getClass().getName() + " проплавал");
                } else System.out.println(zoo[i].getClass().getName() + " НЕ проплавал");
            }
        }

    }
}
