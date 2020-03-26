package ru.geekbrains.homework_7;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class FieldPanel extends JPanel {
    public static final int MODE_HVH = 0;
    public static final int MODE_HVA = 1;

    private static final int WINDOW_WIDTH = 500; //???

    FieldPanel() {
        setBackground(Color.BLUE); // ??, пропадает цвет
    }

    public void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.printf("damn mode: %d\nfield size: %d,\nwin length: %d\n", gameMode, fieldSizeX, winLength);
    }

    //Пока просто нарисовал, без привязки
    public void paint(Graphics g) {
        int hor;
        int vert;
        int grid = 3;
        int size_grid = WINDOW_WIDTH / grid;
//      super.paint(g);
        Graphics2D graph = (Graphics2D) g;
        graph.setPaint(new Color(20, 200, 20));
        for (hor = size_grid; hor <= WINDOW_WIDTH; hor += size_grid) {
            for (vert = size_grid; vert <= WINDOW_WIDTH; vert += size_grid)
                g.drawRect(0, 0, hor, vert);
        }
    }
}

/*
1. Полностью разобраться с кодом (попробовать полностью самостоятельно
переписать одно из окон)

2. Составить список вопросов и приложить в виде комментария к домашней
работе

3. * Расчертить панель Map на поле для игры, согласно fieldSize
* */
