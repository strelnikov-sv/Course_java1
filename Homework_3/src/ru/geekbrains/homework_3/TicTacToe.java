package ru.geekbrains.homework_3;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '_';

    private static int fieldSizeX;
    private static int fieldSizeY;
    private static char[][] field;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static void initField() {
        fieldSizeY = 5;
        fieldSizeX = 5;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.println("------");
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты хода X и Y (от 1 до 3) через пробел >>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        field[y][x] = DOT_HUMAN;
    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        field[y][x] = DOT_AI;

    }

    private static boolean isFieldFull() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char c) {
        // для 3x3
        /*int counterH;
        int counterV;
        int counterD = 0;
        for (int x = 0; x < fieldSizeX; x++) {
            counterH = 0;
            counterV = 0;
            for (int y = 0; y < fieldSizeY; y++) {
                if (field[x][y] == c) counterH += 1;
                if (field[y][x] == c) counterV += 1;
                if ((x == y || x == fieldSizeY - y - 1) & field[x][y] == c) counterD +=1;
            }
            if (counterH == fieldSizeX || counterV == fieldSizeX || counterD == fieldSizeX) return true;
        }
        return false;*/

        // !!! очень неоптимальный код, но исправно работает для lengthLine = 4 и 5x5
        int lengthLine = 4; // длина количества символов
        int sum = -1;
        for (int i = 0; i < fieldSizeX; i++) {
            sum += i + 1; // считаем общую сумму клеток
        }
        int summH; // сумма ячеек
        int counterH; // счетчик ячеек
        int summV;
        int counterV;
        int summD1 = sum; // для 5x5 это 14
        int counterD1 = 0;
        int summD2 = sum;
        int counterD2 = 0;
        for (int x = 0; x < fieldSizeX; x++) {
            summH = sum;
            counterH = 0;
            for (int y = 0; y < fieldSizeY; y++) {
                if (field[x][y] == c) {
                    summH -= (y + 1); // вычитаем из общей суммы
                    counterH += 1; // складываем, пока не дойдем до lengthLine
                }
                if (x == y && field[x][y] == c) {
                    summD1 -= x + 1;
                    counterD1 += 1;
                }
                if (x == fieldSizeY - y - 1 && field[x][y] == c) {
                    summD2 -= x + 1;
                    counterD2 += 1;
                }
                if ((summH == 0 || summH == 4) && counterH == lengthLine || (summD1 == 0 || summD1 == 4) && counterD1 == lengthLine || (summD2 == 0 || summD2 == 4) && counterD2 == lengthLine)
                    return true; // сейчас условие привязано к lengthLine = 4, надо исправить
                // проверяем карту на крайние значения
            }
        }
        for (int x = 0; x < fieldSizeX; x++) {
            summV = sum;
            counterV = 0;
            for (int y = 0; y < fieldSizeY; y++) {
                if (field[y][x] == c) {
                    summV -= y + 1;
                    counterV += 1;
                }
            }
            if ((summV == 0 || summV == 4) && counterV == lengthLine)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
//        while (true) {
        playOneRound();
//            System.out.println("Play again?");
//            if (SCANNER.next().equals("no"))
//                break;
//        }
    }

    private static void playOneRound() {
        initField();
        printField();
        while (true) {
            humanTurn();
            printField();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Выиграл игрок!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printField();
            if (checkWin(DOT_AI)) {
                System.out.println("Выиграл компьютер!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

}