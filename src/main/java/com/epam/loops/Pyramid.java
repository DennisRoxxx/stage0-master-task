package com.epam.loops;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
    int rowCount = 1;
        for (int i = cathetusLength; i > 0; i--)
        {
            for (int j = 2; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int j = rowCount; j >= 1; j--)
            {
                System.out.print(j);
            }
            for (int j = 2; j <= rowCount; j++)
            {
                System.out.print(j);
            }
            System.out.println();
            rowCount++;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
