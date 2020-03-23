package ru.geekbrains.homework_6;

import java.io.*;
import java.util.Scanner;

public class Text {

    public static void main(String[] args) throws IOException {

        //Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
        //Считаем, что они заданы по умолчанию
        String file1 = "text1.txt";
        String file2 = "text2.txt";
        String file3 = "text3.txt";

        merger(file1, file3);
        merger(file2, file3);
        System.out.println("Merged file1.txt and file2.txt to file3.txt");

        System.out.println("Find word: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println(find(file3, word));

        System.out.println("Find word in a directory: ");
        word = scan.nextLine();
        System.out.println(findFolder(file3, word));
    }

    //Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
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

    //* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (работаем только с латиницей).
    public static boolean find(String file, String word) throws FileNotFoundException {
        Scanner fileNew = new Scanner(new FileInputStream(file));
        String wordNew;
        while (fileNew.hasNext()) {
            wordNew = fileNew.next();
            if (wordNew.equals(word)) {
                return true;
            }
        }

        fileNew.close();
        return false;
    }

    //** Написать метод, проверяющий, есть ли указанное слово в папке
    //НЕ ДОДЕЛАНО
    private static boolean findFolder (String file, String word) throws IOException{
        File fileNew = new File(file);
        String[] fileArray = fileNew.list(); // превращаем все слова в файле в элементы массива
        for (int i = 0; i < fileArray.length; i++) {
            fileArray = new File(fileArray[i]); // неверно с типами?
            // идея около такой:
            if (fileArray.isFile()) {
                if (find(fileArray[i], word)) return true;
            }
        }
        return false;
    }
}
