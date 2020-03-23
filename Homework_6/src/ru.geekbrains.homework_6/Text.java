package ru.geekbrains.homework_6;

import java.io.*;
import java.util.Scanner;

public class Text {
    /*Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
    Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
    * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (работаем только с латиницей).
    ** Написать метод, проверяющий, есть ли указанное слово в папке*/

    public static void main(String[] args) throws IOException {

        String file1 = "D:\\OneDrive\\Обучение\\Курсы\\Geekbrains\\Java Уровень 1\\Course_java1\\Homework_6\\text1.txt";
        String file2 = "D:\\OneDrive\\Обучение\\Курсы\\Geekbrains\\Java Уровень 1\\Course_java1\\Homework_6\\text2.txt";
        String file3 = "D:\\OneDrive\\Обучение\\Курсы\\Geekbrains\\Java Уровень 1\\Course_java1\\Homework_6\\text3.txt";
        
        merger(file1, file3);
        merger(file2, file3);
        System.out.println("Merged file1.txt and file2.txt to file3.txt");
    }

    public static void merger(String file1, String file2) throws FileNotFoundException {
        Scanner f1 = new Scanner(new FileInputStream(file1));
        PrintStream f2 = new PrintStream(new FileOutputStream(file2, true));
        while (f1.hasNext()) {
            f2.println(f1.nextLine());
        }
        f2.flush();
        f1.close();
        f2.close();
    }

}
