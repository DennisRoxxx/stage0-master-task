package com.epam.loops;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int sum = 0;

        for (int i = 1; i <= 1; i++){
            sum = numberToPrint;
        }

        for (int i = 2; i <= power; i++){
            sum = sum * numberToPrint;
        }
        System.out.println(sum);
        
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
