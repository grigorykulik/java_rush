package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/

/**
 * 1. Дан двумерный массив N*N, который содержит несколько прямоугольников.
 * 2. Различные прямоугольники не соприкасаются и не накладываются.
 * 3. Внутри прямоугольник весь заполнен 1.
 * 4. В массиве:
 * 4.1) a[i, j] = 1, если элемент (i, j) принадлежит какому-либо прямоугольнику
 * 4.2) a[i, j] = 0, в противном случае
 * 5. getRectangleCount должен возвращать количество прямоугольников.
 * 6. Метод main не участвует в тестировании
 *
 *
 * Требования:
 * 1.	В классе Solution должен существовать метод getRectangleCount с одним параметром типа byte[][].
 * 2.	Метод getRectangleCount должен быть публичным.
 * 3.	Метод getRectangleCount должен быть статическим.
 * 4.	Метод getRectangleCount должен возвращать количество прямоугольников (в соответствии с заданием)
 * найденное в полученном массиве.
 */

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        byte[][] a3 = new byte[][]{
                {1, 1},
                {1, 1},
                {1, 1}
        };

        System.out.println(a3.length);
        System.out.println(a3[0].length);

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        boolean isCorner = false;
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i > 0 && a[i - 1][j] == 1) {
                    isCorner = true;
                }

                if (a[i][j] == 1 && !isCorner) {
                    isCorner = true;
                    if (isCorner) counter++;
                }

                if (a[i][j] == 0 && isCorner) {
                    isCorner = false;
                }

            }
        }
        return counter;
    }
}
