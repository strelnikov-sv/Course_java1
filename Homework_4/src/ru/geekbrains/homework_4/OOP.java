package ru.geekbrains.homework_4;

        /*1.Создать класс "Сотрудник" с полями: Фамилия, зарплата, возраст, должность;
        2.	Конструктор класса должен заполнять эти поля при создании объекта;
        3.	Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
        4.	Вывести при помощи методов из пункта 3 ФИО и должность.
        5.	Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        6.	* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
        7.	* Подсчитать средние арифметические зарплаты и возраста сотрудников из п.5
        8.	*** Продумать конструктор таким образом, чтобы при создании каждому сотруднику
        рисваивался личный уникальный идентификационный порядковый номер
*/

public class OOP {

    public static void main(String[] args) {
        Staff stuff1 = new Staff();

/*        stuff1.name = "Str";
        stuff1.position = "Prog";
        stuff1.salary = 50000;
        stuff1.age = 23;*/

        System.out.println("Фамилия: " + stuff1.name + " Должность: " + stuff1.position + " Зарплата: " + stuff1.salary + " Возраст: " + stuff1.age);

    }

}
