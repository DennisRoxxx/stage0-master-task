package com.epam.conditions;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        
        int temp = first;
        first = second;
        second = temp;

        System.out.println(first);
        System.out.println(second);
     }
}
