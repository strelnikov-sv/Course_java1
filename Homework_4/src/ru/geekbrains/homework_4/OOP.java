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
        Staff stuff1 = new Staff("Str", "Prog", 50000, 23);
        Staff stuff2 = new Staff("QQQ");

        System.out.println("Фамилия: " + stuff1.getName() + " Должность: " + stuff1.getPosition());
        System.out.println("Фамилия: " + stuff2.getName() + " Должность: " + stuff2.getPosition());
        System.out.println();

        Staff[] stuffArray = new Staff[5];
        stuffArray[0] = new Staff("Sergey", "Prog", 50000, 23);
        stuffArray[1] = new Staff("Ivan", "Prog", 51000, 33);
        stuffArray[2] = new Staff("Misha", "Prog", 10000, 43);
        stuffArray[3] = new Staff("Bobuk", "Prog", 150000, 53);
        stuffArray[4] = new Staff("Nik", "Prog", 5000, 13);

        for (int i = 0; i < stuffArray.length; i++) {
            if (stuffArray[i].getAge() > 40)
                System.out.println("Фамилия: " + stuffArray[i].getName() + " Должность: " + stuffArray[i].getPosition() + " Зарплата: " + stuffArray[i].getSalary() + " Возраст: " + stuffArray[i].getAge());
        }
    }

}
