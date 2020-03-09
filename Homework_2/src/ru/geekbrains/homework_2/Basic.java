package ru.geekbrains.homework_2;

/*
        7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
        8 **** Не пользоваться вспомогательным массивом при решении задачи 7.
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class Basic {
    public static void main(String[] args){
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int [] arr2 = new int[8];
        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int [] arr4 = {1, 5, 3, 2, 11, 4, -1, 2, 4, 8, 9, 1};
        int [][] arr5 = new int [5][5];
        int [] arr6 = {1, 1, 1, 2, 1};
        int [] arr7 = {2, 1, 1, 2, 1};
        int [] arr8 = {10, 1, 2, 3, 4};

        Mas01(arr);
        Mas8(arr2);
        Multiplication(arr3);
        MinMax(arr4);
        Square(arr5);
        System.out.println(CheckBalance(arr6));
    }

   /* 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;*/
    public static void Mas01(int[] arr){
        for (int i=0; i<arr.length; i++){
            arr[i] = (arr[i]==0) ? 1 : 0; //if (arr[i]==0) arr[i]=1; else arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
    }

    /*2 Задать пустой целочисленный массив размером 8. Написать метод, который
    c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;*/
    public static void Mas8(int[] arr){
        arr[0] = 1;
        for (int i = 1; i < 8; i++){
            arr[i] = arr[i-1] + 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    /*3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
    принимающий на вход массив и умножающий числа меньше 6 на 2;*/
    public static void Multiplication (int[] arr){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < 6) arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    //4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
    public static void MinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println(min + " " + max);
    }

    /*5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
    заполнить его диагональные элементы единицами, используя цикл(ы);*/
    public static void Square(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (i==j || arr.length-1-i==j) arr[i][j] = 1;
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println();
        }
    }

    /*6 ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
    checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.*/
    public static boolean CheckBalance(int[] arr){
        int a = 0;
        int b = 0;
        int k = 1;
       for (int i = 0; i < arr.length-1; i++){
           a = arr[i] + a;
           b = 0;
           for (int j = k; j < arr.length; j++){
                b = arr[j] + b;
           }
           k++;
           if (a == b) break;
        }
        return a == b;
    }
}
