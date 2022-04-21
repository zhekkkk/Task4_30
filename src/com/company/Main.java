package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] order = {5,2,7,1,15};
        String[] data = {"собака", "не", "а", "я", "человек"};
        System.out.print(Arrays.toString(order));
        System.out.print(", ");
        System.out.print(Arrays.toString(data));
        sort(data, order);
        System.out.print(" -> ");
        System.out.print(Arrays.toString(order));
        System.out.print(", ");
        System.out.println(Arrays.toString(data));
    }

    public static <T> void sort(T[] data, int[] orderValues) {
        int k = orderValues.length;
        for (int i = 1; i < k - 1; i++) {
            for (int j = k - 1; j >= i; j--) {
                if (orderValues[j - 1] > orderValues[j]) {
                    int temp1 = orderValues[j - 1];
                    T temp2 = data[j-1];
                    orderValues[j - 1] = orderValues[j];
                    data[j - 1] = data[j];
                    orderValues[j] = temp1;
                    data[j] = temp2;
                }
            }
        }
    }
}